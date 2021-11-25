package xyz.wuhen.cloud.provider.payment.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.wuhen.cloud.api.commons.entities.Payment;
import xyz.wuhen.cloud.provider.payment.dao.PaymentDao;
import xyz.wuhen.cloud.provider.payment.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
