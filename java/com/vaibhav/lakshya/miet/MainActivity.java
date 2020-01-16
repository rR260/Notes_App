package com.vaibhav.lakshya.miet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {

    private TextView firstYear,secondYear,thirdYear,fourthYear,info,info1,info2;
    AdView madview;
    InterstitialAd madview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstYear = (TextView) findViewById(R.id.firstyear);
        secondYear = (TextView) findViewById(R.id.secondyear);
        thirdYear = (TextView) findViewById(R.id.thirdyear);
        fourthYear = (TextView) findViewById(R.id.fourthyear);
        info = (TextView) findViewById(R.id.info);
        info1 = (TextView) findViewById(R.id.info1);
        madview = (AdView) findViewById(R.id.adView);
        madview1 = new InterstitialAd(MainActivity.this);
        madview1.setAdUnitId(getString(R.string.interstitial_ad_Unit_id));
        AdRequest adRequest = new AdRequest.Builder().build();
        madview.loadAd(adRequest);
        madview1.loadAd(adRequest);
        madview1.setAdListener(new AdListener() {
            public void onAdLoaded() {
                displayInterstitial();
            }
        });
        info2=(TextView)findViewById(R.id.info2);


        firstYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,FirstYearActivity.class));
            }
        });
        secondYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SecondYearActivity.class));
            }
        });
        thirdYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(MainActivity.this,ThirdYearActivity.class));
               Toast.makeText(MainActivity.this,"third",Toast.LENGTH_LONG).show();
            }
        });
        fourthYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(MainActivity.this,FourthYearActivity.class));
                Toast.makeText(getApplicationContext(),"Yet to Update",Toast.LENGTH_SHORT).show();
            }
        });
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,InfoActivity.class));
            }
        });
        info1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Info1Activity.class));
            }
        });
        info2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Info2Activity.class));
            }
        });
    }

    public void displayInterstitial(){
        if(madview1.isLoaded()){
            madview1.show();
        }
    }

}
