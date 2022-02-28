package xyz.wuhen.cloud.stream.rabbitmq.provider.service.impl;


import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;
import xyz.wuhen.cloud.stream.rabbitmq.provider.service.IMessageProvider;

import javax.annotation.Resource;
import java.util.UUID;

@Component
@EnableBinding(Source.class) // 可以理解为是一个消息的发送管道的定义
public class MessageProviderImpl implements IMessageProvider {

    @Resource
    public MessageChannel output;

    @Override
    public String send() {
        String msg = UUID.randomUUID().toString();
        this.output.send(MessageBuilder.withPayload(msg).build());
        System.out.println("msg---> " + msg);
        return msg;
    }
}
