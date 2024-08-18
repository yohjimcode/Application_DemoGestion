package com.DemoGestion.repositories;

import com.DemoGestion.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
