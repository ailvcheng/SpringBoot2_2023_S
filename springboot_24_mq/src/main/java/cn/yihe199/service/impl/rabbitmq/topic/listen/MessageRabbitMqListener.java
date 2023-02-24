package cn.yihe199.service.impl.rabbitmq.topic.listen;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageRabbitMqListener {

    @RabbitListener(queues = {"topic_queue"})
    private void receive(String id) {
        System.out.println("\n-------------1-----------");
        System.out.println("Rabbit 发送消息1 topic： " + id + "\n");
    }

    @RabbitListener(queues = {"topic_queue2"})
    private void receive2(String id) {
        System.out.println("\n-------------222222222222222-----------");
        System.out.println("Rabbit 发送消息2 topic：" + id + "\n");
    }
}
