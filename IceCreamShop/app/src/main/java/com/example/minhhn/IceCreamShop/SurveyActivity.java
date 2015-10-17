package com.example.minhhn.IceCreamShop;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

import com.example.minhhn.creamshop.R;

public class SurveyActivity extends ActionBarActivity {
    Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_layout);
//        this.getActionBar().hide();

        Button submit_survey = (Button) findViewById(R.id.bt_survey_submit);

        submit_survey.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(context
                        , AfterSurveyActivity.class);
                //    myIntent.putExtra("key", value); //Optional parameters
                context.startActivity(myIntent);
            }
        });
    }



}
