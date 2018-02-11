package com.example.grv.thetodoshit.data;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by GRV on 2/11/2018.
 */

public class ContractClass {

    public static final String AUTHORITY = "com.example.android.todolist";

    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + AUTHORITY);

    public static final String PATH_TASKS = "todoEntry";

    public static final class TodoEntry implements BaseColumns {

        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_TASKS).build();

        public static final String TABLE_NAME = "todoEntry";

        public static final String COLUMN_DESCRIPTION = "description";
    }
}

