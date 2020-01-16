package com.vaibhav.lakshya.miet;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class ThirdYearActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private ListView listView;
    private TextView backspace;
    private Button btn;
   private AdView madview;
    private InterstitialAd madview1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_year);
        madview = (AdView) findViewById(R.id.adView);
        madview1 = new InterstitialAd(ThirdYearActivity.this);
        madview1.setAdUnitId(getString(R.string.interstitial_ad_Unit_id));
        AdRequest adRequest = new AdRequest.Builder().build();
        madview.loadAd(adRequest);
        madview1.loadAd(adRequest);
        madview1.setAdListener(new AdListener() {
            public void onAdLoaded() {
                displayInterstitial();
            }
        });
        setupUIViews();
        initToolbar();
        setupListView();
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ThirdYearActivity.this,MainActivity.class));
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ThirdYearActivity.this,Download2Activity.class));
            }
        });

    }

    private void setupUIViews() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        listView = (ListView) findViewById(R.id.lvMain);
        backspace=(TextView)findViewById(R.id.backspace);
        btn=findViewById(R.id.bt);
    }

    private void initToolbar() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Third Year");

    }

    private void setupListView() {
        String[] title = getResources().getStringArray(R.array.third);
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, title);
        listView.setAdapter(simpleAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        startActivity(new Intent(ThirdYearActivity.this,WebTech.class));
                        break;
                    case 1:
                        startActivity(new Intent(ThirdYearActivity.this,DBMS.class));
                        break;
                    case 2:
                        startActivity(new Intent(ThirdYearActivity.this,CyberSecurity.class));
                        break;
                    case 3:
                        startActivity(new Intent(ThirdYearActivity.this,DAA.class));
                        break;
                    case 4:
                        startActivity(new Intent(ThirdYearActivity.this,MA.class));
                        break;
                    case 5:
                        startActivity(new Intent(ThirdYearActivity.this,PPL.class));
                        break;
                    case 6:
                        startActivity(new Intent(ThirdYearActivity.this,DataMining.class));
                        break;
                    case 7:
                        startActivity(new Intent(ThirdYearActivity.this,Sociology.class));
                        break;
                    case 8:
                        startActivity(new Intent(ThirdYearActivity.this,IndustrialManagement.class));
                        break;
                    case 9:
                        startActivity(new Intent(ThirdYearActivity.this,CompNetworks.class));
                        break;
                    case 10:
                        startActivity(new Intent(ThirdYearActivity.this,CompilerDesign.class));
                        break;
                    case 11:
                        startActivity(new Intent(ThirdYearActivity.this,ComGraphics.class));
                        break;
                    case 12:
                        startActivity(new Intent(ThirdYearActivity.this,Thirdyearass.class));
                        break;
                }
            }
        });


    }

    public class SimpleAdapter extends BaseAdapter {


        private Context mContext;
        private LayoutInflater layoutInflater;
        private TextView title;
        private String[] titleArray;
        private ImageView imageView;

        public SimpleAdapter(Context context, String[] title) {
            mContext = context;
            titleArray = title;
            layoutInflater = LayoutInflater.from(context);
        }

        @Override
        public int getCount() {
            return titleArray.length;
        }

        @Override
        public Object getItem(int position) {
            return titleArray[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = layoutInflater.inflate(R.layout.first_year, null);

            }
            title = (TextView) convertView.findViewById(R.id.tvMain);
            imageView = (ImageView) convertView.findViewById(R.id.ivMain);
            title.setText(titleArray[position]);

            imageView.setImageResource(R.drawable.book);

            return convertView;

        }

    }
    public void displayInterstitial(){
        if(madview1.isLoaded()){
            madview1.show();
        }
    }
}
