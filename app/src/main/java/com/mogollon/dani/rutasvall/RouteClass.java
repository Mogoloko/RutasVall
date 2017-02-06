package com.mogollon.dani.rutasvall;

import android.util.Log;

import org.w3c.dom.Text;

import static android.R.attr.id;

/**
 * Created by admin on 05/02/2017.
 */

public class RouteClass {

    private int id;
    private String name;
    private String description;
    private String coorText;
    private String image;

    public RouteClass(int id, String name, String image, String description, String coorText) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.coorText = coorText;
        this.image = image;

    }

    public String getName() {
        return this.name;
    }
}
