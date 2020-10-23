package com.java.myrotiuk.escaping.references.book;

public class Main {

    public static void main(String[] args) {

        BookCollection bc = new BookCollection();

        bc.printAllBooks();
        //get price of book called Tom Jones in EUR
        System.out.println(bc.findBookByName("Tom Jones").getPrice().convert("EUR"));
        Double convert = bc.findBookByName("Tom Jones").getPrice().convert("USD");
        convert = 2d;//
        BookReadOnly tom_jones = bc.findBookByName("Tom Jones");//.setTitle("dfg");
        System.out.println(tom_jones.getPrice().convert("USD"));

        bc.printAllBooks();
    }
}
