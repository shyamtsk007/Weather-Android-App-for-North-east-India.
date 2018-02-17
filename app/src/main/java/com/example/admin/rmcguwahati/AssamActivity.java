package com.example.admin.rmcguwahati;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AssamActivity extends AppCompatActivity {

    ListView listview;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assam);

     listview = (ListView)findViewById(R.id.listview);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(AssamActivity.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.assam));
        listview.setAdapter(adapter2);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Intent intent = new Intent(Intent.ACTION_VIEW);
                //Intent intent = new Intent(AssamActivity.this,WebActivity.class);
                if (i == 0)
                {
                    Intent intent = new Intent(AssamActivity.this,WebAssamActivity.class);
                    startActivity(intent);
                }
                if (i == 1)
                {
                    Intent intent = new Intent(AssamActivity.this,WebAssam1Activity.class);
                    startActivity(intent);
                }
                if (i == 2)
                {
                    Intent intent = new Intent(AssamActivity.this,WebTezpurActivity.class);
                    startActivity(intent);
                }
                if (i == 3)
                {
                    Intent intent = new Intent(AssamActivity.this,WebNorthActivity.class);
                    startActivity(intent);
                }
                if (i == 4)
                {
                    Intent intent = new Intent(AssamActivity.this,WebSilcharActivity.class);
                    startActivity(intent);
                }
                if (i == 5)
                {
                    Intent intent = new Intent(AssamActivity.this,WebDhubriActivity.class);
                    startActivity(intent);
                }
                if (i == 6)
                {
                    Intent intent = new Intent(AssamActivity.this,WebJorhatActivity.class);
                    startActivity(intent);
                }
                if (i == 7)
                {
                    Intent intent = new Intent(AssamActivity.this,WebTinActivity.class);
                    startActivity(intent);
                }
                if (i == 8)
                {
                    Intent intent = new Intent(AssamActivity.this,WebGolaActivity.class);
                    startActivity(intent);
                }
                if (i == 9)
                {
                    Intent intent = new Intent(AssamActivity.this,WebBarActivity.class);
                    startActivity(intent);
                }
                if (i == 10)
                {
                    Intent intent = new Intent(AssamActivity.this,WebGoalActivity.class);
                    startActivity(intent);
                }
                if (i == 11)
                {
                    Intent intent = new Intent(AssamActivity.this,WebMazActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
