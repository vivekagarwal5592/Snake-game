package vivz.snakesnake;

import android.content.Context;

import android.graphics.Color;
import android.graphics.Paint;

import android.util.DisplayMetrics;

import java.util.Random;

/**
 * Created by user on 30-08-2016.
 */
public class Apple{


    int width_x ;
    int width_y ;
    int apple_x = 300;
    int apple_y = 400;
    int radius;
    int min = 50;
    Paint mpaint = new Paint();
    Random r = new Random();

    public Apple(Context c) {

//

        DisplayMetrics lDisplayMetrics = c.getResources().getDisplayMetrics();
        width_x = (int)(lDisplayMetrics.widthPixels);
        width_y = (int)(lDisplayMetrics.heightPixels);
        radius = 15;
    }


    protected void position_bound() {


//         apple_x = r.nextInt(width_x - min + 1) + min;
  //      apple_y = r.nextInt(width_y - min + 1) + min;



        //canvas.drawRect(100,200,200,400,mpaint);
        //   invalidate();

        if(this.apple_x >=  width_x*.723){
            this.apple_x = r.nextInt((int)(width_x*.723));
        }

        if(this.apple_x <=  width_x*.0699){
            this.apple_x = r.nextInt((int)(width_x*.723));
        }

        if(this.apple_y <= width_y*.1169){
            this.apple_y =  r.nextInt((int)(width_y*.8049));
        }

        if(this.apple_y >= width_y){
            this.apple_y = r.nextInt((int)(width_y*.8049));
        }

    }

    public void set_applex() {
         this.apple_x = r.nextInt((int)(width_x*.723)) ;
    }

    public void set_appley() {
        this.apple_y = r.nextInt((int)(width_y*.8049));
    }


}



