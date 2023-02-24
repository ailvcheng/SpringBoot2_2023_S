package cn.yihe199.service.impl.kafka.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @KafkaListener(topics = {"yiheKafkaTopic"})
    private void onMessage(ConsumerRecord<String,String> record){
        System.out.println("已完成发送kafka： "+record.value());

    }
}
