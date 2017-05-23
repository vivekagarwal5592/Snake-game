package vivz.snakesnake;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.widget.TextView;



public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView content = (TextView)findViewById(R.id.content);

        content.setText("The Classic Snake Game game with new excitement. " +
                "Enjoy the challenging levels and also delve into Nostalgia." +
                "Keep Calm. New Levels Coming Soon...");


    }

}
