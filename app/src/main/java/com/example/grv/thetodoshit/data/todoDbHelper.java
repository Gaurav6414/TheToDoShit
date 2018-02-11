package com.example.grv.thetodoshit.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.grv.thetodoshit.data.ContractClass.TodoEntry;

/**
 * Created by GRV on 2/11/2018.
 */

public class todoDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "todo.db";

    private static final int DATABASE_VERSION = 1;

    public todoDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        final String CREATE_TABLE = "CREATE TABLE " + TodoEntry.TABLE_NAME + " (" +
                TodoEntry._ID + " INTEGER PRIMARY KEY, " +
                TodoEntry.COLUMN_DESCRIPTION + " TEXT NOT NULL);";

        sqLiteDatabase.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TodoEntry.TABLE_NAME);
        onCreate(sqLiteDatabase);

    }
}
