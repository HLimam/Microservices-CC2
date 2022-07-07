package io.swagger.data.repository;

import io.swagger.data.entity.PaymentOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentOrderRepository extends JpaRepository<PaymentOrderEntity,String> {
}
