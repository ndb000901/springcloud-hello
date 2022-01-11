package xyz.wuhen.cloud.consumer.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT",fallback = OrderFallBackService.class)
public interface OrderService {
    @GetMapping("/payment/hystrix/ok")
    public String paymentOk();

    @GetMapping("/payment/hystrix/timeout")
    public String paymentTimeOut();
}
