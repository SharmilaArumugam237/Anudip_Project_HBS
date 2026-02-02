package com.Anudip.HotelBooking.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentId;

    @OneToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

    private double amount;
    private String paymentMode;
    private String paymentStatus;
}

