package vivz.snakesnake;


import android.content.Context;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;

import android.util.DisplayMetrics;


/**
 * Created by user on 09-09-2016.
 */
public class Snake {


    private float speedx;
    private float speedy = 0;




    public Point position = new Point();
    int widthPixels;
    int heightPixels;
    Snake_Application application;
    private int radius;

    public Snake(Context c) {

        application = (Snake_Application) c.getApplicationContext();
        speedx = application.speed();


        radius = 15;

        DisplayMetrics lDisplayMetrics = c.getResources().getDisplayMetrics();
        widthPixels = lDisplayMetrics.widthPixels;
        heightPixels = lDisplayMetrics.heightPixels;

    }


    public void snake_motion() {

        this.position.x += this.speedx;
        this.position.y += this.speedy;
//            }


        if (this.position.x > widthPixels*.9309) {
            this.position.x = 0;
        }


        if (this.position.x < 0) {
            this.position.x = (int)(widthPixels *.9309);
        }

        if (this.position.y > heightPixels *.8359) {
            this.position.y = 0;
        }

        if (this.position.y < 0) {
            this.position.y = (int)(heightPixels *.8359);
        }
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public int getRadius() {
        return radius;
    }

    public float getSpeedx() {
        return speedx;
    }

    public float getSpeedy() {
        return speedy;
    }

    public void setSpeedx(float speedx) {
        this.speedx = speedx;
    }

    public void setSpeedy(float speedy) {
        this.speedy = speedy;
    }
}









