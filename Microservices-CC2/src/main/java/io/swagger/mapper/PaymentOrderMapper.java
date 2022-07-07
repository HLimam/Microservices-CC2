package io.swagger.mapper;

import io.swagger.dto.BuyerDto;
import io.swagger.dto.PaymentOrderDto;
import io.swagger.model.Buyer;
import io.swagger.model.PaymentOrder;

public class PaymentOrderMapper {
    public static PaymentOrder toModel(PaymentOrderDto dto){
        return PaymentOrder.builder()
                .paymentOrderId(dto.getPaymentOrderDtoId())
                .amount(dto.getAmount())
                .currency(dto.getCurrency())
                .sellerAccount(dto.getSellerAccount())
                .build();
    }
}
