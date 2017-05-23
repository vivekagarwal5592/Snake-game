package vivz.snakesnake;

import android.content.Context;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.DisplayMetrics;

import java.util.ArrayList;

/**
 * Created by user on 25-09-2016.
 */
public class Blocks {

    Paint mPaint = new Paint();
    double widthPixels;
    double heightPixels;
    Snake snak;


    ArrayList<Rect> square_blocks = new ArrayList<Rect>();

    int level;
    Snake_Application application;

    public Blocks(Context c) {

        snak = new Snake(c);
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setStrokeJoin(Paint.Join.ROUND);
        mPaint.setStrokeWidth(4f);
        mPaint.setTextSize(48f);
        DisplayMetrics lDisplayMetrics = c.getResources().getDisplayMetrics();
        widthPixels = lDisplayMetrics.widthPixels;
        heightPixels = lDisplayMetrics.heightPixels;
        application = (Snake_Application) c.getApplicationContext();
        level = application.Level();

    }


    public ArrayList<Rect> level(int level) {

        switch (level) {
            case 2:

                square_blocks.add(new Rect((int) (widthPixels * 0), (int) (heightPixels * (-.0079)), (int) (widthPixels * .0569), (int) (heightPixels * 1)));
                square_blocks.add(new Rect((int) (widthPixels * 0), (int) (heightPixels * (-.0079)), (int) (widthPixels * 1), (int) (heightPixels * .024)));
                square_blocks.add(new Rect((int) (widthPixels * .8619), (int) (heightPixels * (-.0079)), (int) (widthPixels * 1), (int) (heightPixels * 1)));
                square_blocks.add(new Rect((int) (widthPixels * 0), (int) (heightPixels * .8049), (int) (widthPixels * 1), (int) (heightPixels * 1)));


                return square_blocks;

            case 3:

//                square_blocks.add(new Rect(100, 100, 200, 200));
//                square_blocks.add(new Rect(300, 100, 400, 200));
//                square_blocks.add(new Rect(500, 100, 600, 200));
//
//                square_blocks.add(new Rect(100, 300, 200, 400));
//                square_blocks.add(new Rect(300, 300, 400, 400));
//                square_blocks.add(new Rect(500, 300, 600, 400));
//
//
//                square_blocks.add(new Rect(100, 500, 200, 600));
//                square_blocks.add(new Rect(300, 500, 400, 600));
//                square_blocks.add(new Rect(500, 500, 600, 600));


                square_blocks.add(new Rect((int) (widthPixels * .1389), (int) (heightPixels * .0779), (int) (widthPixels * .278), (int) (heightPixels * .156)));
                square_blocks.add(new Rect((int) (widthPixels * .417), (int) (heightPixels * .0779), (int) (widthPixels * .556), (int) (heightPixels * .156)));
                square_blocks.add(new Rect((int) (widthPixels * .695), (int) (heightPixels * .0779), (int) (widthPixels * .834), (int) (heightPixels * .156)));

                square_blocks.add(new Rect((int) (widthPixels * .1389), (int) (heightPixels * .235), (int) (widthPixels * .278), (int) (heightPixels * .313)));
                square_blocks.add(new Rect((int) (widthPixels * .417), (int) (heightPixels * .235), (int) (widthPixels * .556), (int) (heightPixels * .313)));
                square_blocks.add(new Rect((int) (widthPixels * .695), (int) (heightPixels * .235), (int) (widthPixels * .834), (int) (heightPixels * .313)));

                square_blocks.add(new Rect((int) (widthPixels * .1389), (int) (heightPixels * .391), (int) (widthPixels * .278), (int) (heightPixels * .469)));
                square_blocks.add(new Rect((int) (widthPixels * .417), (int) (heightPixels * .391), (int) (widthPixels * .556), (int) (heightPixels * .469)));
                square_blocks.add(new Rect((int) (widthPixels * .695), (int) (heightPixels * .391), (int) (widthPixels * .834), (int) (heightPixels * .469)));


                return square_blocks;


            case 4:
//                square_blocks.add(new Rect(150, 100, 180, 800));
//                square_blocks.add(new Rect(550, 100, 580, 800));

                square_blocks.add(new Rect((int) (widthPixels * .209), (int) (heightPixels * .0779), (int) (widthPixels * .25), (int) (heightPixels * .625)));
                square_blocks.add(new Rect((int) (widthPixels * .7639), (int) (heightPixels * .0779), (int) (widthPixels * .8059), (int) (heightPixels * .625)));


                return square_blocks;


            case 5:
//                square_blocks.add(new Rect(100, 100, 600, 120));
//                square_blocks.add(new Rect(100, 220, 600, 240));
//                square_blocks.add(new Rect(100, 340, 600, 360));
//                square_blocks.add(new Rect(100, 460, 600, 480));
//                square_blocks.add(new Rect(100, 580, 600, 600));
//                square_blocks.add(new Rect(100, 700, 600, 720));
//                square_blocks.add(new Rect(100, 820, 600, 840));

                square_blocks.add(new Rect((int) (widthPixels * .1389), (int) (heightPixels * .0779), (int) (widthPixels * .834), (int) (heightPixels * .0939)));
                square_blocks.add(new Rect((int) (widthPixels * .1389), (int) (heightPixels * .1719), (int) (widthPixels * .834), (int) (heightPixels * .1879)));
                square_blocks.add(new Rect((int) (widthPixels * .1389), (int) (heightPixels * .266), (int) (widthPixels * .834), (int) (heightPixels * .282)));
                square_blocks.add(new Rect((int) (widthPixels * .1389), (int) (heightPixels * .36), (int) (widthPixels * .834), (int) (heightPixels * .375)));
                square_blocks.add(new Rect((int) (widthPixels * .1389), (int) (heightPixels * .453), (int) (widthPixels * .834), (int) (heightPixels * .469)));
                square_blocks.add(new Rect((int) (widthPixels * .1389), (int) (heightPixels * .547), (int) (widthPixels * .834), (int) (heightPixels * .563)));
                square_blocks.add(new Rect((int) (widthPixels * .1389), (int) (heightPixels * .641), (int) (widthPixels * .834), (int) (heightPixels * .657)));


                return square_blocks;

            case 6:
//                square_blocks.add(new Rect(0, -10, 40, heightPixels));
//                square_blocks.add(new Rect(widthPixels - 100, -10, widthPixels, heightPixels));

                square_blocks.add(new Rect((int) (widthPixels * 0), (int) (heightPixels * (-.0079)), (int) (widthPixels * .0559), (int) (heightPixels * 1)));
                square_blocks.add(new Rect((int) (widthPixels * .8619), (int) (heightPixels * (-.0079)), (int) (widthPixels * 1), (int) (heightPixels * 1)));


                return square_blocks;

            case 7:
//                square_blocks.add(new Rect(00, 100, 50, 150));
//                square_blocks.add(new Rect(100, 100, 150, 150));
//                square_blocks.add(new Rect(200, 100, 250, 150));
//                square_blocks.add(new Rect(300, 100, 350, 150));
//                square_blocks.add(new Rect(400, 100, 450, 150));
//                square_blocks.add(new Rect(500, 100, 550, 150));
//                square_blocks.add(new Rect(600, 100, 650, 150));
//
//
//                square_blocks.add(new Rect(00, 300, 50, 350));
//                square_blocks.add(new Rect(100, 300, 150, 350));
//                square_blocks.add(new Rect(200, 300, 250, 350));
//                square_blocks.add(new Rect(300, 300, 350, 350));
//                square_blocks.add(new Rect(400, 300, 450, 350));
//                square_blocks.add(new Rect(500, 300, 550, 350));
//                square_blocks.add(new Rect(600, 300, 650, 350));
//
//
//                square_blocks.add(new Rect(00, 500, 50, 550));
//                square_blocks.add(new Rect(100, 500, 150, 550));
//                square_blocks.add(new Rect(200, 500, 250, 550));
//                square_blocks.add(new Rect(300, 500, 350, 550));
//                square_blocks.add(new Rect(400, 500, 450, 550));
//                square_blocks.add(new Rect(500, 500, 550, 550));
//                square_blocks.add(new Rect(600, 500, 650, 550));
//
//
//                square_blocks.add(new Rect(00, 700, 50, 750));
//                square_blocks.add(new Rect(100, 700, 150, 750));
//                square_blocks.add(new Rect(200, 700, 250, 750));
//                square_blocks.add(new Rect(300, 700, 350, 750));
//                square_blocks.add(new Rect(400, 700, 450, 750));
//                square_blocks.add(new Rect(500, 700, 550, 750));
//                square_blocks.add(new Rect(600, 700, 650, 750));


                square_blocks.add(new Rect((int) (widthPixels * 0), (int) (heightPixels * .0779), (int) (widthPixels * .07), (int) (heightPixels * .1169)));
                square_blocks.add(new Rect((int) (widthPixels * .1389), (int) (heightPixels * .0779), (int) (widthPixels * .209), (int) (heightPixels * .1169)));
                square_blocks.add(new Rect((int) (widthPixels * .278), (int) (heightPixels * .0779), (int) (widthPixels * .348), (int) (heightPixels * .1169)));
                square_blocks.add(new Rect((int) (widthPixels * .418), (int) (heightPixels * .0779), (int) (widthPixels * .487), (int) (heightPixels * .1169)));
                square_blocks.add(new Rect((int) (widthPixels * .556), (int) (heightPixels * .0779), (int) (widthPixels * .625), (int) (heightPixels * .1169)));
                square_blocks.add(new Rect((int) (widthPixels * .695), (int) (heightPixels * .0779), (int) (widthPixels * .7639), (int) (heightPixels * .1169)));
                square_blocks.add(new Rect((int) (widthPixels * .8339), (int) (heightPixels * .0779), (int) (widthPixels * .9029), (int) (heightPixels * .1169)));

                square_blocks.add(new Rect((int) (widthPixels * 0), (int) (heightPixels * .235), (int) (widthPixels * .07), (int) (heightPixels * .273)));
                square_blocks.add(new Rect((int) (widthPixels * .1389), (int) (heightPixels * .235), (int) (widthPixels * .209), (int) (heightPixels * .273)));
                square_blocks.add(new Rect((int) (widthPixels * .278), (int) (heightPixels * .235), (int) (widthPixels * .348), (int) (heightPixels * .273)));
                square_blocks.add(new Rect((int) (widthPixels * .418), (int) (heightPixels * .235), (int) (widthPixels * .487), (int) (heightPixels * .273)));
                square_blocks.add(new Rect((int) (widthPixels * .556), (int) (heightPixels * .235), (int) (widthPixels * .625), (int) (heightPixels * .273)));
                square_blocks.add(new Rect((int) (widthPixels * .695), (int) (heightPixels * .235), (int) (widthPixels * .7639), (int) (heightPixels * .273)));
                square_blocks.add(new Rect((int) (widthPixels * .8339), (int) (heightPixels * .235), (int) (widthPixels * .9029), (int) (heightPixels * .273)));

                square_blocks.add(new Rect((int) (widthPixels * 0), (int) (heightPixels * .391), (int) (widthPixels * .07), (int) (heightPixels * .430)));
                square_blocks.add(new Rect((int) (widthPixels * .1389), (int) (heightPixels * .391), (int) (widthPixels * .209), (int) (heightPixels * .430)));
                square_blocks.add(new Rect((int) (widthPixels * .278), (int) (heightPixels * .391), (int) (widthPixels * .348), (int) (heightPixels * .430)));
                square_blocks.add(new Rect((int) (widthPixels * .418), (int) (heightPixels * .391), (int) (widthPixels * .487), (int) (heightPixels * .430)));
                square_blocks.add(new Rect((int) (widthPixels * .556), (int) (heightPixels * .391), (int) (widthPixels * .625), (int) (heightPixels * .430)));
                square_blocks.add(new Rect((int) (widthPixels * .695), (int) (heightPixels * .391), (int) (widthPixels * .7639), (int) (heightPixels * .430)));
                square_blocks.add(new Rect((int) (widthPixels * .8339), (int) (heightPixels * .391), (int) (widthPixels * .9029), (int) (heightPixels * .430)));


                square_blocks.add(new Rect((int) (widthPixels * 0), (int) (heightPixels * .547), (int) (widthPixels * .07), (int) (heightPixels * .586)));
                square_blocks.add(new Rect((int) (widthPixels * .1389), (int) (heightPixels * .547), (int) (widthPixels * .209), (int) (heightPixels * .586)));
                square_blocks.add(new Rect((int) (widthPixels * .278), (int) (heightPixels * .547), (int) (widthPixels * .348), (int) (heightPixels * .586)));
                square_blocks.add(new Rect((int) (widthPixels * .418), (int) (heightPixels * .547), (int) (widthPixels * .487), (int) (heightPixels * .586)));
                square_blocks.add(new Rect((int) (widthPixels * .556), (int) (heightPixels * .547), (int) (widthPixels * .625), (int) (heightPixels * .586)));
                square_blocks.add(new Rect((int) (widthPixels * .695), (int) (heightPixels * .547), (int) (widthPixels * .7639), (int) (heightPixels * .586)));
                square_blocks.add(new Rect((int) (widthPixels * .8339), (int) (heightPixels * .547), (int) (widthPixels * .9029), (int) (heightPixels * .586)));

                square_blocks.add(new Rect((int) (widthPixels * 0), (int) (heightPixels * .703), (int) (widthPixels * .07), (int) (heightPixels * .742)));
                square_blocks.add(new Rect((int) (widthPixels * .1389), (int) (heightPixels * .703), (int) (widthPixels * .209), (int) (heightPixels * .742)));
                square_blocks.add(new Rect((int) (widthPixels * .278), (int) (heightPixels * .703), (int) (widthPixels * .348), (int) (heightPixels * .742)));
                square_blocks.add(new Rect((int) (widthPixels * .418), (int) (heightPixels * .703), (int) (widthPixels * .487), (int) (heightPixels * .742)));
                square_blocks.add(new Rect((int) (widthPixels * .556), (int) (heightPixels * .703), (int) (widthPixels * .625), (int) (heightPixels * .742)));
                square_blocks.add(new Rect((int) (widthPixels * .695), (int) (heightPixels * .703), (int) (widthPixels * .7639), (int) (heightPixels * .742)));
                square_blocks.add(new Rect((int) (widthPixels * .8339), (int) (heightPixels * .703), (int) (widthPixels * .9029), (int) (heightPixels * .742)));


//                square_blocks.add(new Rect(100, 300, 200, 400));
//                square_blocks.add(new Rect(300, 300, 400, 400));
//                square_blocks.add(new Rect(500, 300, 600, 400));
//
//
//                square_blocks.add(new Rect(100, 500, 200, 600));
//                square_blocks.add(new Rect(300, 500, 400, 600));
//                square_blocks.add(new Rect(500, 500, 600, 600));
                return square_blocks;

            default:
                return square_blocks;
        }


    }


//    public void Collision(){
//        for (int i = 0; i <= this.square_blocks.size() - 1; i++) {
//            if (collison.Collision(this.square_blocks.get(i), snak.get(0).getPosition().x, snak.get(0).getPosition().x, snak.get(0).getRadius())) {
//
//                for (i = 0; i <= snak.size() - 1; i++) {
//                    snak.get(i).speedy = 0;
//                    snak.get(i).speedx = 0;
//                }
//                this.lose = true;
//                break;
//            }
//        }
//    }

}
