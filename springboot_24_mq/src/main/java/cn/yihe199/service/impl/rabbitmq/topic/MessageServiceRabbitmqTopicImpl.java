//package cn.yihe199.service.impl.rabbitmq.topic;
//
//import org.springframework.amqp.core.AmqpTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import cn.yihe199.service.MessageService;
//import cn.yihe199.service.impl.rabbitmq.topic.config.RabbitConfigTopic;
//
//@Service
//public class MessageServiceRabbitmqTopicImpl implements MessageService {
//    @Autowired
//    private AmqpTemplate amqpTemplate;
//
//    /**
//     * {@link RabbitConfigTopic#bindingTopic()}
//     *
//     * @param id
//     */
//    @Override
//    public void sendMessage(String id) {
//        System.out.println("Rabbit 待发送短信的订单已经进入处理队列Topic:" + id);
//        //通配匹配,匹配到多个时候，一次发送进入多个消息队列
//        String routingKey = "topic.order.id";
//        amqpTemplate.convertAndSend("topic_exchange", routingKey, " :" + id);
//    }
//
//    @Override
//    public String doMessage() {
//        return null;
//    }
//}
