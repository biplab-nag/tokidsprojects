package com.biplab.finalversion.tokidprojects.fragments.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {


    public static final String DB_NAME = "app_db";
    public static final int DB_VERSION = 14;

    public static final String TBL_PROFILE = "profile";
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    public static final String COL_AGE = "age";
    public static final String COL_GENDER = "gender";
    public static final String COL_HEIGHT = "height";
    public static final String COL_WEIGHT = "weight";


    public static final String TBL_EVENT = "event";
    public static final String COL_EVENT_ID = "id";
    public static final String COL_EVENT_TTILE = "title";
    public static final String COL_EVENT_DAY = "day";
    public static final String COL_EVENT_MONTH = "month";
    public static final String COL_EVENT_YEAR = "year";


    public static final String TBL_UPDATESs = "updatetable";
    public static final String COL_UPDATE_ID = "id";
    public static final String COL_UPDATE_PROFILE_ID = "profile_id";
    public static final String COL_UPDATE_NAME = "name";
    public static final String COL_UPDATE_AGE = "age";
    public static final String COL_UPDATE_GENDER = "gender";
    public static final String COL_UPDATE_HEIGHT = "height";
    public static final String COL_UPDATE_WEIGHT = "weight";
    public static final String COL_UPDATE_DATE = "date";
    public static final String COL_UPDATE_TIME = "time";


    private static final String SQL_CREATE_TABLE_UPDATE =
            "CREATE TABLE " + TBL_UPDATESs + " (" +
                    COL_UPDATE_ID + " INTEGER PRIMARY KEY," +
                    COL_UPDATE_PROFILE_ID + " INTEGER," +
                    COL_UPDATE_NAME + " TEXT," +
                    COL_UPDATE_AGE + " DOUBLE," +
                    COL_UPDATE_GENDER + " TEXT," +
                    COL_UPDATE_HEIGHT + " DOUBLE," +
                    COL_UPDATE_WEIGHT + " DOUBLE," +
                    COL_UPDATE_DATE + " TEXT," +
                    COL_UPDATE_TIME + " TEXT)";


    private static final String SQL_CREATE_TABLE =
            "CREATE TABLE " + TBL_PROFILE + " (" +
                    COL_ID + " INTEGER PRIMARY KEY," +
                    COL_NAME + " TEXT," +
                    COL_AGE + " DOUBLE," +
                    COL_GENDER + " TEXT," +
                    COL_HEIGHT + " DOUBLE," +
                    COL_WEIGHT + " DOUBLE)";


    private static final String SQL_CREATE_TABLE_EVENT =
            "CREATE TABLE " + TBL_EVENT + " (" +
                    COL_EVENT_ID + " INTEGER PRIMARY KEY," +
                    COL_EVENT_TTILE + " TEXT," +
                    COL_EVENT_DAY + " INTEGER," +
                    COL_EVENT_MONTH + " INTEGER," +
                    COL_EVENT_YEAR + " INTEGER)";


    private static final String SQL_DELETE_ENTRIES1 =
            "DROP TABLE IF EXISTS " + TBL_PROFILE;
    private static final String SQL_DELETE_ENTRIES2 =
            "DROP TABLE IF EXISTS " + TBL_EVENT;
    private static final String SQL_DELETE_ENTRIES3 =
            "DROP TABLE IF EXISTS " + TBL_UPDATESs;


    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null,DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_TABLE);
        db.execSQL(SQL_CREATE_TABLE_EVENT);
        db.execSQL(SQL_CREATE_TABLE_UPDATE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_ENTRIES1);
        db.execSQL(SQL_DELETE_ENTRIES2);
        db.execSQL(SQL_DELETE_ENTRIES3);

        db.execSQL(SQL_CREATE_TABLE);

        db.execSQL(SQL_CREATE_TABLE_UPDATE);
    }
}
