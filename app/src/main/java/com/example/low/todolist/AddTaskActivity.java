package com.example.low.todolist;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by low on 10/09/2016.
 */
public class AddTaskActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_add_task);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.activity_add_task_container, new AddTaskFragment())
                .commit();
    }
}
