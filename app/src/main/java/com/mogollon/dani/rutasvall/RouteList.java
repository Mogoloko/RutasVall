package com.mogollon.dani.rutasvall;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class RouteList extends AppCompatActivity {

    protected List<RouteClass> rutas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route_list);

        loadRoutes();
    }

    // Load routes
    private void loadRoutes() {

            MyDB db = new MyDB(getBaseContext());

            this.rutas = db.getAllRoutes();

    }
}
