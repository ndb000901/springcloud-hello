package xyz.wuhen.cloud.consumer.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.wuhen.cloud.consumer.order.service.OrderService;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/consumer/payment/ribbon")
    public String order() {
        return orderService.paymentRibbon();
    }
    @GetMapping(value = "/consumer/payment/openfeign/timeout")
    public String timeout() {
        return orderService.timeout();
    }

}
