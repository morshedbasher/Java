package com.morshed.restapi.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.morshed.restapi.model.Customer;
import org.springframework.jdbc.core.RowMapper;

public class CustomerMapper implements RowMapper<Customer>
{
    @Override
    public Customer mapRow(ResultSet row, int rowNum) throws SQLException
    {
         Customer Customer = new Customer();
         Customer.setId(row.getInt("BOOKINGID"));
         Customer.setName(row.getString("NAME"));
         Customer.setDescription(row.getString("DESCRIPTION"));
         return Customer;
    }
}
