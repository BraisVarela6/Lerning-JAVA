package com.campusdual.interfaces;

import java.util.Date;

public class BookingSystem {
    public static void main(String[] args) {
        CarBooking cb = new CarBooking("0000BB");
        cb.book(new Date());
        cb.getTicketDetail();
        cb.cancelBook();
        cb.getTicketDetail();

    }
}
