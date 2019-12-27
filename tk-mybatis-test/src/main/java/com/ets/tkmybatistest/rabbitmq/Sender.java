package com.ets.tkmybatistest.rabbitmq;

import com.ets.tkmybatistest.util.ConnectionUtils;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.BasicProperties;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

import java.io.IOException;

/**
*@Author DoubleC
*@Description TODO
*@Date 2019/10/28 11:17
**/
public class Sender {

    private final static String QUEUE_NAME = "a_test_queue";

    public static void main(String[] args) throws Exception {
        //commonSender();
        fanoutSender();
    }


    // 点对点消息生产者
    public void commonSender() throws Exception {
        // 获取连接
        Connection connetcion = ConnectionUtils.getConnetcion();
        // 创建通道
        Channel channel = connetcion.createChannel();
        // 声明创建队列
        //1 队列名称  2 是否持久化
        channel.queueDeclare(QUEUE_NAME,true,false,false,null);
        // 消息内容
        String message = "hello rabbit";
        /*while (true){
            channel.basicPublish("",QUEUE_NAME,null,message.getBytes());
        }*/
        // 第一个参数为交换机名称  第二个：队列名称  第三个 ：持久化配置  第四个：消息的字节数组
        AMQP.BasicProperties.Builder properties = new AMQP.BasicProperties.Builder();
        properties.deliveryMode(2);
        channel.basicPublish("",QUEUE_NAME,properties.build(),message.getBytes());
        channel.close();
        connetcion.close();
    }


    // 竞争者模式消息生产者
    private static void workSender() throws Exception {
        // 获取连接
        Connection connetcion = ConnectionUtils.getConnetcion();
        // 创建通道
        Channel channel = connetcion.createChannel();
        // 声明创建队列
        channel.queueDeclare(QUEUE_NAME,false,false,false,null);
        // 消息内容
        for (int i = 0;i<1000 ; i++){
            String message = "第"+i+"条消息:"+"hello rabbit";
            channel.basicPublish("",QUEUE_NAME,null,message.getBytes());
        }
        //channel.basicPublish("",QUEUE_NAME,null,message.getBytes());
        channel.close();
        connetcion.close();
    }


    // 订阅模式：广播 fanout
    private static void fanoutSender() throws Exception {
        // 获取连接
        Connection connetcion = ConnectionUtils.getConnetcion();
        // 创建通道
        Channel channel = connetcion.createChannel();
        // 声明交换机
        channel.exchangeDeclare("a_fanout_exchange","fanout");
        String message = "hello rabbit";
        channel.basicPublish("a_fanout_exchange","",null,message.getBytes());
        channel.close();
        connetcion.close();

    }



}
