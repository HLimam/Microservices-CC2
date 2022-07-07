package io.swagger.data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * CreditCard entity
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "credit-cards")
public class CreditCardEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String creditCardid;
    private String email;
    private String userName;
    private String ccNumber;
    private String cvv;
    private Integer expirationMonth;
    private Integer expirationYear;
}
