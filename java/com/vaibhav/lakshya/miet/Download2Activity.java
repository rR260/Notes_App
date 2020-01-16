package com.vaibhav.lakshya.miet;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Download2Activity extends AppCompatActivity {
    private Spinner sp,sp1,sp2,sp3,sp4,sp5,sp6,sp7,sp8,sp9,sp10,sp11;
    DownloadManager downloadManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download2);
        sp=findViewById(R.id.sp);
        sp1=findViewById(R.id.sp1);
        sp2=findViewById(R.id.sp2);
        sp3=findViewById(R.id.sp3);
        sp4=findViewById(R.id.sp4);
        sp5=findViewById(R.id.sp5);
        sp6=findViewById(R.id.sp6);
        sp7=findViewById(R.id.sp7);
        sp8=findViewById(R.id.sp8);
        sp9=findViewById(R.id.sp9);
        sp10=findViewById(R.id.sp10);
        sp11=findViewById(R.id.sp11);
        List<String> categories=new ArrayList<>();
        categories.add(0,"Web Tech");
        categories.add("Unit 1");
        categories.add("Unit 2");
        categories.add("Unit 3");
        categories.add("Unit 4");
        categories.add("Unit 5");
        ArrayAdapter<String> arrayAdapter;
        arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,categories);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(arrayAdapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(parent.getItemAtPosition(position).equals("Web Tech")){

                }
                else{
                    String item=parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected"+item,Toast.LENGTH_LONG).show();
                    if(item.equals("Unit 1")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1GBz9sduDqQ6w2qSLSSgk8nG7BFjmSTWe/view?usp=drivesd");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 2")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1lCrXBTG9M0gxLgc7N4c7WnoEN_tRgtuC/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 3")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1N0yrHP-z64g7z5uZquZEm0CreVTLnEvT/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 4")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1tXYiz4l_WpZ8u5BowtEl6F9ylq5V2mbv/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }

                    else if(item.equals("Unit 5")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1a1QTl5IfUCwYs68RcUPmon4zgfHrjf3M/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        });
        List<String> categories1=new ArrayList<>();
        categories1.add(0,"DBMS");
        categories1.add("Unit 1");
        categories1.add("Unit 2");
        categories1.add("Unit 3");
        categories1.add("Unit 4");
        categories1.add("Unit 5");
        ArrayAdapter<String> arrayAdapter1;
        arrayAdapter1=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,categories1);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(arrayAdapter1);
        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(parent.getItemAtPosition(position).equals("DBMS")){

                }
                else{
                    String item=parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected"+item,Toast.LENGTH_LONG).show();
                    if(item.equals("Unit 1")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1Ul4OIGSHeaHIY5l8yXOLhP309IZaXDNf/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 2")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1RXyJQ8DvbVD9grWn-sOtY3HProPvIOHY/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 3")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1UsgQefvxuqpOx0rmk-YMNRg21-JnL68P/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 4")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1OSNIXVvAX5pmVq7Ms8F97FKwY61yXZ6n/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 5")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1j3PqFEY0XRsCgJKUhyGDNmk4jzpsJpYn/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        });
        List<String> categories2=new ArrayList<>();
        categories2.add(0,"Cyber Security");
        categories2.add("Unit 1");
        categories2.add("Unit 2");
        categories2.add("Unit 3");
        categories2.add("Unit 4");
        categories2.add("Unit 5");
        ArrayAdapter<String> arrayAdapter2;
        arrayAdapter2=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,categories2);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp2.setAdapter(arrayAdapter2);
        sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(parent.getItemAtPosition(position).equals("Cyber Security")){

                }
                else{
                    String item=parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected"+item,Toast.LENGTH_LONG).show();
                    if(item.equals("Unit 1")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1FqV4Og7sKwJ0lY0M2plEG8VFCBRJ9sUj/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 2")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/folderview?id=1nJNbByCbbPHHaoVUNa_nN1LW7EfppoQR");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 3")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1wOPaAP6gy0C7CCKvuWm7J6BhseSiwsV2/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 4")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/folderview?id=1P3p8ogFMmADExz4v791VdrqxuZ-lZBjc");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 5")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1ZHeq9oDBdCN_RKjRl0FmQyOs1wFdcQan/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        });
        List<String> categories3=new ArrayList<>();
        categories3.add(0,"DAA");
        categories3.add("Unit 1");
        categories3.add("Unit 2");
        categories3.add("Unit 3");
        categories3.add("Unit 4");
        categories3.add("Unit 5");
        ArrayAdapter<String> arrayAdapter3;
        arrayAdapter3=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,categories3);
        arrayAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp3.setAdapter(arrayAdapter3);
        sp3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(parent.getItemAtPosition(position).equals("DAA")){

                }
                else{
                    String item=parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected"+item,Toast.LENGTH_LONG).show();
                    if(item.equals("Unit 1")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/folderview?id=1zt4QUj3eGrLbnsOKAFC99Svc2DjrzMoH");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 2")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/folderview?id=1o9OmHhwMXMQWEK5WvjtLgjYowdwMauDB");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 3")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/folderview?id=1VR5FtPlpOVfN6DMwCfNwdw9OFcU2EXfh");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 4")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/folderview?id=1YAg8I17J_phhQ1fHipjCAh-I0LueRUfd");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 5")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/folderview?id=1n94HTUlqr6r6MKm4IjCgqGuO0iIeoshZ");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        });
        List<String> categories4=new ArrayList<>();
        categories4.add(0,"Eco");
        categories4.add("Unit 1");
        categories4.add("Unit 2");
        categories4.add("Unit 3");
        categories4.add("Unit 4");
        categories4.add("Unit 5");
        ArrayAdapter<String> arrayAdapter4;
        arrayAdapter4=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,categories4);
        arrayAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp4.setAdapter(arrayAdapter4);
        sp4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(parent.getItemAtPosition(position).equals("Eco")){

                }
                else{
                    String item=parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected"+item,Toast.LENGTH_LONG).show();
                    if(item.equals("Unit 1")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1ZBijzT1v2VdP1mp-i6Cn_TnAdKXPXoxU/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 2")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1O9wFBMAdid63lAqJJkG2chTUoYa5MKce/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 3")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1mx0VccYdkokKF4MD3nWlalJuAMVNnVZE/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 4")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1DnGmpBtQiTgmupjLuA5R8oy_F0UPZKnf/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 5")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1tB8dCF0Yeo5jk4sWYyt41YDJH6k9VY91/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        });
        List<String> categories5=new ArrayList<>();
        categories5.add(0,"PPL");
        categories5.add("Unit 1");
        categories5.add("Unit 2");
        categories5.add("Unit 3");
        categories5.add("Unit 4");
        categories5.add("Unit 5");
        ArrayAdapter<String> arrayAdapter5;
        arrayAdapter5=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,categories5);
        arrayAdapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp5.setAdapter(arrayAdapter5);
        sp5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(parent.getItemAtPosition(position).equals("PPL")){

                }
                else{
                    String item=parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected"+item,Toast.LENGTH_LONG).show();
                    if(item.equals("Unit 1")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1QwfAd6FItdtBIrjn1zrVSn9jdZzaqk5Z/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 2")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/folderview?id=1zzw6j-x1uNNjhWnjUCkdhqqEUj4rLS98");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 3")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/folderview?id=10PBjDzjxpSqV06V7R6VbnFdHCHa3FU9t");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 4")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1SJcCgnAJWvq8P8nTqX-MBEOI1yjJGpcq/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 5")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/folderview?id=13hzpSEOjtOG1vFOmvuQ4Nrp7xqRPq-7S");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        });
        List<String> categories6=new ArrayList<>();
        categories6.add(0,"Data Mining");
        categories6.add("Unit 1");
        categories6.add("Unit 2");
        categories6.add("Unit 3");
        categories6.add("Unit 4");
        categories6.add("Unit 5");
        ArrayAdapter<String> arrayAdapter6;
        arrayAdapter6=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,categories6);
        arrayAdapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp6.setAdapter(arrayAdapter6);
        sp6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(parent.getItemAtPosition(position).equals("Data Mining")){

                }
                else{
                    String item=parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected"+item,Toast.LENGTH_LONG).show();
                    if(item.equals("Unit 1")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/file/d/1hvPiEZKR-q9RKcktKQPqyaHkrQR7SZUS/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 2")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/file/d/1P6tEuU919N3q8-efh67dYaPuXm3PTkw5/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 3")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/file/d/1jnCuj2I0YSSWn3cNYHPVr7kaTAVhu3hz/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 4")){
                       Toast.makeText(Download2Activity.this,"Yet to Update",Toast.LENGTH_LONG).show();
                    }
                    else if(item.equals("Unit 5")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/file/d/1gfrGGBYsEjGIu6ISAPRjZ-nTSAtBV4dn/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        });
        List<String> categories7=new ArrayList<>();
        categories7.add(0,"Sociology");
        categories7.add("Unit 1");
        categories7.add("Unit 2");
        categories7.add("Unit 3");
        categories7.add("Unit 4");
        categories7.add("Unit 5");
        ArrayAdapter<String> arrayAdapter7;
        arrayAdapter7=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,categories7);
        arrayAdapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp7.setAdapter(arrayAdapter7);
        sp7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(parent.getItemAtPosition(position).equals("Sociology")){

                }
                else{
                    String item=parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected"+item,Toast.LENGTH_LONG).show();
                    if(item.equals("Unit 1")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/file/d/1HD_omUHkkcCXXY_NOTB_7XY13ZGQC8gx/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 2")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/file/d/1r23Gew1iZTLV8WD-y1QV5lfY9ou4JZTy/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 3")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/file/d/18Zn28RUNoTKj2cmuVIOLLK5iiocQZcyp/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 4")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/file/d/1jd5dykKI0Y8vWmTFeZoQ3H6sxHlNE4DY/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 5")){
                       Toast.makeText(Download2Activity.this,"Yet to update",Toast.LENGTH_LONG).show();
                    }
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        });
        List<String> categories8=new ArrayList<>();
        categories8.add(0,"Industrial Management");
        categories8.add("Unit 1");
        categories8.add("Unit 2");
        categories8.add("Unit 3");
        categories8.add("Unit 4");
        categories8.add("Unit 5");
        ArrayAdapter<String> arrayAdapter8;
        arrayAdapter8=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,categories8);
        arrayAdapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp8.setAdapter(arrayAdapter8);
        sp8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(parent.getItemAtPosition(position).equals("Industrial Management")){

                }
                else{
                    String item=parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected"+item,Toast.LENGTH_LONG).show();
                    if(item.equals("Unit 1")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/file/d/1CpUK3Dgj9IQqldhlqLPvQJfbjEAgt8W0/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 2")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/file/d/1fAjpCrKiccp8RVj8xmtBDz816N84l86j/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 3")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/file/d/1UCo0MLaaYdp_3ilLPQXDu6akJjhcee1m/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 4")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/file/d/1e6BTN5L0Uf3AoT8QdZK88ZH8bqddRwAG/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 5")){
                        Toast.makeText(Download2Activity.this,"Yet to update",Toast.LENGTH_LONG).show();
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        });
        List<String> categories9=new ArrayList<>();
        categories9.add(0,"Comp Networks");
        categories9.add("Unit 1");
        categories9.add("Unit 2");
        categories9.add("Unit 3");
        categories9.add("Unit 4");
        categories9.add("Unit 5");
        ArrayAdapter<String> arrayAdapter9;
        arrayAdapter9=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,categories9);
        arrayAdapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp9.setAdapter(arrayAdapter9);
        sp9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(parent.getItemAtPosition(position).equals("Comp Networks")){

                }
                else{
                    String item=parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected"+item,Toast.LENGTH_LONG).show();
                    if(item.equals("Unit 1")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/file/d/1wvQp9ow1FiiHRGOGj3Nnd9PBHdIrwfQ3/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 2")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/file/d/1hRyJfTwLmjV_KHvqz8npEDE46jAV1IzV/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 3")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/file/d/1qPAqvxPBCGZz7FbA1J53Xs1qVHZbvIg1/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 4")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/file/d/1n1t3Kljr3YIDbr1mpRt6EpJioztNCsJN/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 5")){
                      Toast.makeText(Download2Activity.this,"Yet to update",Toast.LENGTH_LONG).show();
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        });
        List<String> categories10=new ArrayList<>();
        categories10.add(0,"Compiler Design");
        categories10.add("Unit 1");
        categories10.add("Unit 2");
        categories10.add("Unit 3");
        categories10.add("Unit 4");
        categories10.add("Unit 5");
        ArrayAdapter<String> arrayAdapter10;
        arrayAdapter10=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,categories10);
        arrayAdapter10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp10.setAdapter(arrayAdapter10);
        sp10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(parent.getItemAtPosition(position).equals("Compiler Design")){

                }
                else {
                    String item = parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(), "Selected" + item, Toast.LENGTH_LONG).show();
                    if (item.equals("Unit 1")) {
                        downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri = Uri.parse("https://drive.google.com/file/d/1V-SOBLW64jzPA9YN_IJxH7ptYQNnk0Wm/view?usp=drivesdk");
                        DownloadManager.Request request = new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference = downloadManager.enqueue(request);
                    } else if (item.equals("Unit 2")) {
                        downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri = Uri.parse("https://drive.google.com/file/d/1Nj0i8epi5sopCGbl7G6WJY8vp8JuwBum/view?usp=drivesdk");
                        DownloadManager.Request request = new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference = downloadManager.enqueue(request);
                    } else if (item.equals("Unit 3")) {
                        downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri = Uri.parse("https://drive.google.com/file/d/1h_7fXxyEcB6B6N1Kwq7Pr01NAq5xm4nY/view?usp=drivesdk");
                        DownloadManager.Request request = new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference = downloadManager.enqueue(request);
                    } else if (item.equals("Unit 4")) {
                        downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri = Uri.parse("https://drive.google.com/file/d/1MuhVh4tUqbinUK01nFC6GZO9Njb-wo7R/view?usp=drivesdk");
                        DownloadManager.Request request = new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference = downloadManager.enqueue(request);
                    } else if (item.equals("Unit 5")) {
                        Toast.makeText(Download2Activity.this, "Yet to update", Toast.LENGTH_LONG).show();
                    }
                }
                }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        List<String> categories11=new ArrayList<>();
        categories11.add(0,"Comp Graphics");
        categories11.add("Unit 1");
        categories11.add("Unit 2");
        categories11.add("Unit 3");
        categories11.add("Unit 4");
        categories11.add("Unit 5");
        ArrayAdapter<String> arrayAdapter11;
        arrayAdapter11=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,categories11);
        arrayAdapter11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp11.setAdapter(arrayAdapter11);
        sp11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(parent.getItemAtPosition(position).equals("Comp Graphics")){

                }
                else {
                    String item = parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(), "Selected" + item, Toast.LENGTH_LONG).show();
                    if (item.equals("Unit 1")) {
                        downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri = Uri.parse("hhttps://drive.google.com/file/d/1cRlIO6omBJWs2AHljQ0BeOcRVKByx5DT/view?usp=drivesdk");
                        DownloadManager.Request request = new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference = downloadManager.enqueue(request);
                    } else if (item.equals("Unit 2")) {
                        downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri = Uri.parse("https://drive.google.com/file/d/1SQhf9g4fKX9VCbKZK1LOjVbsdY_92c7m/view?usp=drivesdk");
                        DownloadManager.Request request = new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference = downloadManager.enqueue(request);
                    } else if (item.equals("Unit 3")) {
                        downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri = Uri.parse("https://drive.google.com/file/d/1h69nnopchMwx2A6Bl1DkDXM7oTAt90Lg/view?usp=drivesdk");
                        DownloadManager.Request request = new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference = downloadManager.enqueue(request);
                    } else if (item.equals("Unit 4")) {
                        Toast.makeText(Download2Activity.this, "Yet to update", Toast.LENGTH_LONG).show();
                    } else if (item.equals("Unit 5")) {
                        Toast.makeText(Download2Activity.this, "Yet to update", Toast.LENGTH_LONG).show();
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

}
