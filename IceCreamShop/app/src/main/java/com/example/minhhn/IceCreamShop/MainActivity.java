package com.example.minhhn.IceCreamShop;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import 	android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.content.Context;
import android.widget.ImageView;

import com.example.minhhn.creamshop.R;

public class MainActivity extends ActionBarActivity {

    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //<div>Icon made by <a href="http://www.freepik.com" title="Freepik">Freepik</a> from <a href="http://www.flaticon.com" title="Flaticon">www.flaticon.com</a> is licensed under <a href="http://creativecommons.org/licenses/by/3.0/" title="Creative Commons BY 3.0">CC BY 3.0</a></div>
        final Button order_button = (Button) findViewById(R.id.order_button);
        order_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(context
                        , OrderActivity.class);
                //    myIntent.putExtra("key", value); //Optional parameters
                context.startActivity(myIntent);
            }
        });


        final Button survey_btn = (Button) findViewById(R.id.survey_button);
        survey_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(context
                        ,SurveyActivity.class);
                //    myIntent.putExtra("key", value); //Optional parameters
                context.startActivity(myIntent);
            }
        });

        final Button btn_customize = (Button) findViewById(R.id.diy_button);
        btn_customize.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(context
                        ,CustomizeActivity.class);
                //    myIntent.putExtra("key", value); //Optional parameters
                context.startActivity(myIntent);
            }
        });

        final Button btn_qr = (Button) findViewById(R.id.btn_ScanQR);
        btn_qr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(context
                        ,ScanQRActivity.class);
                //    myIntent.putExtra("key", value); //Optional parameters
                context.startActivity(myIntent);
            }
        });

        ImageView imgview = (ImageView) findViewById(R.id.img_logo);
        imgview.setImageResource(R.drawable.logo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
