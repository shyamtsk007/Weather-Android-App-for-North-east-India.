package com.example.admin.rmcguwahati;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ArunachalActivity extends AppCompatActivity {

    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arunachal);

        listview = (ListView)findViewById(R.id.listview);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(ArunachalActivity.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.arunachal));
        listview.setAdapter(adapter2);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Intent intent = new Intent(Intent.ACTION_VIEW);
                if (i == 0)
                {
                    Intent intent = new Intent(ArunachalActivity.this,WebItaActivity.class);
                    startActivity(intent);
                }
                if (i == 1)
                {
                    Intent intent = new Intent(ArunachalActivity.this,WebPasActivity.class);
                    startActivity(intent);
                }
                if (i == 2)
                {
                    Intent intent = new Intent(ArunachalActivity.this,WebTawActivity.class);
                    startActivity(intent);
                }
                if (i == 3)
                {
                    Intent intent = new Intent(ArunachalActivity.this,WebAnnActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
}
