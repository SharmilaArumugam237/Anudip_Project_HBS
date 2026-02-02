package com.Anudip.HotelBooking.services.impl;

import com.Anudip.HotelBooking.entity.Customer;
import com.Anudip.HotelBooking.repository.CustomerRepository;
import com.Anudip.HotelBooking.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImply implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
