package com.java.myrotiuk.escaping.references.customer;

public final class Customer implements Cloneable {
    private /*final*/ String name;//second approach

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
    @Override
	public Customer clone() throws CloneNotSupportedException {
		return (Customer) super.clone();//1-st approach
	}
}
