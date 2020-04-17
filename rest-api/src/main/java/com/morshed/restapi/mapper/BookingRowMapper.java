package com.morshed.restapi.mapper;

import com.morshed.restapi.model.Booking;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookingRowMapper implements RowMapper<Booking>
{

    @Override
    public Booking mapRow(ResultSet resultSet, int i) throws SQLException {
        Booking booking = new Booking();
        booking.setFirstName(resultSet.getString("FIRST_NAME"));
        booking.setLastName(resultSet.getString("LAST_NAME"));
        booking.setFqtNumber(resultSet.getString("FQT_NUMBER"));
        booking.setBookingNumber(resultSet.getString("BOOKING_ID"));
        return booking;
    }
}
