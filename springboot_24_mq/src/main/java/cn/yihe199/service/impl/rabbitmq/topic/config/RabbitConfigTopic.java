//package cn.yihe199.service.impl.rabbitmq.topic.config;
//
//
//import org.springframework.amqp.core.Binding;
//import org.springframework.amqp.core.BindingBuilder;
//import org.springframework.amqp.core.Queue;
//import org.springframework.amqp.core.TopicExchange;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//
//@Configuration
//public class RabbitConfigTopic {
//
//    @Bean
//    public Queue topicQueue() {
//
////        return new Queue("topic_queue", true, true, true);
//        return new Queue("topic_queue");
//    }
//
//    @Bean
//    public Queue topicQueue2() {
//
////        return new Queue("topic_queue", true, true, true);
//        return new Queue("topic_queue2");
//    }
//
//    @Bean
//    public TopicExchange topicExchange() {
//        return new TopicExchange("topic_exchange");
//    }
//
//    /**
//     * 绑定交换机与队列
//     *
//     * @return
//     */
//    @Bean
//    public Binding bindingTopic() {
//        //通配，*，匹配成功才进入 消息队列
//        // # 任意数量，   * 任意单词
//        return BindingBuilder.bind(topicQueue()).to(topicExchange()).with("topic.*.id");
//    }
//
//    @Bean
//    public Binding bindingTopic2() {
//        return BindingBuilder.bind(topicQueue2()).to(topicExchange()).with("topic.order.*");
//    }
//}
