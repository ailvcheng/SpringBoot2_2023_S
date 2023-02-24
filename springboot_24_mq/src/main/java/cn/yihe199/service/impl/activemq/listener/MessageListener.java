package cn.yihe199.service.impl.activemq.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * 消息队列监听
 */
//@Component
public class MessageListener {

    @JmsListener(destination = "order.queue.id")
    @SendTo("order.other.queue.id")   //转发已经处理，需要有返回值
    public String receive(String id) {
        System.out.println("已完成短信发送业务，id：" + id);
        return "sendTo" + id;
    }
}
