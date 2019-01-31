package com.biplab.dcl.tokidsproject.fragments.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class DatabaseSource {

    private DatabaseHelper helper;
    private SQLiteDatabase db;

    public DatabaseSource(Context context) {
        this.helper = new DatabaseHelper(context);
    }

    public void  open(){
        db = helper.getWritableDatabase();
    }

    public void close(){
        db.close();
    }

    public boolean insertChild(Profile profile){
        this.open();
        ContentValues values = new ContentValues();
        values.put(helper.COL_NAME,profile.getName());
        values.put(helper.COL_AGE,profile.getAge());
        values.put(helper.COL_GENDER,profile.getGender());
        values.put(helper.COL_HEIGHT,profile.getHeight());
        values.put(helper.COL_WEIGHT,profile.getWeight());

        long rows = db.insert(helper.TBL_PROFILE,null,values);
        this.close();

        if (rows >0){
            return true;
        }
        else {
            return false;
        }
    }

    public ArrayList<Profile> getAllChild(){
        ArrayList<Profile> profiles = new ArrayList<>();

        this.open();
        Cursor cursor = db.query(helper.TBL_PROFILE,null,null,null,null,null,null,null);

        if (cursor != null && cursor.getCount() > 0){
            cursor.moveToFirst();
            do {
                int id = cursor.getInt(cursor.getColumnIndex(helper.COL_ID));
                String name = cursor.getString(cursor.getColumnIndex(helper.COL_NAME));
                double age = cursor.getDouble(cursor.getColumnIndex(helper.COL_AGE));
                String gender = cursor.getString(cursor.getColumnIndex(helper.COL_GENDER));
                double height = cursor.getDouble(cursor.getColumnIndex(helper.COL_HEIGHT));
                double weight = cursor.getDouble(cursor.getColumnIndex(helper.COL_WEIGHT));

                profiles.add(new Profile(id,name,age,gender,height,weight));
            }
            while (cursor.moveToNext());
        }
        cursor.close();
        this.close();
        return profiles;
    }

    public Profile getChildbyID(int id){
        this.open();
        Profile profile = null;

        Cursor cursor = db.query(helper.TBL_PROFILE,null,helper.COL_ID+"="+id,null,null,null,null,null);
        if (cursor != null && cursor.getCount() > 0){
            cursor.moveToFirst();

            int profileid = cursor.getInt(cursor.getColumnIndex(helper.COL_ID));
            String name = cursor.getString(cursor.getColumnIndex(helper.COL_NAME));
            double age = cursor.getDouble(cursor.getColumnIndex(helper.COL_AGE));
            String gender = cursor.getString(cursor.getColumnIndex(helper.COL_GENDER));
            double height = cursor.getDouble(cursor.getColumnIndex(helper.COL_HEIGHT));
            double weight = cursor.getDouble(cursor.getColumnIndex(helper.COL_WEIGHT));

            profile = new Profile(profileid,name,age,gender,height,weight);
        }
        cursor.close();
        this.close();

        return profile;
    }

    public boolean editChild(Profile profile){
        this.open();
        ContentValues values = new ContentValues();
        values.put(helper.COL_NAME,profile.getName());
        values.put(helper.COL_AGE,profile.getAge());
        values.put(helper.COL_GENDER,profile.getGender());
        values.put(helper.COL_HEIGHT,profile.getHeight());
        values.put(helper.COL_WEIGHT,profile.getWeight());

        int rows = db.update(helper.TBL_PROFILE,values,helper.COL_ID+"="+profile.getId(),null);
        this.close();
        if (rows >0){
            return true;
        }
        else {
            return false;
        }

    }

    public boolean deleteChild(int id){
        this.open();
        int rows = db.delete(helper.TBL_PROFILE,helper.COL_ID+"="+id,null);
        this.close();

        if (rows > 0){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean insertEvent(Event event){
        this.open();
        ContentValues values = new ContentValues();
        values.put(helper.COL_EVENT_TTILE,event.getTitle());
        values.put(helper.COL_EVENT_DAY,event.getDay());
        values.put(helper.COL_EVENT_MONTH,event.getMonth());
        values.put(helper.COL_EVENT_YEAR,event.getYear());

        long rows = db.insert(helper.TBL_EVENT,null,values);
        this.close();

        if (rows >0){
            return true;
        }
        else {
            return false;
        }
    }

    public ArrayList<Event> getAllEvents(){
        ArrayList<Event> events = new ArrayList<>();

        this.open();
        Cursor cursor = db.query(helper.TBL_EVENT,null,null,null,null,null,null,null);

        if (cursor != null && cursor.getCount() > 0){
            cursor.moveToFirst();
            do {
                int id = cursor.getInt(cursor.getColumnIndex(helper.COL_EVENT_ID));
                String title = cursor.getString(cursor.getColumnIndex(helper.COL_EVENT_TTILE));
                int day = cursor.getInt(cursor.getColumnIndex(helper.COL_EVENT_DAY));
                int month = cursor.getInt(cursor.getColumnIndex(helper.COL_EVENT_MONTH));
                int year = cursor.getInt(cursor.getColumnIndex(helper.COL_EVENT_YEAR));

                events.add(new Event(id,title,day,month,year));
            }
            while (cursor.moveToNext());
        }
        cursor.close();
        this.close();
        return events;
    }

    public boolean deleteEvent(int id){
        this.open();
        int rows = db.delete(helper.TBL_EVENT,helper.COL_EVENT_ID+"="+id,null);
        this.close();

        if (rows > 0){
            return true;
        }
        else {
            return false;
        }
    }

   /* public boolean insertUpdate(Update update){
        this.open();
        ContentValues values = new ContentValues();
        values.put(helper.COL_NAME,update.getId());
        values.put(helper.COL_NAME,update.getName());
        values.put(helper.COL_AGE,update.getAge());
        values.put(helper.COL_GENDER,update.getGender());
        values.put(helper.COL_HEIGHT,update.getHeight());
        values.put(helper.COL_WEIGHT,update.getWeight());

        long rows = db.insert(helper.TBL_UPDATE,null,values);
        this.close();

        if (rows >0){
            return true;
        }
        else {
            return false;
        }
    }

    public ArrayList<Update> getAllUpdate(){
        ArrayList<Update> updates = new ArrayList<>();

        this.open();
        Cursor cursor = db.query(helper.TBL_UPDATE,null,null,null,null,null,null,null);

        if (cursor != null && cursor.getCount() > 0){
            cursor.moveToFirst();
            do {
                int id = cursor.getInt(cursor.getColumnIndex(helper.COL_ID));
                String name = cursor.getString(cursor.getColumnIndex(helper.COL_NAME));
                double age = cursor.getDouble(cursor.getColumnIndex(helper.COL_AGE));
                String gender = cursor.getString(cursor.getColumnIndex(helper.COL_GENDER));
                double height = cursor.getDouble(cursor.getColumnIndex(helper.COL_HEIGHT));
                double weight = cursor.getDouble(cursor.getColumnIndex(helper.COL_WEIGHT));

                updates.add(new Update(id,name,age,gender,height,weight));
            }
            while (cursor.moveToNext());
        }
        cursor.close();
        this.close();
        return updates;
    }*/

}

