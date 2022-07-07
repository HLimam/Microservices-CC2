package io.swagger.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Payment
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payment {
    private String chackoutId;
    private Buyer buyerInfo;
    private CreditCard creditCardInfo;
    private List<PaymentOrder> paymentOrders;
}
