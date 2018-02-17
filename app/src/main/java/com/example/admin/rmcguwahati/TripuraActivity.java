package com.example.admin.rmcguwahati;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TripuraActivity extends AppCompatActivity {
        ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tripura);

        listview = (ListView)findViewById(R.id.listview);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(TripuraActivity.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.tripura));
        listview.setAdapter(adapter2);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Intent intent = new Intent(Intent.ACTION_VIEW);
                if (i == 0)
                {
                    Intent intent = new Intent(TripuraActivity.this,WebAgarActivity.class);
                    startActivity(intent);
                }
                if (i == 1)
                {
                    Intent intent = new Intent(TripuraActivity.this,WebKaiActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
