package com.Anudip.HotelBooking.services;

import java.util.List;
import com.Anudip.HotelBooking.entity.Room;

public interface RoomService {
    Room addRoom(Room room);
    Room getRoomById(int id);
    List<Room> getAllRooms();
}


