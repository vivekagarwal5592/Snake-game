package vivz.snakesnake;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;



public class Page_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "This is page 2", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });

        Intent intent = getIntent();
        Bundle extras = getIntent().getExtras();
        String id = extras.getString("kl");
int limit = Integer.parseInt(id);
            int series_length = 7;
            TextView result = (TextView)findViewById(R.id.result) ;
            result.setTextColor(Color.RED);

            int a,b,c;
            a=0;
            b=1;
            c=0;
           // Intent intent = getIntent();
          //  String action = intent.getAction();
            //String type = intent.getType();

            for(int i= 0;i<=limit;i++){
                c = a+ b;
                a=b;
                b=c;
            }
       String x =  Integer.toString(c);

//        if(id == "") {
//
//            result.setText("there is no data");
//        }
//        else if(id == null){
//
//            result.setText("the data is null");
//        }
//
//        else if(id ==" "){
//
//            result.setText("the data is null");
//        }
//
//        else {
            result.setText(x);}
//}
}
