package io.swagger.service;

import io.swagger.data.entity.PaymentEntity;
import io.swagger.data.mapper.PaymentEntityMapper;
import io.swagger.data.repository.PaymentRepository;
import io.swagger.exception.NotFoundException;
import io.swagger.model.Payment;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@CacheConfig(cacheNames = "paymentCache")
public class PaymentService {
    private final PaymentRepository paymentRepository;

    @Cacheable(cacheNames = "Payments")
    public List<Payment> getAll() {
        return this.paymentRepository.findAll().stream().map(PaymentEntityMapper::toModel).collect(Collectors.toList());
    }

    @CacheEvict(cacheNames = "Payments", allEntries = true)
    public Payment add(Payment payment) {
        return PaymentEntityMapper.toModel(this.paymentRepository.save(PaymentEntityMapper.toEntity(payment)));
    }

    @CacheEvict(cacheNames = "Payments", allEntries = true)
    public Payment update(Payment payment) throws NotFoundException {
        Optional<PaymentEntity> optPayment = this.paymentRepository.findById(payment.getChackoutId());
        if (!optPayment.isPresent())
           throw new NotFoundException(400,"Payment not found!");
         return PaymentEntityMapper.toModel(this.paymentRepository.save(optPayment.get()));
    }

    @Caching(evict = { @CacheEvict(cacheNames = "Payment", key = "#id"),
            @CacheEvict(cacheNames = "Payments", allEntries = true) })
    public void delete(String id) {
        this.paymentRepository.deleteById(id);
    }

    @Cacheable(cacheNames = "Payment", key = "#id", unless = "#result == null")
    public Payment getPaymentById(String id) throws NotFoundException {
        Optional<PaymentEntity> optPayment = this.paymentRepository.findById(id);
        if (!optPayment.isPresent())
            throw new NotFoundException(400,"Payment not found!");
        return PaymentEntityMapper.toModel(optPayment.get());
    }

}
