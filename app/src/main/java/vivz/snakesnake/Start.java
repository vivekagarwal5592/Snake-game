package vivz.snakesnake;


import android.content.Context;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Message;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;


import android.os.Handler;

import org.w3c.dom.Text;

import static android.app.PendingIntent.getActivity;


public class Start extends AppCompatActivity {

    private Drawing_board customCanvas;

    Handler handler;
    Thread thread;
    TextView score;
    Snake_Application application;
    Boolean thread_interruption = false;

    public void setCustomEventListener(Check_for_win eventListener) {

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_0);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);


        TextView par = (TextView) findViewById(R.id.par);
        score = (TextView) findViewById(R.id.score);
        par.setText("Par : 4");
        application = (Snake_Application) getApplicationContext();
       // this.setDisplayShowTitleEnabled(true);

        Toolbar mActionBarToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mActionBarToolbar);
        getSupportActionBar().setTitle("Level " + String.valueOf(application.Level()));



        customCanvas = (Drawing_board) findViewById(R.id.signature_canvas);


       // Thread run_drawing_board = new Thread(new Drawing_board(getApplicationContext(),));
       // run_drawing_board.start();

//        this.setCustomEventListener(new Check_for_win() {
//
//            @Override
//            public void check(int newValue) {
//
//            }
//        });
//
//
//        check obsInt = new check();
//
//        obsInt.setOnIntegerChangeListener(new Check_for_win() {
//
//            @Override
//            public void check(int newValue) {
//
//            }
//        });

        if (application.Level() == 2) {
            score.setPadding(30, 30, 0, 0);
            par.setPadding(30, 30, 0, 0);
        }

        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    customCanvas.invalidate();
                //    SurfaceView sv = new SurfaceView(context);
//                    Bitmap pallet = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
//                    Canvas canvas = new Canvas(pallet);
//                    SurfaceHolder h;
//                    customCanvas.onDraw(canvas);

                 //   customCanvas.snak.get(0).getPosition().x += 50;
                    score.setText("Score ");

                    score.append(String.valueOf(customCanvas.Score));

                //    Log.e("Value of canvas", String.valueOf(customCanvas.snak.get(0).getPosition().x));

                    if (customCanvas.Score == 4) {
                        thread_interruption = true;
                        thread.interrupt();
                        go_to_win();

                    }

                    if (customCanvas.lose == true) {
                        customCanvas.lose = false;
                        go_to_lose();
                    }

                    if( thread_interruption == false){
                        handler.postDelayed(this, 10);
                    }

                 //   customCanvas.recycling();


                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


        handler = new Handler() {
            public void handleMessage(Message msg) {
            }
        };


        if (thread_interruption == false) {
            thread.start();
        }


        ImageButton down = (ImageButton) findViewById(R.id.down);


        down.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                customCanvas.move_down();

            }


        });

        ImageButton up = (ImageButton) findViewById(R.id.up);

        up.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                customCanvas.move_up();
            }
        });


        ImageButton right_button = (ImageButton) findViewById(R.id.right);

        right_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                customCanvas.move_right();
            }


        });


        ImageButton left_button = (ImageButton) findViewById(R.id.left);

        left_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                customCanvas.move_left();

            }


        });


        Context c = getApplicationContext();
        View v;
        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.tv_data, null);

        TextView zero = (TextView) findViewById(R.id.zero);
        TextView first = (TextView) findViewById(R.id.first);
    }


    public void go_to_win() {

//        thread.interrupt();
        Intent i = new Intent();
        boolean win = true;
        String message = "You Win Level " + String.valueOf(application.Level());
        i.putExtra("message", message);
        i.putExtra("game_status", win);
        i.setClassName("vivz.snakesnake", "vivz.snakesnake.Level");
        startActivity(i);
    }

    public void go_to_lose() {
//        thread.interrupt();
        Intent i = new Intent();
        String message = "You Lose. Try again";
        boolean win = false;
        i.putExtra("message", message);
        i.putExtra("game_status", win);
        i.setClassName("vivz.snakesnake", "vivz.snakesnake.Level");
        startActivity(i);
    }


}

