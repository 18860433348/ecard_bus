package com.ets.tkmybatistest.util;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
*@Author DoubleC
*@Description 获取与mq服务的连接
*@Date 2019/10/28 11:01
**/
public class ConnectionUtils {

    public static Connection getConnetcion(){
        // 连接工厂
        ConnectionFactory connectionFactory = new ConnectionFactory();
        // mq服务所在主机地址
        connectionFactory.setHost("localhost");
        // mq服务端口
        connectionFactory.setPort(5672);
        // 设置账号密码和虚拟主机
        connectionFactory.setVirtualHost("testhost");
        connectionFactory.setUsername("xiaochuan");
        connectionFactory.setPassword("123456");
        Connection connection = null;
        try {
            connection = connectionFactory.newConnection();
        } catch (IOException | TimeoutException e) {
            e.printStackTrace();
        }
        return connection;

    }

}
