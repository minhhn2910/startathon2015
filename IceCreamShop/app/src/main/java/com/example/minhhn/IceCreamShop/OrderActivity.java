package com.example.minhhn.IceCreamShop;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.minhhn.creamshop.R;

public class OrderActivity extends ActionBarActivity {
    Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        ListView cakeListView = (ListView) findViewById(R.id.listView);
        String cake_names [] = {"shake","smoothiepeach","sundae"};
        String price_list [] = {"4$","6$","5$"};
        CakesListAdapter cake_list_adapter = new CakesListAdapter(context,cake_names,price_list,
                R.layout.cakeslist);
        cakeListView.setAdapter(cake_list_adapter);


        cakeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Intent intent = new Intent(context, ConfirmOrderActivity.class);

                startActivity(intent);
            }
        });

    }


}
