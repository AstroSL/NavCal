package com.example.navcal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.view.Display;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DataBasehandler extends SQLiteOpenHelper {

    private static final String TABLE_NAME = "data";

    private static final String TABLE_COLUMN_ONE = "lbs_of_mulch";
    private static final String TABLE_COLUMN_TWO = "bags";
    private static final String TABLE_COLUMN_THREE = "bags_per_tank";
    private static final String TABLE_COLUMN_FOUR = "tank_load";
    private static final String TABLE_COLUMN_FIVE = "sq_ft_tank";
    private static final String TABLE_COLUMN_SIX = "date_time";


    public DataBasehandler(@Nullable Context context) {
        super(context, "calulator", null, 3);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String create_table = "CREATE TABLE " + TABLE_NAME + " ( " + TABLE_COLUMN_ONE + " FLOAT, " + TABLE_COLUMN_TWO + " FLOAT, " + TABLE_COLUMN_THREE + " FLOAT, "
                + TABLE_COLUMN_FOUR + " FLOAT, " + TABLE_COLUMN_FIVE + " FLOAT, " + TABLE_COLUMN_SIX  +" DATETIME)";
        db.execSQL(create_table);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    public ArrayList<Model> getAllData() {
        ArrayList<Model> modelArrayList = new ArrayList<Model>();
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
//        String read_data = "SELECT * FROM " + TABLE_NAME +" ORDER BY datetime ("+TABLE_COLUMN_SIX+")" + " DESC LIMIT 1";
        String read_data = "SELECT * FROM " + TABLE_NAME +" ORDER BY " + TABLE_COLUMN_SIX + " DESC";
        Cursor cursor = sqLiteDatabase.rawQuery(read_data, null);
        if (cursor.moveToFirst()) {
            do {
                double lbs_of_mulch = cursor.getDouble(0);
                double bags = cursor.getDouble(1);
                double bags_per_tank = cursor.getDouble(2);
                double tank_load = cursor.getDouble(3);
                double sq_ft_tank = cursor.getDouble(4);
                String date_time = cursor.getString(5);

                Model model = new Model(lbs_of_mulch, bags, bags_per_tank,tank_load,sq_ft_tank,date_time);
                modelArrayList.add(model);
            }
            while (cursor.moveToNext());
        }
        cursor.close();
        sqLiteDatabase.close();
        return modelArrayList;
    }

    public void setAllData(Model model) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(TABLE_COLUMN_ONE, model.getLbs_of_mulch());
        contentValues.put(TABLE_COLUMN_TWO, model.getBags());
        contentValues.put(TABLE_COLUMN_THREE, model.getBags_per_tank());
        contentValues.put(TABLE_COLUMN_FOUR, model.getTank_loads());
        contentValues.put(TABLE_COLUMN_FIVE, model.getSq_ft_tank());
        contentValues.put(TABLE_COLUMN_SIX, model.getDateTime());
        sqLiteDatabase.insert(TABLE_NAME, null, contentValues);
    }
}