package com.example.admin.rmcguwahati;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NowActivity extends AppCompatActivity {
    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now);

        listview = (ListView)findViewById(R.id.listview);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(NowActivity.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.nowcasting));
        listview.setAdapter(adapter2);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Intent intent = new Intent(Intent.ACTION_VIEW);
                //Intent intent = new Intent(AssamActivity.this,WebActivity.class);
                if (i == 0)
                {
                    Intent intent = new Intent(NowActivity.this,NowGhyActivity.class);
                    startActivity(intent);
                }
                if (i == 1)
                {
                    Intent intent = new Intent(NowActivity.this,NowDibruActivity.class);
                    startActivity(intent);
                }
                if (i == 2)
                {
                    Intent intent = new Intent(NowActivity.this,NowShillActivity.class);
                    startActivity(intent);
                }
                if (i == 3)
                {
                    Intent intent = new Intent(NowActivity.this,NowJorActivity.class);
                    startActivity(intent);
                }
                if (i == 4)
                {
                    Intent intent = new Intent(NowActivity.this,NowDhubActivity.class);
                    startActivity(intent);
                }
                if (i == 5)
                {
                    Intent intent = new Intent(NowActivity.this,NowSilcActivity.class);
                    startActivity(intent);
                }
                if (i == 6)
                {
                    Intent intent = new Intent(NowActivity.this,NowLakhActivity.class);
                    startActivity(intent);
                }


            }
        });
    }
}
