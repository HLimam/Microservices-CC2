package io.swagger.data.mapper;

import io.swagger.data.entity.CreditCardEntity;
import io.swagger.model.CreditCard;

public class CreditCardEntityMapper {
    public static CreditCard toModel(CreditCardEntity entity){
        return CreditCard.builder()
                .creditCardid(entity.getCreditCardid())
                .ccNumber(entity.getCcNumber())
                .cvv(entity.getCvv())
                .expirationMonth(entity.getExpirationMonth())
                .expirationYear(entity.getExpirationYear())
                .email(entity.getEmail())
                .userName(entity.getUserName())
                .build();
    }

    public static CreditCardEntity toEntity(CreditCard model){
        return CreditCardEntity.builder()
                .creditCardid(model.getCreditCardid())
                .ccNumber(model.getCcNumber())
                .cvv(model.getCvv())
                .expirationMonth(model.getExpirationMonth())
                .expirationYear(model.getExpirationYear())
                .email(model.getEmail())
                .userName(model.getUserName())
                .build();
    }
}
