package cn.yihe199.service.impl.activemq.listener;

import org.springframework.jms.annotation.JmsListener;

/**
 * 消息队列监听
 */
//@Component
public class MessageListener2 {
    @JmsListener(destination = "order.other.queue.id")
    public String receive01(String id) {
        System.out.println("接受流水线id: " + id);
        //若不需要转发，不可返回值
        return null;
    }
}
