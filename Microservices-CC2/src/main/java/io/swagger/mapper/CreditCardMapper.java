package io.swagger.mapper;

import io.swagger.dto.BuyerDto;
import io.swagger.dto.CreditCardDto;
import io.swagger.model.Buyer;
import io.swagger.model.CreditCard;

public class CreditCardMapper {
    public static CreditCard toModel(CreditCardDto dto){
        return CreditCard.builder()
                .creditCardid(dto.getCreditCardid())
                .ccNumber(dto.getCcNumber())
                .cvv(dto.getCvv())
                .expirationMonth(dto.getExpirationMonth())
                .expirationYear(dto.getExpirationYear())
                .email(dto.getEmail())
                .userName(dto.getUserName())
                .build();
    }
}
