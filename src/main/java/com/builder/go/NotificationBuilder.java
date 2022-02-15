package com.builder.go;

import com.builder.go.parties.Coach;
import com.builder.go.parties.Manager;
import com.builder.go.parties.Member;
import com.builder.go.parties.SecurityPeople;

public class NotificationBuilder extends Notification{

    public Notification buildNotification(Booking.BookingType b) {
        System.out.println(">>> " + b.name());
        if (("INDIVIDUAL").equals(b.name())) {

            return buildIndividualBooking(b);
        } else if (("COACHING").equals(b.name())) {
            {
                return buildCoachBooking(b);
            }
        }

        return buildLifeTimeMember(b);
    }

    private Notification buildIndividualBooking(Booking.BookingType b) {
        Notification n = new Notification();
        n.listOfNotification.add(new SecurityPeople());
        n.listOfNotification.add(new Member());
        n.listOfNotification.size();
        n.book = b;
        return n;
    }
    private Notification buildCoachBooking(Booking.BookingType b) {
        Notification n = new Notification();
        n.listOfNotification.add(new SecurityPeople());
        n.listOfNotification.add(new Member());
        n.listOfNotification.add(new Coach());
        n.listOfNotification.size();
        n.book = b;
        return n;
    }
    private Notification buildLifeTimeMember(Booking.BookingType b) {
        Notification n = new Notification();
        n.listOfNotification.add(new SecurityPeople());
        n.listOfNotification.add(new Member());
        n.listOfNotification.add(new Coach());
        n.listOfNotification.add(new Manager());
        n.listOfNotification.size();
        n.book = b;
        return n;
    }
}
