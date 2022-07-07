package io.swagger.data.mapper;

import io.swagger.data.entity.BuyerEntity;
import io.swagger.model.Buyer;

public class BuyerEntityMapper {
    public static Buyer toModel(BuyerEntity entity){
        return Buyer.builder()
                .buyerId(entity.getBuyerId())
                .address(entity.getAddress())
                .city(entity.getCity())
                .email(entity.getEmail())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .phoneNumber(entity.getPhoneNumber())
                .build();
    }

    public static BuyerEntity toEntity(Buyer model){
        return BuyerEntity.builder()
                .buyerId(model.getBuyerId())
                .address(model.getAddress())
                .city(model.getCity())
                .email(model.getEmail())
                .firstName(model.getFirstName())
                .lastName(model.getLastName())
                .phoneNumber(model.getPhoneNumber())
                .build();
    }
}
