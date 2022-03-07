package xyz.wuhen.cloud.alibaba.nacos.consumer.service;

import org.springframework.stereotype.Component;
import xyz.wuhen.cloud.api.commons.entities.CommonResult;
import xyz.wuhen.cloud.api.commons.entities.Payment;

@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(444,"服务降级返回,没有该流水信息",new Payment(id, "errorSerial......"));
    }
}