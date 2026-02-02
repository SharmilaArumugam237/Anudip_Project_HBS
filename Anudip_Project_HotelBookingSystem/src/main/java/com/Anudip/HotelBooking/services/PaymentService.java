package com.Anudip.HotelBooking.services;

import java.util.List;
import com.Anudip.HotelBooking.entity.Payment;

public interface PaymentService {

    Payment makePayment(Payment payment);

    List<Payment> getAllPayments();
}
