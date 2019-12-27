package com.ets.tkmybatistest.rabbitmq;

import com.ets.tkmybatistest.util.ConnectionUtils;
import com.rabbitmq.client.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;


/**
*@Author DoubleC
*@Description TODO
*@Date 2019/10/28 13:58
**/
public class Reciveder {

    private final static String QUEUE_NAME = "a_test_queue";

    public static void main(String[] args) throws Exception {
        //workRecv1();
        //workRecv2();

    }



    // 点对点的消息消费者
    public void commonRecv() throws Exception {
        // 获取到连接以及mq通道
        Connection connection = ConnectionUtils.getConnetcion();
        // 从连接中创建通道
        Channel channel = connection.createChannel();
        // 声明队列
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        // 定义队列的消费者
        DefaultConsumer consumer = new DefaultConsumer(channel){
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties,
                                       byte[] body) throws IOException {
                // body 即消息体
                String msg = new String(body);
                System.out.println(" [x] received : " + msg + "!");
            }
        };
        // 监听队列
        channel.basicConsume(QUEUE_NAME, true, consumer);
    }




    // 竞争者模式消费者1
    private static void workRecv1() throws Exception {
        // 获取连接
        Connection connetcion = ConnectionUtils.getConnetcion();
        // 创建通道
        Channel channel = connetcion.createChannel();
        // 声明创建队列
        channel.queueDeclare(QUEUE_NAME,false,false,false,null);

        // 同一时刻服务器只会发一条消息给消费者
        channel.basicQos(1); // 为0或者不设置轮询分发  为1公平分发  公平分发必须手动确认

        // 定义队列的消费者
        DefaultConsumer consumer = new DefaultConsumer(channel){
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties,
                                       byte[] body) throws IOException {
                // body 即消息体
                String msg = new String(body);
                System.out.println(" [x] received : " + msg + "!===>1");
                channel.basicAck(envelope.getDeliveryTag(),false);
            }
        };
        // 监听队列
        // channel.basicConsume(QUEUE_NAME, true, consumer);
        channel.basicConsume(QUEUE_NAME, false, consumer);// true为自动确认消息  false为手动确认消息

    }


    // 竞争者模式消费者2
    private  static void workRecv2() throws Exception {
        // 获取连接
        Connection connetcion = ConnectionUtils.getConnetcion();
        // 创建通道
        Channel channel = connetcion.createChannel();
        // 声明创建队列
        channel.queueDeclare(QUEUE_NAME,false,false,false,null);

        // 同一时刻服务器只会发一条消息给消费者
        channel.basicQos(1);
        // 定义队列的消费者
        DefaultConsumer consumer = new DefaultConsumer(channel){
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties,
                                       byte[] body) throws IOException {
                // body 即消息体
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String msg = new String(body);
                System.out.println(" [x] received : " + msg + "!=================>2");
                channel.basicAck(envelope.getDeliveryTag(),false);
            }
        };
        // 监听队列
        channel.basicConsume(QUEUE_NAME, false, consumer);
    }


    // 订阅模式消费者1
    private static void fanoutConsumer1() throws Exception {
        // 获取到连接
        Connection connetcion = ConnectionUtils.getConnetcion();
        // 获取通道
        Channel channel = connetcion.createChannel();
        // 声明队列
        channel.queueDeclare("a_test_fanout_q_1", false, false, false, null);

        // 绑定队列到交换机
        channel.queueBind("a_test_fanout_q_1", "a_fanout_exchange", "");

        // 定义队列的消费者
        Consumer consumer = new DefaultConsumer(channel) {
            // 获取消息，并且处理，这个方法类似事件监听，如果有消息的时候，会被自动调用
            //@Override
            public void handleDelivery(String consumerTag, Envelope envelope, BasicProperties properties,
                                       byte[] body) throws IOException {
                // body 即消息体
                String msg = new String(body);
                System.out.println(" [消费者1] received : " + msg + "!");
            }
        };
        // 监听队列，自动返回完成
        channel.basicConsume("a_test_fanout_q_1", true, consumer);
    }



}
