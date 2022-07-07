package io.swagger.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CreditCard
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreditCard {
    private String creditCardid;
    private String email;
    private String userName;
    private String ccNumber;
    private String cvv;
    private Integer expirationMonth;
    private Integer expirationYear;
}
