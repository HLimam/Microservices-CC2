package io.swagger.data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * PaymentOrder entity
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "payment-orders")
public class PaymentOrderEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String paymentOrderId;
    private String sellerAccount;
    private Double amount;
    private String currency;
}
