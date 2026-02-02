package com.Anudip.HotelBooking.services;

import java.util.List;
import com.Anudip.HotelBooking.entity.Booking;

public interface BookingService {
    Booking createBooking(Booking booking);
    List<Booking> getAllBookings();
}
