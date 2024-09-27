package com.automation.demo;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateBookingPojo {
    String firstname;
    String lastname;
    int totalprice;
    boolean depositpaid;
    BookingDate bookingdates;
    String additionalneeds;

}
