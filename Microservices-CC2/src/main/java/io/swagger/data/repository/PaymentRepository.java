package io.swagger.data.repository;

import io.swagger.data.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository  extends JpaRepository<PaymentEntity,String> {
}
