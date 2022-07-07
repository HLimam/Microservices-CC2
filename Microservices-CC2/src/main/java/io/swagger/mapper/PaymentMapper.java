package io.swagger.mapper;

import io.swagger.dto.request.PaymentRequest;
import io.swagger.model.Payment;

import java.util.stream.Collectors;

public class PaymentMapper {

    public static Payment toModel(PaymentRequest request){
        return Payment.builder()
                .buyerInfo(BuyerMapper.toModel(request.getBuyerInfo()))
                .chackoutId(request.getChackoutId())
                .creditCardInfo(CreditCardMapper.toModel(request.getCreditCardInfo()))
                .paymentOrders(request.getPaymentOrders().stream().map(PaymentOrderMapper::toModel).collect(Collectors.toList()))
                .build();
    }
}
