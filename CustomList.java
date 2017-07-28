package com.example.umar.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import android.widget.TextView;

public class CustomList extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 1000;

    int [] IMAGES = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3};

    String [] NAMES = {"Appetizers", "Speciality Pizzas", "Drinks" };

    String [] DESCRIPTIONS = {"Get Your Taste buds started", "All you can eat", "Specially for you"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_custom_list);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(CustomList.this, FourthActivity.class);
                startActivity(homeIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);




        ListView ListView= (ListView)findViewById(R.id.ListView);

        CustomAdapter customerAdapter = new CustomAdapter();

        ListView.setAdapter(customerAdapter);

    }
    class CustomAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.customlayout,null);


            ImageView imageView2 = (ImageView)convertView.findViewById(R.id.imageView2);
            TextView textView_name = (TextView) convertView.findViewById(R.id.textView_name);
            TextView textView_description = (TextView) convertView.findViewById(R.id.textView_description);

            imageView2.setImageResource(IMAGES[position]);
            textView_name.setText(NAMES[position]);
            textView_description.setText(DESCRIPTIONS[position]);

            return convertView;
        }
    }
}
