package com.example.low.todolist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by low on 10/09/2016.
 */
public class AddTaskFragment extends Fragment {

    private EditText mTaskEditText;
    private Button mAddButton;
    private Button mCancelButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_add_task, container, false);

        mTaskEditText = (EditText) rootView.findViewById(R.id.fragment_add_task_et_task);
        mCancelButton = (Button) rootView.findViewById(R.id.cancel_button);
        mAddButton = (Button) rootView.findViewById(R.id.add_task_button);

        ViewCompat.setElevation(mTaskEditText, 8);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String task = mTaskEditText.getText().toString();
                Intent resultIntent = new Intent();
                resultIntent.putExtra("task", task);
                getActivity().setResult(Activity.RESULT_OK, resultIntent);
                getActivity().finish();
            }
        });

        mCancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().setResult(Activity.RESULT_CANCELED);
                getActivity().finish();
            }
        });
    }
}
