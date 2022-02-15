package com.builder.go.parties;

import com.builder.go.Booking;
import com.builder.go.PersonalNotification;

public class Member implements PersonalNotification {

    @Override
    public void sendNotification(Booking.BookingType booking) {
        System.out.println("Notified Member");
    }
}
