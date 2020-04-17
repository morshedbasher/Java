package com.morshed.restapi.model;

public class Customer
{
    private int id;
    private String name;
    private String description;

    public Customer()
    {
        super();
    }

    public Customer(int id, String name, String description, String firstName, String lastName, String fqtNumber, String bookingNumber)
    {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
