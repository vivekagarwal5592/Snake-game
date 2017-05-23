package vivz.snakesnake;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;


public class Intro extends AppCompatActivity {

    String sl;
    Button exit;
    Button start;
    Button setting;
    Button about;
    Snake_Application application;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        application = (Snake_Application) getApplicationContext();
        application.setLevel(1);


        exit = (Button) findViewById(R.id.exit);

        exit.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                exit_permission();


                //   Intent i = new Intent();
                // i.setAction("Page_2");
                //    i.setClassName("vivz.snakesnake", "Start");
                //   i.setAction(Intent.ACTION_SEND);
                //  i.putExtra("kl", sl);
                //   Log.d("this is the first page", "This is the value of sl" + sl+ " this is it");
                //    i.setType("text/plain");
                //    startActivity(i);

            }

        });

        start = (Button) findViewById(R.id.start);

        start.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent i = new Intent();
                //  i.setAction("Page_2");
                i.setClassName("vivz.snakesnake", "vivz.snakesnake.Start");
                //   i.setAction(Intent.ACTION_SEND);
                //   i.putExtra("kl", sl);
                //   Log.d("this is the first page", "This is the value of sl" + sl+ " this is it");
                //      i.setType("text/plain");
                startActivity(i);


                //    Intent i = new Intent();

                //i.setClassName("vivz.snakesnake","Intro");
                // i.setClassName("vivz.snakesnake","Page_2");
                // startActivity(i);
            }

        });


        setting = (Button) findViewById(R.id.setting);

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent();
                i.setClassName("vivz.snakesnake", "vivz.snakesnake.Setting_Activity");
                startActivity(i);

            }
        });


        about = (Button) findViewById(R.id.about);

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent();
                i.setClassName("vivz.snakesnake", "vivz.snakesnake.About");
                startActivity(i);
            }

        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_page_1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void exit_permission() {

        AlertDialog.Builder alertbuild = new AlertDialog.Builder(this);

        alertbuild.setMessage("Are you sure you want to exit ?");
        //   alertbuild.setCancelable(false);

        alertbuild.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
//MainActivity.super.onBackPressed();

                System.exit(0);
            }
        });


        alertbuild.setNegativeButton("No", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
//MainActivity.super.onBackPressed();

            }


        });


        alertbuild.create().show();

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {

            AlertDialog.Builder alertbuild = new AlertDialog.Builder(this);

            alertbuild.setMessage("Are you sure you want to exit ?");
            //   alertbuild.setCancelable(false);

            alertbuild.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface dialog, int which) {
//MainActivity.super.onBackPressed();

                    finish();
                }
            });


            alertbuild.setNegativeButton("No", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface dialog, int which) {
//MainActivity.super.onBackPressed();

                }


            });


            alertbuild.create().show();


        }
        return true;
    }


//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//
//    }


}
