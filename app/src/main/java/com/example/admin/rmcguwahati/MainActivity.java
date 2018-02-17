package com.example.admin.rmcguwahati;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Spinner spinner1 = (Spinner)findViewById(R.id.spinnerrmc);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.states));

        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner1.setAdapter(adapter1);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 1)
                {
                    startActivity(new Intent(MainActivity.this,AssamActivity.class));
                }
                else if(i == 2)
                {
                    startActivity(new Intent(MainActivity.this,MeghalayaActivity.class));
                }
                else if(i == 3)
                {
                    startActivity(new Intent(MainActivity.this,TripuraActivity.class));
                }
                else if(i == 4)
                {
                    startActivity(new Intent(MainActivity.this,NagalandActivity.class));
                }
                else if(i == 5)
                {
                    startActivity(new Intent(MainActivity.this,ManipurActivity.class));
                }
                else if(i == 6)
                {
                    startActivity(new Intent(MainActivity.this,MizoramActivity.class));
                }
                else if(i == 7)
                {
                    startActivity(new Intent(MainActivity.this,ArunachalActivity.class));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }
        public void meta (View view)
        {
            Intent met = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.imdguwahati.gov.in/tsght.htm"));
            startActivity(met);
        }

    public Button Button3;

    //public void init(){

      //  Button3= (Button)findViewById(R.id.button3);
        //Button3.setOnClickListener(new View.OnClickListener(){

          //  @Override
            //public void onClick(View v){
                public void Init(View v){

                Intent toy = new Intent(MainActivity.this,NowActivity.class);

                startActivity(toy);
            }
        //});


}
