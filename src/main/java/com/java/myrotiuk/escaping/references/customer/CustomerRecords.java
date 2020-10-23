package com.java.myrotiuk.escaping.references.customer;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CustomerRecords {
	private Map<String, Customer> records;
	
	public CustomerRecords() {
		this.records = new HashMap<>();
	}
	
	public void addCustomer(Customer c) throws CloneNotSupportedException {
		this.records.put(c.getName(), c.clone());
	}
		
	public Map<String, Customer> getCustomers() {
		return Collections.unmodifiableMap(this.records);
	}

	public Customer getCustomer(String name) throws CloneNotSupportedException {
		return records.get(name).clone();
	}
}
