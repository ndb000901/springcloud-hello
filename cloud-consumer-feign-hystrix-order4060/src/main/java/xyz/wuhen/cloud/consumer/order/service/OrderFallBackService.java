package xyz.wuhen.cloud.consumer.order.service;

import org.springframework.stereotype.Component;

@Component
public class OrderFallBackService implements OrderService {
    @Override
    public String paymentOk() {
        return "OrderFallBackService--->paymentOk";
    }

    @Override
    public String paymentTimeOut() {
        return "OrderFallBackService----->paymentTimeOut";
    }
}
