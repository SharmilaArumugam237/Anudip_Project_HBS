package com.Anudip.HotelBooking.runner;

import com.Anudip.HotelBooking.entity.*;
import com.Anudip.HotelBooking.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Scanner;

@Component
public class HotelAppRunner implements CommandLineRunner {

    @Autowired
    private RoomService roomService;

    @Autowired
    private BookingService bookingService;

    @Autowired
    private CustomerService customerService;

    @Override
    public void run(String... args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== HOTEL BOOKING SYSTEM ====");
            System.out.println("1. Add Room");
            System.out.println("2. View Rooms");
            System.out.println("3. Create Booking");
            System.out.println("4. View All Bookings");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Room Type: ");
                    String type = sc.next();

                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    Room room = new Room();
                    room.setRoomType(type);
                    room.setPrice(price);
                    room.setAvailable(true);

                    roomService.addRoom(room);
                    System.out.println("✅ Room added successfully");
                    break;

                case 2:
                    roomService.getAllRooms()
                            .forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("Customer Name: ");
                    String name = sc.next();

                    System.out.print("Customer Email: ");
                    String email = sc.next();

                    Customer customer = new Customer();
                    customer.setName(name);
                    customer.setEmail(email);
                    customerService.saveCustomer(customer);

                    System.out.print("Room ID: ");
                    int roomId = sc.nextInt();

                    System.out.print("Check-in Date (YYYY-MM-DD): ");
                    LocalDate checkIn = LocalDate.parse(sc.next());

                    System.out.print("Check-out Date (YYYY-MM-DD): ");
                    LocalDate checkOut = LocalDate.parse(sc.next());

                    Booking booking = new Booking();
                    booking.setCustomer(customer);
                    booking.setRoom(roomService.getRoomById(roomId));
                    booking.setCheckInDate(checkIn);
                    booking.setCheckOutDate(checkOut);
                    booking.setStatus("BOOKED");

                    bookingService.createBooking(booking);
                    System.out.println("✅ Booking confirmed");
                    break;

                case 4:
                    bookingService.getAllBookings()
                            .forEach(System.out::println);
                    break;

                case 5:
                    System.out.println("👋 Exiting...");
                    System.exit(0);

                default:
                    System.out.println("❌ Invalid choice");
            }
        }
    }
}
