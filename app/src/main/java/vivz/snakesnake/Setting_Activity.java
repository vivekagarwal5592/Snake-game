package vivz.snakesnake;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Setting_Activity extends AppCompatActivity {

    Snake_Application application ;
    TextView show_speed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        application = (Snake_Application)getApplicationContext();
        setTitle("MENU");
//

        show_speed = (TextView)findViewById(R.id.show_speed);
        show_speed.setText(String.valueOf(application.speed()));


        Button speed_increase = (Button)findViewById(R.id.speed_increase);

        speed_increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                application.speed_increase();
               show_speed.setText(String.valueOf(application.speed()));

            }
        });

        Button speed_decrease = (Button)findViewById(R.id.speed_decrease);

        speed_decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                application.speed_decrease();
                show_speed.setText(String.valueOf(application.speed()));
            }
        });


    }

}
