//package cn.yihe199.service.impl.rocketmq;
//
//import org.apache.rocketmq.client.producer.SendCallback;
//import org.apache.rocketmq.client.producer.SendResult;
//import org.apache.rocketmq.spring.core.RocketMQTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import cn.yihe199.service.MessageService;
//
//@Service
//public class MessageServiceRocketmqImpl implements MessageService {
//
//    @Autowired
//    private RocketMQTemplate rocketMQTemplate;
//
//    @Override
//    public void sendMessage(String id) {
//        System.out.println("待发送短信的订单已经纳入消息队列（rocketmq）： " + id);
//        //同步发送
////        rocketMQTemplate.convertAndSend("orderId", id);
//
//        rocketMQTemplate.asyncSend("orderId", id, new SendCallback() {
//            @Override
//            public void onSuccess(SendResult sendResult) {
//                System.out.println("消息发送成功：rocket,id =  " + id);
//            }
//            @Override
//            public void onException(Throwable throwable) {
//                System.out.println("！消息发送失败：rocket,id =  " + id);
//            }
//        });
//    }
//
//    @Override
//    public String doMessage() {
//        return null;
//    }
//}
