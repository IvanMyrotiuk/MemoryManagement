package com.java.myrotiuk.escaping.references.book;

public interface BookReadOnly {
    int getId();

    String getTitle();

    String getAuthor();

    //Escape -no
    Price getPrice();

    String toString();
}
