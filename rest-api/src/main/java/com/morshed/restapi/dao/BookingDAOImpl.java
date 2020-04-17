package com.morshed.restapi.dao;

import java.util.List;

import com.morshed.restapi.mapper.BookingRowMapper;
import com.morshed.restapi.mapper.CustomerMapper;
import com.morshed.restapi.model.Booking;
import com.morshed.restapi.model.Customer;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookingDAOImpl implements BookingDAO
{
    Logger logger = LogManager.getLogger(BookingDAOImpl.class);
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public List<Customer> getAllStudents()
    {
        String sql = "select * from Booking";
        List customerList = jdbcTemplate
                .query(sql, new CustomerMapper());
        return customerList;
    }

    @Override
    public List<Booking> getBookingInfoByPNR(String pnrNumber) {
        String sql = "SELECT * FROM Booking WHERE booking_id = ? ";
        List bookingInfo = jdbcTemplate.query(sql, new BookingRowMapper(), pnrNumber);
        logger.debug(sql);
        return bookingInfo;
    }

}
