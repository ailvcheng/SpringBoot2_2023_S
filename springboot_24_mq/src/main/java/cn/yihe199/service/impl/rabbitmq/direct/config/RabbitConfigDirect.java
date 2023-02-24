//package cn.yihe199.service.impl.rabbitmq.direct.config;
//
//
//import org.springframework.amqp.core.Binding;
//import org.springframework.amqp.core.BindingBuilder;
//import org.springframework.amqp.core.DirectExchange;
//import org.springframework.amqp.core.Queue;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//
//@Configuration
//public class RabbitConfigDirect {
//
//    @Bean
//    public Queue directQueue() {
////        return new Queue("direct_queue", true, true, true);
//        return new Queue("direct_queue");
//    }
//
//    @Bean
//    public Queue directQueue2() {
//
////        return new Queue("direct_queue", true, true, true);
//        return new Queue("direct_queue2");
//    }
//
//    @Bean
//    public DirectExchange directExchange() {
//        return new DirectExchange("direct_exchange");
//    }
//
//    @Bean
//    public DirectExchange directExchange2() {
//        return new DirectExchange("direct_exchange2");
//    }
//
//    /**
//     * 绑定交换机与队列
//     *
//     * @return
//     */
//    @Bean
//    public Binding bindingDirect() {
//        return BindingBuilder.bind(directQueue()).to(directExchange()).with("direct");
//    }
//
//    @Bean
//    public Binding bindingDirect2() {
//        return BindingBuilder.bind(directQueue2()).to(directExchange2()).with("direct2");
//    }
//}
