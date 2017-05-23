package vivz.snakesnake;

import android.content.Context;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class Drawing_board extends View {


    int Score = 0;
    private Paint mPaint;
    int speed_positive;
    int speed_negative;
    ArrayList<Snake> snak;
    Apple apple;
    Blocks block;
    Context context;
    AttributeSet attribute_set;
    Snake_Application application;
    Boolean lose = false;
    Collision_detection collison;
    ArrayList<Rect> square_blocks;
    boolean blocks_inititialized;
    int widthpixel;
    int heightpixel;
//    public Canvas mCanvas;
//    public Bitmap mBitmap;

    public Drawing_board(Context c, AttributeSet attrs) {
        super(c, attrs);
        apple = new Apple(c);
        snak = new ArrayList<Snake>();
        block = new Blocks(c);
        this.context = c;
        this.attribute_set = attrs;
        application = (Snake_Application) c.getApplicationContext();

        final float textSize = 48f;
        mPaint = new Paint();
        mPaint.setAntiAlias(true);

        //  mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeJoin(Paint.Join.ROUND);
        mPaint.setStrokeWidth(4f);
        mPaint.setTextSize(textSize);

        speed_positive = application.speed();
        speed_negative = -application.speed();
        collison = new Collision_detection();
        square_blocks = new ArrayList<Rect>();
        blocks_inititialized = false;
       // DisplayMetrics lDisplayMetrics = c.getResources().getDisplayMetrics();
        widthpixel = application.getWidthPixels();
        heightpixel = application.getHeightPixels();
        this.set_snake();


    }


    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);



        for (int i = 0; i <= square_blocks.size() - 1; i++) {
            mPaint.setColor(Color.BLACK);
            mPaint.setStyle(Paint.Style.FILL);
            canvas.drawRect(square_blocks.get(i), mPaint);
        }


        for (int i = 0; i <= snak.size() - 1; i++) {
            // snak.get(i).draw(canvas);
            mPaint.setStyle(Paint.Style.STROKE);
            mPaint.setColor(Color.RED);
            canvas.drawCircle(snak.get(i).getPosition().x, snak.get(i).getPosition().y, snak.get(i).getRadius(), mPaint);
            snak.get(i).snake_motion();

        }
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.GREEN);
        canvas.drawCircle(apple.apple_x, apple.apple_y, apple.radius, mPaint);
        apple.position_bound();


        this.calculations();


    }


    // The below functions are used to change the direction of the snake

    //Moving the head og the snake in left direction
    public void move_left() {
        if (snak.get(0).getSpeedy() != 0) {
            snak.get(0).setSpeedy(0);
            snak.get(0).setSpeedx(speed_negative);
        }
    }

    //Moving the head og the snake in right direction
    public void move_right() {
        if (snak.get(0).getSpeedy() != 0) {
            snak.get(0).setSpeedy(0);
            snak.get(0).setSpeedx(speed_positive);
        }
    }

    //Moving the head og the snake in up direction
    public void move_up() {
        if (snak.get(0).getSpeedx() != 0) {
            snak.get(0).setSpeedx(0);
            snak.get(0).setSpeedy(speed_negative);
        }
    }

    //Moving the head og the snake in down direction
    public void move_down() {
        if (snak.get(0).getSpeedx() != 0) {
            snak.get(0).setSpeedx(0);
            snak.get(0).setSpeedy(speed_positive);
        }
    }


    //The set_poisition function is called by set_snake function whenevr a new point is added to the snake
    void set_position(int position, int level) {

        if (position == 0) {

//            snak.get(position).getPosition().x = 200;
//            snak.get(position).getPosition().y = 400;
            switch (level) {
                case 1:
                    snak.get(position).position.x = (int) (widthpixel * .278);
                    snak.get(position).position.y = (int) (heightpixel * .313);
                    break;

                case 2:
                    snak.get(position).position.x = (int) (widthpixel * .278);
                    snak.get(position).position.y = (int) (heightpixel * .313);
                    break;

                case 3:
                    snak.get(position).position.x = (int) (widthpixel * .278);
                    snak.get(position).position.y = (int) (heightpixel * .7819);
                    break;

                case 4:
                    snak.get(position).position.x = (int) (widthpixel * .839);
                    snak.get(position).position.y = (int) (heightpixel * .313);
                    break;

                case 5:
                    snak.get(position).position.x = (int) (widthpixel * .278);
                    snak.get(position).position.y = (int) (heightpixel * .313);
                    break;

                case 6:
                    snak.get(position).position.x = (int) (widthpixel * .278);
                    snak.get(position).position.y = (int) (heightpixel * .703);
                    break;

                case 7:
                    snak.get(position).position.x = 00;
                    snak.get(position).position.y = (int) (heightpixel * .65);
                    break;

            }

        } else {

            if (snak.get(position - 1).getSpeedy() > 0) {
                snak.get(position).getPosition().x = snak.get(position - 1).getPosition().x;
                snak.get(position).getPosition().y = snak.get(position - 1).getPosition().y - 30;
                snak.get(position).setSpeedx(0);
                snak.get(position).setSpeedy(speed_negative);
            }

            if (snak.get(position - 1).getSpeedy() < 0) {
                snak.get(position).getPosition().x = snak.get(position - 1).getPosition().x;
                snak.get(position).getPosition().y = snak.get(position - 1).getPosition().y + 30;
                snak.get(position).setSpeedx(0);
                snak.get(position).setSpeedy(speed_positive);
            }

            if (snak.get(position - 1).getSpeedx() > 0) {
                snak.get(position).getPosition().x = snak.get(position - 1).getPosition().x - 30;
                snak.get(position).getPosition().y = snak.get(position - 1).getPosition().y;
            }

            if (snak.get(position - 1).getSpeedx() < 0) {
                snak.get(position).getPosition().x = snak.get(position - 1).getPosition().x + 30;
                snak.get(position).getPosition().y = snak.get(position - 1).getPosition().y;
            }

        }

    }

    //The set_snake() is called whenever the snake eats an apple and the size of snake needs to be increased
    public void set_snake() {
        snak.add(new Snake(this.context));
        int position = snak.size() - 1;
        this.set_position(position, application.Level());
    }


    public void calculations() {

        //Initializing the blocks once in every level
        if (blocks_inititialized == false) {
            square_blocks = block.level(application.Level());
            blocks_inititialized = true;
        }


        // Detecting collision between apple and snake
        if (collison.Collision(snak.get(0).getPosition().x, snak.get(0).getPosition().y, snak.get(0).getRadius()
                , apple.apple_x, apple.apple_y, apple.radius)) {
            Score += 1;
            apple.set_applex();
            apple.set_appley();


            //The set_snake() is called whenever the snake eats an apple and the size of snake needs to be increased
            this.set_snake();
        }

        // Detecting collision between apple and wall
        for (int i = 0; i <= block.square_blocks.size() - 1; i++) {
            if (collison.Collision(block.square_blocks.get(i), apple.apple_x, apple.apple_y, apple.radius)) {
                apple.set_applex();
                apple.set_appley();
            }

            if (collison.internal_collision(block.square_blocks.get(i), apple.apple_x, apple.apple_y, apple.radius)) {
                apple.set_applex();
                apple.set_appley();
            }
        }

        //Turning the snake in down direction  after the head has been turned
        for (int i = 1; i <= snak.size() - 1; i++) {
            if (snak.get(i - 1).getSpeedx() == 0 && snak.get(i - 1).getSpeedy() == speed_positive) {
                if (snak.get(i).getPosition().x == snak.get(i - 1).getPosition().x) {
                    snak.get(i).setSpeedx(0);
                    snak.get(i).setSpeedy(speed_positive);

                }
            }
        }


        //Turning the snake in up direction  after the head has been turned
        for (int i = 1; i <= snak.size() - 1; i++) {
            if (snak.get(i - 1).getSpeedx() == 0 && snak.get(i - 1).getSpeedy() == speed_negative) {
                if (snak.get(i).getPosition().x == snak.get(i - 1).getPosition().x) {
                    snak.get(i).setSpeedx(0);
                    snak.get(i).setSpeedy(speed_negative);
                }
            }
        }


        //Turning the snake in right direction after the head has been turned
        for (int i = 1; i <= snak.size() - 1; i++) {
            if (snak.get(i - 1).getSpeedy() == 0 && snak.get(i - 1).getSpeedx() == speed_positive) {
                if (snak.get(i).getPosition().y == snak.get(i - 1).getPosition().y) {
                    snak.get(i).setSpeedx(speed_positive);
                    snak.get(i).setSpeedy(0);
                }
            }
        }


        //Turning the snake in left direction  after the head has been turned
        for (int i = 1; i <= snak.size() - 1; i++) {
            if (snak.get(i - 1).getSpeedy() == 0 && snak.get(i - 1).getSpeedx() == speed_negative) {
                if (snak.get(i).getPosition().y == snak.get(i - 1).getPosition().y) {
                    snak.get(i).setSpeedx(speed_negative);
                    snak.get(i).setSpeedy(0);
                }
            }
        }


        //detecting the collison between snake and wall
        if (application.Level() != 1) {
            for (int i = 0; i <= block.square_blocks.size() - 1; i++) {
                if (snak.get(0).getPosition().x >= block.square_blocks.get(i).left &&
                        snak.get(0).getPosition().x <= block.square_blocks.get(i).right
                        && (Math.abs(snak.get(0).getPosition().y - block.square_blocks.get(i).top) <= snak.get(0).getRadius() ||
                        Math.abs(snak.get(0).getPosition().y - block.square_blocks.get(i).bottom) <= snak.get(0).getRadius())) {

                    for (i = 0; i <= snak.size() - 1; i++) {
                        snak.get(i).setSpeedx(0);
                        snak.get(i).setSpeedy(0);
                    }

                    this.lose = true;
                    break;

                } else if (snak.get(0).getPosition().y >= block.square_blocks.get(i).top &&
                        snak.get(0).getPosition().y <= block.square_blocks.get(i).bottom
                        && (Math.abs(snak.get(0).getPosition().x - block.square_blocks.get(i).right) <= snak.get(0).getRadius()
                        || Math.abs(snak.get(0).getPosition().x - block.square_blocks.get(i).left) <= snak.get(0).getRadius())) {
                    for (i = 0; i <= snak.size() - 1; i++) {
                        snak.get(i).setSpeedx(0);
                        snak.get(i).setSpeedy(0);
                    }
                    this.lose = true;
                    break;
                }
            }
        }

// Winning condition
        if (this.Score == 4) {
            for (int i = 0; i <= snak.size() - 1; i++) {
                snak.get(i).setSpeedx(0);
                snak.get(i).setSpeedx(0);
            }
        }


    }


}
