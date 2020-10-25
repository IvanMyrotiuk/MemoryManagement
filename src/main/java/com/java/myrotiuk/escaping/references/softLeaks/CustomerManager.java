package com.java.myrotiuk.escaping.references.softLeaks;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class CustomerManager {

    private List<Customer> customers = new ArrayList<>();
    private int nextId = 0;

    public void addCustomer(Customer customer) {
        synchronized (this) {
            customer.setId(nextId);
            nextId++;
            customers.add(customer);
        }
    }

    public Customer getNextCustomer() {
//        synchronized (this) {
//            if (customers.size() > 0) {
//                   return customers.remove(0);
//            }
//        }
//        return null;
        return customers.get(0);//soft leak
    }

    public void howManyCustomers() {
        int size = customers.size();
        System.out.println("" + new Date() + " : " + size);
    }

    public void displayCustomers() {
        synchronized (this) {
            for (Customer c : customers) {
                System.out.println(c.toString());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }


}
