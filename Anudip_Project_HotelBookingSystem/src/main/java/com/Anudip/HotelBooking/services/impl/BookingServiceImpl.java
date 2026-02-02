package com.Anudip.HotelBooking.services.impl;

import com.Anudip.HotelBooking.entity.Booking;
import com.Anudip.HotelBooking.repository.BookingRepository;
import com.Anudip.HotelBooking.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }
}
