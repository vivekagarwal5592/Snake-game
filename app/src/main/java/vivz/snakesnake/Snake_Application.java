package vivz.snakesnake;

import android.app.Application;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.util.DisplayMetrics;


/**
 * Created by user on 24-09-2016.
 */
public class Snake_Application extends Application {

    private int level = 1;
    int speed = 3;
    int score;
    Context c;
    int widthPixels;
    int heightPixels;
    //  Display display = ((WindowManager) getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
    Point p = new Point();

    // Called when the application is starting, before any other application objects have been created.
    // Overriding this method is totally optional!
    @Override
    public void onCreate() {
        super.onCreate();
        c = getApplicationContext();
        DisplayMetrics lDisplayMetrics = c.getResources().getDisplayMetrics();
        widthPixels = lDisplayMetrics.widthPixels;
        heightPixels = lDisplayMetrics.heightPixels;
        // Required initialization logic here!
    }

    // Called by the system when the device configuration changes while your component is running.
    // Overriding this method is totally optional!
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    // This is called when the overall system is running low on memory,
    // and would like actively running processes to tighten their belts.
    // Overriding this method is totally optional!
    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    public int sLevel() {
        level += 1;
        return level;
    }

    public void Screen_size() {
        DisplayMetrics lDisplayMetrics = getResources().getDisplayMetrics();
        int widthPixels = lDisplayMetrics.widthPixels;
        int heightPixels = lDisplayMetrics.heightPixels;
    }

    public int speed_increase() {
        speed += 1;
        return speed;
    }

    public int speed_decrease() {
        if (speed > 3) {
            speed -= 1;
        }
        return speed;
    }

    public int speed() {
        return speed;
    }

    public int Score() {
        return score;
    }

    public int Level() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public int getWidthPixels() {
        return widthPixels;
    }

    public int getHeightPixels() {
        return heightPixels;
    }

    //    public int get_Screen_width(){
//        display.getSize(p);
//        int width = p.x;
//        return width;
//    }
//
//    public int get_Screen_height(){
//        display.getSize(p);
//        int height = p.y;
//        return height;
//    }


}
