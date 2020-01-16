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

public class Download1Activity extends AppCompatActivity {
    private Spinner sp,sp1,sp2,sp3,sp4,sp5,sp6,sp7,sp8,sp9,sp10;
    DownloadManager downloadManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download1);
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
        List<String> categories=new ArrayList<>();
        categories.add(0,"Data Structure");
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
                if(parent.getItemAtPosition(position).equals("Data Structure")){

                }
                else{
                    String item=parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected"+item,Toast.LENGTH_LONG).show();
                    if(item.equals("Unit 1")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/0ByQ6INW9AY_gald5TzlrWFRwMkxTS0pTVGN5T245WVkyZ2I0/view?usp=drivesdkhttps://drive.google.com/a/miet.ac.in/file/d/0ByQ6INW9AY_gald5TzlrWFRwMkxTS0pTVGN5T245WVkyZ2I0/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 2")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/0ByQ6INW9AY_gald5TzlrWFRwMkxTS0pTVGN5T245WVkyZ2I0/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 3")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/0ByQ6INW9AY_gald5TzlrWFRwMkxTS0pTVGN5T245WVkyZ2I0/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 4")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/0ByQ6INW9AY_gald5TzlrWFRwMkxTS0pTVGN5T245WVkyZ2I0/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }

                    else if(item.equals("Unit 5")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/0ByQ6INW9AY_gald5TzlrWFRwMkxTS0pTVGN5T245WVkyZ2I0/view?usp=drivesdk");
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
        categories1.add(0,"DLD");
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
                if(parent.getItemAtPosition(position).equals("DLD")){

                }
                else{
                    String item=parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected"+item,Toast.LENGTH_LONG).show();
                    if(item.equals("Unit 1")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1i3MRCpz7n1_Vt_-2GuPfcwovec7Yo0tg/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 2")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1e77BAtnoG3hu6SbP6_nq1wf_aripVwG4/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 3")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1iYAjvKw_AHcb_r7KTw_9dJXA63SUqirj/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 4")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1ks3npSjG-0Mx2DBcnWPD6wIQWlwliVCX/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 5")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1q7C-Gr1-D-2peZoraud0eZFVasozGMb5/view?usp=drivesdk");
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
        categories2.add(0,"Maths-3");
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
                if(parent.getItemAtPosition(position).equals("Maths-3")){

                }
                else{
                    String item=parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected"+item,Toast.LENGTH_LONG).show();
                    if(item.equals("Unit 1")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1tQaQul-f0Tkm5lNwZR5HnDPL6q2dSQ89/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 2")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1vzML804PU-mkAnHSA8M3EaVQNyDXltuE/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 3")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1ykAquFo7cC4vk3vrVHZ7t9c6Qq5y0oEX/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 4")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1idm6nHkZgSxqHFaKu-n44OOUxXNwwJvT/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 5")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1SAFxy1kdpgKkLRAvnknIW2fxXhRO-_ex/view?usp=drivesdk");
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
        categories3.add(0,"CO");
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
                if(parent.getItemAtPosition(position).equals("CO")){

                }
                else{
                    String item=parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected"+item,Toast.LENGTH_LONG).show();
                    if(item.equals("Unit 1")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/0BwDxyMRkZQcTOUR5ZlA2elVqNlk/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 2")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/0BwDxyMRkZQcTaHNBRlBXR0RTekE/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 3")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/0BwDxyMRkZQcTR0dMZjhSYXM3bGc/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 4")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1EKSwhY1lZFthe3hxQ85EjDX-3WDy2cbM/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 5")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1KVzUgEp13j4bZu0hkvMfoyKPEiS_SAMm/view?usp=drivesdk");
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
        categories4.add(0,"HV");
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
                if(parent.getItemAtPosition(position).equals("HV")){

                }
                else{
                    String item=parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected"+item,Toast.LENGTH_LONG).show();
                    if(item.equals("Unit 1")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1YtEDW9MArBOrlEQU_N_VzNX7TL3288r8/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 2")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/14CpPtp4eN224TFrAR8a0QLcK1evtO6V4/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 3")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1AEE28sZkxbuLh725TKW_vIBHFkxUgkkm/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 4")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1IVrXNFlku26d_Y_IOr2cWAw67kFbl2xa/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 5")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1cqMalQ8qpQ91EKwsPXuQiFVAY_Mzoxgn/view?usp=drivesdk");
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
        categories5.add(0,"OS");
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
                if(parent.getItemAtPosition(position).equals("OS")){

                }
                else{
                    String item=parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected"+item,Toast.LENGTH_LONG).show();
                    if(item.equals("Unit 1")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1GMr_37UaJ1_RvluW69rAwoON9IwPb_W0/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 2")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1L51wfYvNwafLtr7ebwbfQy7esvJq1IlF/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 3")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1DxaZ0Cp1Uv0d7y_gIg0jMQ0GBXUmGHBy/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 4")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/14GcZTxSx1NbDL4ufQb5Y3gAy6W3MNsAD/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 5")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1VVhJe57mlMffQZ1AL-1SWqKrYbK62oGK/view?usp=drivesdk");
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
        categories6.add(0,"Discrete Maths");
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
                if(parent.getItemAtPosition(position).equals("Discrete Maths")){

                }
                else{
                    String item=parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected"+item,Toast.LENGTH_LONG).show();
                    if(item.equals("Unit 1")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/open?id=1ASPSrOUpx3X2jLZNEvu_hPOHwrCIHhjz");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 2")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/open?id=1ASPSrOUpx3X2jLZNEvu_hPOHwrCIHhjz");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 3")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/open?id=1ASPSrOUpx3X2jLZNEvu_hPOHwrCIHhjz");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 4")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/open?id=1ASPSrOUpx3X2jLZNEvu_hPOHwrCIHhjz");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 5")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/open?id=1ASPSrOUpx3X2jLZNEvu_hPOHwrCIHhjz");
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
        categories7.add(0,"Software Engg");
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
                if(parent.getItemAtPosition(position).equals("Software Engg")){

                }
                else{
                    String item=parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected"+item,Toast.LENGTH_LONG).show();
                    if(item.equals("Unit 1")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/14OWdcpbbOSsnVbFbxUO7GUorAHAj4eby/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 2")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1QghcDo9TpNT5wsQEw2YjET17TALXdtnU/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 3")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1_41cM65RNZH1QY_OooHMTwxSkahxgxj2/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 4")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1BLFybkKfrKoykfM8sIR0IgU4kumttUlS/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 5")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1bl0gmS0g56ZuwH7zKN005ds6KkgrN9gW/view?usp=drivesdk");
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
        List<String> categories8=new ArrayList<>();
        categories8.add(0,"Micro");
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
                if(parent.getItemAtPosition(position).equals("Micro")){

                }
                else{
                    String item=parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected"+item,Toast.LENGTH_LONG).show();
                    if(item.equals("Unit 1")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1LJrI2d_vWOpFBA1wLxDQZSe0raoosVq3/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 2")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1g7yZKDZJlqpPbH32Zie10E6hNXcGkZD-/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 3")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1N7zJf3moZ2MQBl1YFQEaf4BvoFE9Zojc/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 4")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1jZtxmJMjBKBjOVKjZeFfHRkTXgW-xDGA/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 5")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1ifGzf4IaaaS_1cWxTxJOd6PvjD0fwYT0/view?usp=drivesdk");
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
        List<String> categories9=new ArrayList<>();
        categories9.add(0,"Automata");
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
                if(parent.getItemAtPosition(position).equals("Automata")){

                }
                else{
                    String item=parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected"+item,Toast.LENGTH_LONG).show();
                    if(item.equals("Unit 1")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1Iy4G1xtYlcaIIYasZUP6CVNqwW0z2ysh/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 2")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1EXpDVji0i7c10eYsvaxdKWzC6HSRQ7Gk/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 3")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1SJhSQtDkPAOwa8-vG-io43FsZmHW5guI/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 4")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1xhVbFQCZFeMrRYPmvBhp3CTkxTprDaph/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 5")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1sAf5WH7oF6y2RiGl02DjZfx0DqRoFEAg/view?usp=drivesdk");
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
        List<String> categories10=new ArrayList<>();
        categories10.add(0,"EVS");
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
                if(parent.getItemAtPosition(position).equals("EVS")){

                }
                else{
                    String item=parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected"+item,Toast.LENGTH_LONG).show();
                    if(item.equals("Unit 1")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1TyxSzJY_yXVl-cd86tG8kCxY5wqI0pyC/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 2")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1cABFxyqy-cA88TQCVE290W-TvwyApf_6/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 3")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/17nbI1qKy7-Fde4ZyF5U3SqCbncCmH5rZ/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 4")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1PSiRfhil3fsem56B6XQE2_0HTv3DR2AC/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 5")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1ikBbi56rJbs7iuBTbhiKm2L8Y2Z00nu0/view?usp=drivesdk");
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
    }
}
