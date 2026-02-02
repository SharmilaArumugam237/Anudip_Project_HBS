package com.Anudip.HotelBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Anudip.HotelBooking.entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
    // No extra methods needed now
}

