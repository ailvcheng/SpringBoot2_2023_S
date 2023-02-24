package cn.yihe199.service.impl.rabbitmq.direct.listen;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

//@Component
public class MessageRabbitMqListener {

//    @RabbitListener(queues = {"direct_queue"})
    private void receive(String id) {
        System.out.println("\n-------------1-----------");
        System.out.println("Rabbit 发送消息 direct：" + id + "\n");
    }

    /**
     * 监听同一个时候，轮询接收
     * @param id
     */
//    @RabbitListener(queues = {"direct_queue"})
    private void receive2(String id) {
        System.out.println("\n-------------2-----------");
        System.out.println("Rabbit2 发送消息 direct：" + id + "\n");
    }

}
