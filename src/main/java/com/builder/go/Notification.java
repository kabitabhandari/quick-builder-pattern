package com.builder.go;

import java.util.ArrayList;
import java.util.List;

public class Notification{

    List<PersonalNotification> listOfNotification = new ArrayList<>();
    Booking.BookingType book;

    public void notifyMethod(){

        for (PersonalNotification pns:listOfNotification) {
            pns.sendNotification(book);
        }

    }
}
