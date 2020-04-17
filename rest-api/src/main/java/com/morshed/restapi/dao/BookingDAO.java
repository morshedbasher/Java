package com.morshed.restapi.dao;

import com.morshed.restapi.model.Booking;
import com.morshed.restapi.model.Customer;

import java.util.List;

public interface BookingDAO
{
    List<Customer> getAllStudents();
    List<Booking> getBookingInfoByPNR(String pnrNumber);
}
