package com.amitmps.dell.androidtutorial;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class List22DataBaseAdapter {
    static final String DATABASE_NAME ="login.db";
    static final int DATABASE_VERSION=1;

    static final String DataBase_Create=
            "create table "+"LOGIN"+ "( " +"ID"+" integer primary key autoincrement,"+ "USERNAME text," +"PASSWORD text); ";

    public SQLiteDatabase db;
    private final Context context;
    private List22DBhelper dbHelper;
    public List22DataBaseAdapter(Context _context)
    {
        context=_context;
        dbHelper=new List22DBhelper(context,DATABASE_NAME,null,DATABASE_VERSION);
    }
    public List22DataBaseAdapter open() throws SQLException
    {
        db=dbHelper.getWritableDatabase();
        return this;
    }
    public void close()
    {
        db.close();
    }
    public void insertEntry(String userName,String password)
    {
        ContentValues newValues=new ContentValues();
        newValues.put("USERNAME",userName);
        newValues.put("PASSWORD",password);
        db.insert("LOGIN",null,newValues);
    }
    public String getSingleEntry(String userName)
    {
        Cursor cursor=
                db.query("LOGIN",null,"USERNAME=?",new String[]{userName},null,null,null);
        if(cursor.getCount()<1) {
            cursor.close();
            return "NOT EXIST";
        }
        cursor.moveToFirst();
        String password=cursor.getString(cursor.getColumnIndex("PASSWORD"));
        cursor.close();
        return password;
    }
}
