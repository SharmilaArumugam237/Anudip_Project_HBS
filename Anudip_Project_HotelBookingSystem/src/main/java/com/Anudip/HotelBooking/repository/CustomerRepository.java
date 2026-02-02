package com.Anudip.HotelBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Anudip.HotelBooking.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}

