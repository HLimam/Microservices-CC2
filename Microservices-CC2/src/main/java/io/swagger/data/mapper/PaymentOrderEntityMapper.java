package io.swagger.data.mapper;

import io.swagger.data.entity.PaymentOrderEntity;
import io.swagger.model.PaymentOrder;

public class PaymentOrderEntityMapper {
    public static PaymentOrder toModel(PaymentOrderEntity entity){
        return PaymentOrder.builder()
                .paymentOrderId(entity.getPaymentOrderId())
                .amount(entity.getAmount())
                .currency(entity.getCurrency())
                .sellerAccount(entity.getSellerAccount())
                .build();
    }

    public static PaymentOrderEntity toEntity(PaymentOrder model){
        return PaymentOrderEntity.builder()
                .paymentOrderId(model.getPaymentOrderId())
                .amount(model.getAmount())
                .currency(model.getCurrency())
                .sellerAccount(model.getSellerAccount())
                .build();
    }
}
