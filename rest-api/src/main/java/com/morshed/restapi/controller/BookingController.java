package com.morshed.restapi.controller;

import java.util.List;

import com.morshed.restapi.dao.BookingDAOImpl;
import com.morshed.restapi.model.Booking;
import com.morshed.restapi.model.Customer;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController
{
    Logger logger = LogManager.getLogger(BookingController.class);
    @Autowired
    BookingDAOImpl bookingDAO;

    @GetMapping("/")
    public String welCome()
    {
        return "Hello Customer";
    }

    @GetMapping("/getIX")
    public ResponseEntity<List<Customer>> getAllStudents()
    {
        List<Customer> CustomerList = bookingDAO.getAllStudents();
        return new ResponseEntity<List<Customer>>(CustomerList, HttpStatus.OK);
    }

    @GetMapping("getBookingInfo/{pnrNumber}")
    public ResponseEntity<List<Booking>> getBookingInfo(@PathVariable("pnrNumber") String pnrNumber)
    {
        List<Booking> BookingList = bookingDAO.getBookingInfoByPNR(pnrNumber);
        if (logger.isDebugEnabled()) {
            logger.debug("ix sql : ", BookingList);
        }
        return new ResponseEntity<List<Booking>>(BookingList, HttpStatus.OK);
    }
}
