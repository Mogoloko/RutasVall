package com.mogollon.dani.rutasvall;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 05/02/2017.
 */

public class MyDB  {


    private Context context;
    private static String DBNAME = "rutas.txt";
    private List<RouteClass> rutas;

    public MyDB(Context context) {

        this.context = context;

        this.readFile();


    }

    private void readFile() {

        List<RouteClass> tmp = new ArrayList<RouteClass>();

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(
                    new InputStreamReader(this.context.getAssets().open(DBNAME)));

            // do reading, usually loop until end of file reading
            String mLine;
            int c = 0;
            while ((mLine = reader.readLine()) != null) {

                String[] split = mLine.split(" // ");

                tmp.add(new RouteClass(c, split[0], split[1], split[2], split[3]));

                c++;

            }
        } catch (IOException e) {
            //log the exception
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    //log the exception
                }
            }
        }
        this.rutas = tmp;


    }

    public List<RouteClass> getAllRoutes() {

        return this.rutas;
    }
}
