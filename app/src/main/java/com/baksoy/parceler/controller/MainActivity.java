package com.baksoy.parceler.controller;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.baksoy.parceler.model.Book;
import com.baksoy.parceler.R;

import org.parceler.Parcels;

public class MainActivity extends AppCompatActivity {

    private final String TAG = MainActivity.this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Book book = new Book("Moby Dick", "Herman Melville", "Story of Ahab, captain of the whaler the Pequod, for revenge on Moby Dick");

        //Parceling the object
        Parcelable parceledBook = Parcels.wrap(book);

        //Unparceling the object
        Book unparceledBook = Parcels.unwrap(parceledBook);

        Log.i(TAG, "Unparceled title: " + unparceledBook.getTitle());
        Log.i(TAG, "Unparceled author: " + unparceledBook.getAuthor());
        Log.i(TAG, "Unparceled description: " + unparceledBook.getDescription());
    }
}
