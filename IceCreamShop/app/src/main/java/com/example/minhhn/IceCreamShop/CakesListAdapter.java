package com.example.minhhn.IceCreamShop;

import java.util.ArrayList;



import android.content.Context;
import android.graphics.Typeface;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.minhhn.creamshop.R;

public class CakesListAdapter extends ArrayAdapter<String>{

	private final Context context;
//	private final ArrayList<ScoreInfo> scoreList;
	String cake_names[], price_list[];
	int layoutID;


	public CakesListAdapter(Context context,String[] cake_names, String[] price_list,
							int layoutID) {
		super(context, layoutID);
	//	super();
		this.context = context;
	//	this.scoreList = scoreList;
		this.cake_names = cake_names;
		this.price_list = price_list;
		this.layoutID = layoutID;
	}

    @Override
    public int getCount() {
        return this.cake_names.length;
    }

    ImageView iv_avata;



	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {

		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(layoutID, parent, false);

		TextView tv_name = (TextView) rowView.findViewById(R.id.tv_name);

		iv_avata = (ImageView) rowView.findViewById(R.id.iv_avata);
		TextView tv_score = (TextView) rowView.findViewById(R.id.tv_score);
    //    Log.wtf("jjjj", position +"");
        if(tv_name == null)
    //    Log.wtf("aaa", cake_names[position]+"");
		tv_name.setText(cake_names[position]);
        if (position == 0) {
            tv_name.setText("Shake");
            iv_avata.setImageResource(R.drawable.shake);
        }
        if (position == 1) {
            tv_name.setText("Smoothie Peach");
            iv_avata.setImageResource(R.drawable.smoothiepeach);
        }
        if (position == 2) {
            tv_name.setText("Sundae");
            iv_avata.setImageResource(R.drawable.sundae);
        }
		tv_score.setText(String.valueOf(price_list[position]));


        return rowView;
	}
}
