package com.Anudip.HotelBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Anudip.HotelBooking.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}

