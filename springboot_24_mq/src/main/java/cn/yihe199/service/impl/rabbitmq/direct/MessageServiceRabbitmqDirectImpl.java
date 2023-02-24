//package cn.yihe199.service.impl.rabbitmq.direct;
//
//import org.springframework.amqp.core.AmqpTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import cn.yihe199.service.MessageService;
//
////@Service
//public class MessageServiceRabbitmqDirectImpl implements MessageService {
//    @Autowired
//    private AmqpTemplate amqpTemplate;
//
//    @Override
//    public void sendMessage(String id) {
//        System.out.println("Rabbit 待发送短信的订单已经进入处理队列:" + id);
//        amqpTemplate.convertAndSend("direct_exchange", "direct", id);
//        amqpTemplate.convertAndSend("direct_exchange2", "direct2", "two :" + id);
//    }
//
//    @Override
//    public String doMessage() {
//        return null;
//    }
//}
