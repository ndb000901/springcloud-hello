package xyz.wuhen.cloud.provider.payment.service;

import org.apache.ibatis.annotations.Param;
import xyz.wuhen.cloud.api.commons.entities.Payment;


public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
