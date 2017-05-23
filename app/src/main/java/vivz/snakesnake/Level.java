package vivz.snakesnake;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Level extends AppCompatActivity {

    Snake_Application application;
    Button next_level;
    Button menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_level);
        application = (Snake_Application) getApplicationContext();
        setTitle("Snake Snake");

        next_level = (Button) findViewById(R.id.next_level);
        Bundle extras = getIntent().getExtras();
        String message = extras.getString("message");
        Boolean win_status = extras.getBoolean("game_status");
        TextView win_message = (TextView) findViewById(R.id.win);
        win_message.setText(message);
        if (win_status == true) {


            if (application.Level() == 7) {

                next_level.setVisibility(View.GONE);


            } else {
                next_level.setText("Next Level");
                next_level.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        application.sLevel();
                        Intent i = new Intent();
                        i.setClassName("vivz.snakesnake", "vivz.snakesnake.Start");
                        startActivity(i);


                    }
                });
            }
        } else {
            next_level.setText("Play Again");
            next_level.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    Intent i = new Intent();
                    i.setClassName("vivz.snakesnake", "vivz.snakesnake.Start");
                    startActivity(i);
                }
            });
        }

        menu = (Button) findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("vivz.snakesnake", "vivz.snakesnake.Intro");
                startActivity(i);
            }
        });


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent i = new Intent();
        i.setClassName("vivz.snakesnake", "vivz.snakesnake.Intro");
        startActivity(i);
    }
}
