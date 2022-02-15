package com.builder.go;


public class Booking{
    public enum BookingType {INDIVIDUAL, COACHING, LIFETIME}

    public static void main(String[] args) {
        NotificationBuilder nb = new NotificationBuilder();
       // Notification nnn  = nb.buildNotification(BookingType.INDIVIDUAL);
        Notification nnn  = nb.buildNotification(BookingType.COACHING);
        //Notification nnn  = nb.buildNotification(BookingType.LIFETIME);
        nnn.notifyMethod();
    }

}
