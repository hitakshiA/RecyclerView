package com.example.recyclerview;

import android.os.Bundle;
//import com.example.recyclerview.RecyclerContactAdapter;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.recyclerview.adapter.RecyclerContactAdapter;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Contact_model> arrcontacts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        //Can choose staggered or grid layout  manager as well.

        // Contact_model model = new Contact_model(R.drawable.img2 , "Jack" , "9845672345"); or the below way
        arrcontacts.add(new Contact_model(R.drawable.img2 , "Jack" , "9845672345"));
        arrcontacts.add(new Contact_model(R.drawable.img_1 , "Jim" , "9845987345"));
        arrcontacts.add(new Contact_model(R.drawable.img3 , "Ray" , "678372345"));
        arrcontacts.add(new Contact_model(R.drawable.img4 , "henry" , "67905672345"));
        arrcontacts.add(new Contact_model(R.drawable.img5 , "Alex" , "8954372345"));
        arrcontacts.add(new Contact_model(R.drawable.img6 , "bob" , "9845455345"));
        arrcontacts.add(new Contact_model(R.drawable.img7 , "Calvin" , "9745672345"));
        arrcontacts.add(new Contact_model(R.drawable.img8 , "Dravin" , "7645672345"));
        arrcontacts.add(new Contact_model(R.drawable.img2 , "Frick" , "8645672345"));
        arrcontacts.add(new Contact_model(R.drawable.img3 , "George" , "8845672345"));
        arrcontacts.add(new Contact_model(R.drawable.img4 , "Harry" , "7845672345"));
        arrcontacts.add(new Contact_model(R.drawable.img5 , "Isabel" , "6795672345"));

        // Error  RecyclerContactAdapter adapter = new RecyclerContactAdapter(this , arrcontacts);
        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this, arrcontacts);
        recyclerview.setAdapter(adapter);


        // Error recyclerview.setAdapter(adapter);



    }
}