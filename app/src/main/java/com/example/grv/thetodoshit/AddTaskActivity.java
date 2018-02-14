package com.example.grv.thetodoshit;


import android.content.ContentValues;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.grv.thetodoshit.data.ContractClass;

public class AddTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
    }

    public void onClickAddTask(View view) {
        // Not yet implemented

        String input = ((EditText) findViewById(R.id.editText)).getText().toString();
        if (input.length() == 0) {
            return;
        }

        ContentValues contentValues = new ContentValues();
        // Put the task description and selected mPriority into the ContentValues
        contentValues.put(ContractClass.TodoEntry.COLUMN_DESCRIPTION, input);
        // Insert the content values via a ContentResolver
        Uri uri = getContentResolver().insert(ContractClass.TodoEntry.CONTENT_URI, contentValues);


        if (uri != null) {
            Toast.makeText(getBaseContext(), uri.toString(), Toast.LENGTH_LONG).show();
        }

        // Finish activity (this returns back to MainActivity)
        finish();

    }


}


