package io.swagger.data.mapper;

import io.swagger.data.entity.PaymentEntity;
import io.swagger.model.Payment;

import java.util.stream.Collectors;

public class PaymentEntityMapper {

    public static Payment toModel(PaymentEntity entity){
        return Payment.builder()
                .buyerInfo(BuyerEntityMapper.toModel(entity.getBuyerInfo()))
                .chackoutId(entity.getChackoutId())
                .creditCardInfo(CreditCardEntityMapper.toModel(entity.getCreditCardInfo()))
                .paymentOrders(entity.getPaymentOrders().stream().map(PaymentOrderEntityMapper::toModel).collect(Collectors.toList()))
                .build();
    }

    public static PaymentEntity toEntity(Payment model){
        return PaymentEntity.builder()
                .buyerInfo(BuyerEntityMapper.toEntity(model.getBuyerInfo()))
                .chackoutId(model.getChackoutId())
                .creditCardInfo(CreditCardEntityMapper.toEntity(model.getCreditCardInfo()))
                .paymentOrders(model.getPaymentOrders().stream().map(PaymentOrderEntityMapper::toEntity).collect(Collectors.toList()))
                .build();
    }
}
