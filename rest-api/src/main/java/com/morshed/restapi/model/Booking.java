package com.morshed.restapi.model;

public class Booking
{
    private String firstName;
    private String lastName;
    private String fqtNumber;
    private String bookingNumber;

    public Booking ()
    {
        super();
    }

    public Booking(String firstName, String lastName, String fqtNumber, String bookingNumber) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.fqtNumber = fqtNumber;
        this.bookingNumber = bookingNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFqtNumber() {
        return fqtNumber;
    }

    public void setFqtNumber(String fqtNumber) {
        this.fqtNumber = fqtNumber;
    }

    public String getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(String bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fqtNumber='" + fqtNumber + '\'' +
                ", bookingNumber='" + bookingNumber + '\'' +
                '}';
    }
}
