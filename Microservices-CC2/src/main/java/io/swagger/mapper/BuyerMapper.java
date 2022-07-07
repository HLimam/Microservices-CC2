package io.swagger.mapper;

import io.swagger.dto.BuyerDto;
import io.swagger.model.Buyer;

public class BuyerMapper {
    public static Buyer toModel(BuyerDto dto){
        return Buyer.builder()
                .buyerId(dto.getBuyerId())
                .address(dto.getAddress())
                .city(dto.getCity())
                .email(dto.getEmail())
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .phoneNumber(dto.getPhoneNumber())
                .build();
    }
}
