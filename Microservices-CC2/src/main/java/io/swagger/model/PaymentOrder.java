package io.swagger.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * PaymentOrder
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentOrder {
    private String paymentOrderId;
    private String sellerAccount;
    private Double amount;
    private String currency;
}
