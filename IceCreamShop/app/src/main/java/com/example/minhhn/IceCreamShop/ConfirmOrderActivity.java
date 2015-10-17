package com.example.minhhn.IceCreamShop;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.minhhn.creamshop.R;

public class ConfirmOrderActivity extends ActionBarActivity {
    Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_order);

        final Button order_button = (Button) findViewById(R.id.button_y);
        order_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(context
                        , AfterOrderActivity.class);
                //    myIntent.putExtra("key", value); //Optional parameters
                context.startActivity(myIntent);
            }
        });

        ImageView imgview = (ImageView) findViewById(R.id.img_paypal);
        imgview.setImageResource(R.drawable.paypal);

        imgview = (ImageView) findViewById(R.id.img_visa);
        imgview.setImageResource(R.drawable.visa);

        imgview = (ImageView) findViewById(R.id.img_master);
        imgview.setImageResource(R.drawable.mastercard);

    }

}
