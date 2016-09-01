package com.baksoy.parceler.model;

import android.os.Parcel;

import org.parceler.Parcel.Serialization;

/**
 * Created by beraaksoy on 9/1/16.
 */

@org.parceler.Parcel(Serialization.BEAN)
public class Book {

    private String title;
    private String author;
    private String description;

    public Book() {
    }

    public Book(String title, String author, String description) {
        this.title = title;
        this.author = author;
        this.description = description;
    }

    protected Book(Parcel in) {
        title = in.readString();
        author = in.readString();
        description = in.readString();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
