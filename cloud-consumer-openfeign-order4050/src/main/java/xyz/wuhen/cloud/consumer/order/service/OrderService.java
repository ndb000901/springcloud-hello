package xyz.wuhen.cloud.consumer.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;

@Service
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface OrderService {
    @GetMapping("/payment/ribbon")
    public String paymentRibbon();

    @GetMapping(value = "/payment/openfeign/timeout")
    public String timeout();
}
