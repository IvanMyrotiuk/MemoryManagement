package com.java.myrotiuk.escaping.references.customer;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        CustomerRecords records = new CustomerRecords();

        records.addCustomer(new Customer("John"));
        records.addCustomer(new Customer("Simon"));

        //records.getCustomers().clear();

        for (Customer next : records.getCustomers().values()) {
            System.out.println(next);
        }

        Customer customerJohn = records.getCustomer("John");

        System.out.println(customerJohn.getName());
        customerJohn.setName("Lola");
        System.out.println(customerJohn.getName());

        for (Customer next : records.getCustomers().values()) {
            System.out.println(next);
        }
    }
}
