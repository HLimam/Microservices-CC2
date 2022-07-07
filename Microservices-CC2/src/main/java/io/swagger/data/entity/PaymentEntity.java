package io.swagger.data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "payments")
public class PaymentEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String chackoutId;
    @OneToOne
    private BuyerEntity buyerInfo;
    @OneToOne
    private CreditCardEntity creditCardInfo;
    @OneToMany
    private List<PaymentOrderEntity> paymentOrders;
}
