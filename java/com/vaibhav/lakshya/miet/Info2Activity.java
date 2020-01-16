package com.vaibhav.lakshya.miet;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Info2Activity extends AppCompatActivity {
Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info2);
        bt=findViewById(R.id.bb);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("mailto:vaibhav.mittal.cs.2016@miet.ac.in");
                String[] from={" "};
                Intent intent=new Intent(Intent.ACTION_SEND,uri);
                intent.putExtra(Intent.EXTRA_CC,from);
                intent.putExtra(Intent.EXTRA_SUBJECT,"your subject");
                intent.putExtra(Intent.EXTRA_TEXT,"hello");
                intent.setType("text/plain");
                startActivity(intent);
            }
        });
    }
}
