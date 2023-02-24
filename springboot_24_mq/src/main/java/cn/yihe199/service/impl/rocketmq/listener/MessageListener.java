//package cn.yihe199.service.impl.rocketmq.listener;
//
//import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
//import org.apache.rocketmq.spring.core.RocketMQListener;
//import org.springframework.stereotype.Component;
//
//@Component
//@RocketMQMessageListener(consumerGroup = "group_rocketmq", topic = "orderId")
//public class MessageListener implements RocketMQListener<String> {
//    @Override
//    public void onMessage(String o) {
//        System.out.println("已完成短信发送业务(rocketmq)，id：" + o);
//    }
//}
