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

public class DownloadActivity extends AppCompatActivity {
private Spinner sp,sp1,sp2,sp3,sp4,sp5,sp6,sp7;
DownloadManager downloadManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);
        sp=findViewById(R.id.sp);
        sp1=findViewById(R.id.sp1);
        sp2=findViewById(R.id.sp2);
        sp3=findViewById(R.id.sp3);
        sp4=findViewById(R.id.sp4);
        sp5=findViewById(R.id.sp5);
        sp6=findViewById(R.id.sp6);
        sp7=findViewById(R.id.sp7);
        List<String> categories=new ArrayList<>();
        categories.add(0,"Physics");
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
                        if(parent.getItemAtPosition(position).equals("Physics")){

                        }
                        else{
                            String item=parent.getItemAtPosition(position).toString();
                            Toast.makeText(parent.getContext(),"Selected"+item,Toast.LENGTH_LONG).show();
                            if(item.equals("Unit 1")){
                                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1mQrAki8ED22sOExUsJ1GSLwU84fCKvV9/view?usp=drivesdk");
                                DownloadManager.Request request=new DownloadManager.Request(uri);
                                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference=downloadManager.enqueue(request);
                            }
                            else if(item.equals("Unit 2")){
                                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1V9PQ6oMgKBZzSlyJ0QLWl9B69AyTIe_d/view?usp=drivesdk");
                                DownloadManager.Request request=new DownloadManager.Request(uri);
                                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference=downloadManager.enqueue(request);
                            }
                            else if(item.equals("Unit 3")){
                                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1Hk9cIA68jcCEUl_7MluAzNDX4dvOCAZj/view?usp=drivesdk");
                                DownloadManager.Request request=new DownloadManager.Request(uri);
                                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference=downloadManager.enqueue(request);
                            }
                            else if(item.equals("Unit 4")){
                                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri=Uri.parse("https://drive.google.com/file/d/0B7Au_hBJo1ieR1hHblpqZkhITmFvSHAxbVlfTzJVaEdUdWc4/view?usp=drivesdk");
                                DownloadManager.Request request=new DownloadManager.Request(uri);
                                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                                Long reference=downloadManager.enqueue(request);
                            }

                            else if(item.equals("Unit 5")){
                                downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                                Uri uri=Uri.parse("https://drive.google.com/file/d/0B7Au_hBJo1ieUWVORmdXVkdhWmRYVjVxN2JnSDBqUmhuMlVz/view?usp=drivesdk");
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
        categories1.add(0,"Workshop");
        categories1.add("Carpentry shop");
        categories1.add("Fiting shop");
        categories1.add("Foundary shop");
        categories1.add("Lathe machine shop");
        categories1.add("Steel maetal shop");
        categories1.add("Welding shop");
        ArrayAdapter<String> arrayAdapter1;
        arrayAdapter1=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,categories1);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(arrayAdapter1);
        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(parent.getItemAtPosition(position).equals("Workshop")){

                }
                else{
                    String item=parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected"+item,Toast.LENGTH_LONG).show();
                    if(item.equals("Capentry shop")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/12y_k0Sj3R2p-OCfiC-tx3LUKmMU03ZME/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Fitting shop")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/16_O5V-Fk8mpcQDKj1CRl5TK7TaMNVTsv/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Foundary shop")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1AL8VkVGXuvVmiVug88c3yIzSML3cHe9R/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Lathe machine shop")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1A2CUo7UR0BRMuur94U8OpKN4ELHeccOj/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Steel metal shop")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1zrsO7vZ9ssmZVwlIN6KF3IKsuUQlV6N8/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Welding shop")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1MvHC5mukxur8ynhy7SVZvRz-qo09k8ye/view?usp=drivesdk");
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
        categories2.add(0,"Electrical");
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
                if(parent.getItemAtPosition(position).equals("Electrical")){

                }
                else{
                    String item=parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected"+item,Toast.LENGTH_LONG).show();
                    if(item.equals("Unit 1")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/file/d/1kYWlK3Qcz0UDeTKmBpaFAcMLKF1GKMgT/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 2")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/file/d/15ihVj-uc2rXwlvyzrXpNElKDKrqimRoX/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 3")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/file/d/1Ont1s7GOVy65UCPRVp7cQTRrvRO8rTQi/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 4")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/file/d/1mKkmSycIgK7HPrjyuJOet4DgdB51mmNm/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 5")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/file/d/1aD98RVqCBCvEiZdkGMi0j8IfoslOZ6_m/view?usp=drivesdk");
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
        categories3.add(0,"Maths-1");
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
                if(parent.getItemAtPosition(position).equals("Maths-1")){

                }
                else{
                    String item=parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected"+item,Toast.LENGTH_LONG).show();
                    if(item.equals("Unit 1")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/open?id=1EmkZ5yA-ewYdMBOgqA1cB54iEoxz5eDr\n");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 2")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/open?id=1EmkZ5yA-ewYdMBOgqA1cB54iEoxz5eDr\n");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 3")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/open?id=1EmkZ5yA-ewYdMBOgqA1cB54iEoxz5eDr\n");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 4")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/file/d/1pAgVtf5wgVNewmqdaEAZsGYHhwfusVvw/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 5")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/file/d/1pAgVtf5wgVNewmqdaEAZsGYHhwfusVvw/view?usp=drivesdk");
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
        categories4.add(0,"PC");
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
                if(parent.getItemAtPosition(position).equals("PC")){

                }
                else{
                    String item=parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected"+item,Toast.LENGTH_LONG).show();
                    if(item.equals("Unit 1")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/file/d/1o3PEhDGIBIrhqcgn0i_KxKtZZGklNwKG/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 2")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/file/d/1MEjVLESz3aWnEWfeqNotLW5nHzV9f6K3/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 3")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/file/d/1wTpGN9AlQGB12NSJ7wvPjhmuu4Rz2r7m/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 4")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/file/d/1aocdJO-9j5bKkvqD5W16kvfLO68xMdxM/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 5")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/file/d/1PyvujkqMI-ZbsfxcNWM1PERSo2x5fmz-/view?usp=drivesdk");
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
        categories5.add(0,"Programming in C");
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
                if(parent.getItemAtPosition(position).equals("Programming in C")){

                }
                else{
                    String item=parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected"+item,Toast.LENGTH_LONG).show();
                    if(item.equals("Unit 1")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1WfaMNThQYvfGm7q0AIbM_uY9uZ8uWJHy/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 2")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1IJI3T-jBx07OpxLVdyVrFSA_dFRaa-5n/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 3")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1bOWKeTQU9hG5EdALu9R4e7fP90x2nmif/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 4")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1rxYPzNB5fK4bnjD3VkktD3_2Q9CZq1S4/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 5")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1jzq7a1UXLhOveXdse9S2HkpWq66vvidY/view?usp=drivesdk");
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
        categories6.add(0,"Chemistry");
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
                if(parent.getItemAtPosition(position).equals("Chemistry")){

                }
                else{
                    String item=parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected"+item,Toast.LENGTH_LONG).show();
                    if(item.equals("Unit 1")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1ChB0fs1WX8gwU4I0eh5M0B9ogYH9iDUz/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 2")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1hauI_GmhWqb-lCYQaT5mpGJy8C52IFyO/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 3")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1sVt2AgPYDqqncHqPXXFWllxBLw0PS8fA/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 4")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/1rKnc5xZsgTtWkyzKoYZTVfIej3JqsjBi/view?usp=drivesdk");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }
                    else if(item.equals("Unit 5")){
                        downloadManager=(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://drive.google.com/a/miet.ac.in/file/d/14vZenGO9NSYj-kmK_JA0Vb1itt1J6atC/view?usp=drivesdk");
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
        categories7.add(0,"Maths-2");
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
                if(parent.getItemAtPosition(position).equals("Maths-2")){

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
    }
}
