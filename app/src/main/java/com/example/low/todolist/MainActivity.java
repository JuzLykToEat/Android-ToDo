package com.example.low.todolist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by low on 10/09/2016.
 */
public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.activity_main_vg_container, new ToDoItemsFragment())
                .commit();
    }
}
