package com.example.minhhn.IceCreamShop;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.minhhn.creamshop.R;

public class CustomizeActivity extends ActionBarActivity {
    Context context = this;
    TextView price_value ;
    float final_price = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customize);
        price_value = (TextView) findViewById(R.id.tv_price_value);
        price_value.setText("$8.17");
        final_price = 0;

        final Button order_button = (Button) findViewById(R.id.btn_customize_order);
        order_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(context
                        , ConfirmOrderActivity.class);
                //    myIntent.putExtra("key", value); //Optional parameters
                context.startActivity(myIntent);
            }
        });



        RadioGroup rg_flavour = (RadioGroup)findViewById(R.id.rg_flavour);
        rg_flavour.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                RadioGroup rg_flavour = (RadioGroup) findViewById(R.id.rg_flavour);
                RadioGroup rg_shape = (RadioGroup) findViewById(R.id.rg_shape);
                RadioGroup rg_sweet = (RadioGroup) findViewById(R.id.rg_sweet);
                final_price = 1.0f;
                String radiovalue = ((RadioButton) findViewById(rg_flavour.getCheckedRadioButtonId())).getText().toString();
                if (radiovalue!= null) final_price = final_price + radiovalue.length() / 2.0f;
                radiovalue = ((RadioButton) findViewById(rg_shape.getCheckedRadioButtonId())).getText().toString();
                    if (radiovalue!= null) final_price = final_price + radiovalue.length() / 3.0f;
                radiovalue = ((RadioButton) findViewById(rg_sweet.getCheckedRadioButtonId())).getText().toString();
                if (radiovalue!= null) final_price = final_price + radiovalue.length() / 10.0f;
                String result = String.format("%.2f", final_price);
                price_value.setText("$"+result);

            }
        });


        RadioGroup rg_shape = (RadioGroup)findViewById(R.id.rg_shape);
        rg_shape.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                RadioGroup rg_flavour = (RadioGroup)findViewById(R.id.rg_flavour);
                RadioGroup rg_shape = (RadioGroup)findViewById(R.id.rg_shape);
                RadioGroup rg_sweet = (RadioGroup)findViewById(R.id.rg_sweet);
                final_price = 1.0f;
                String radiovalue = ((RadioButton)findViewById(rg_flavour.getCheckedRadioButtonId())).getText().toString();
                if (radiovalue!= null) final_price = final_price+ radiovalue.length()/2.0f;
                radiovalue = ((RadioButton)findViewById(rg_shape.getCheckedRadioButtonId())).getText().toString();
                if (radiovalue!= null) final_price = final_price+ radiovalue.length()/3.0f;
                radiovalue = ((RadioButton)findViewById(rg_sweet.getCheckedRadioButtonId())).getText().toString();
                if (radiovalue!= null) final_price = final_price+ radiovalue.length()/10.0f;
                String result = String.format("%.2f", final_price);
                price_value.setText("$"+result);

            }
        });


        RadioGroup rg_sweet = (RadioGroup)findViewById(R.id.rg_sweet);
        rg_sweet.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                RadioGroup rg_flavour = (RadioGroup)findViewById(R.id.rg_flavour);
                RadioGroup rg_shape = (RadioGroup)findViewById(R.id.rg_shape);
                RadioGroup rg_sweet = (RadioGroup)findViewById(R.id.rg_sweet);
                final_price = 1.0f;
                String radiovalue = ((RadioButton)findViewById(rg_flavour.getCheckedRadioButtonId())).getText().toString();
                if (radiovalue!= null) final_price = final_price+ radiovalue.length()/2.0f;
                radiovalue = ((RadioButton)findViewById(rg_shape.getCheckedRadioButtonId())).getText().toString();
                if (radiovalue!= null) final_price = final_price+ radiovalue.length()/3.0f;
                radiovalue = ((RadioButton)findViewById(rg_sweet.getCheckedRadioButtonId())).getText().toString();
                if (radiovalue!= null) final_price = final_price+ radiovalue.length()/10.0f;
                String result = String.format("%.2f", final_price);
                price_value.setText("$"+result);

            }
        });

    }


}
