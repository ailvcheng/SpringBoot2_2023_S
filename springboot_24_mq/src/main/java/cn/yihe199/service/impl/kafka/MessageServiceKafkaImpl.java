package cn.yihe199.service.impl.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

import cn.yihe199.service.MessageService;

@Service
public class MessageServiceKafkaImpl implements MessageService {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void sendMessage(String id) {
        System.out.println("待发送短信的订单已经纳入消息队列（kafka）： " + id);
        final ListenableFuture<SendResult<String, String>> yiheKafkaTopic = kafkaTemplate.send("yiheKafkaTopic", id);
    }

    @Override
    public String doMessage() {
        return null;
    }
}
