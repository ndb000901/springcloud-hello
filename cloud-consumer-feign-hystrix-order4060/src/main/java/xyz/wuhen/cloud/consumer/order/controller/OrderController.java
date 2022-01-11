package xyz.wuhen.cloud.consumer.order.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.wuhen.cloud.consumer.order.service.OrderService;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/consumer/payment/hystrix/ok")
    public String paymentOk() {
        return orderService.paymentOk();
    }

    @GetMapping("/consumer/payment/hystrix/timeout")
    @HystrixCommand(fallbackMethod = "paymentTimeOutFallBack",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value="1500")
    })
    public String paymentTimeOut() {
        return orderService.paymentTimeOut();
    }

    public String paymentTimeOutFallBack() {
        return "Thread: " + Thread.currentThread().getName() + "paymentTimeOutFallBack";
    }
}
