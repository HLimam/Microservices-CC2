package io.swagger.data.repository;

import io.swagger.data.entity.BuyerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyerRepository extends JpaRepository<BuyerEntity,String> {
}
