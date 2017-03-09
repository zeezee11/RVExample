package com.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.recyclerviewexample.adapters.RecipieRecyclerViewAdapter;
import com.recyclerviewexample.models.RecipieModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    RecyclerView rvRecipies;
    GridLayoutManager gridLayoutManager;
    LinearLayoutManager linearLayoutManager;
    RecipieRecyclerViewAdapter recipieRecyclerViewAdapter;
    //ArrayList<RecipieModel> recipieModels = new ArrayList<>();

    private ArrayList<RecipieModel> generateRecipies()
    {
        ArrayList<RecipieModel> recipieModels = new ArrayList<>();

        for(int index = 0; index< 7; index++)
    {
        RecipieModel recipieModel = new RecipieModel();
        recipieModel.setTitle("Recipie Title");
        recipieModel.setDescription("qwertasdfgxcvb");
        recipieModel.setDate("12-12-2017");
        recipieModel.setImage("https://www.w3schools.com/css/trolltunga.jpg");
        recipieModels.add(recipieModel);
    }
        return recipieModels;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvRecipies = (RecyclerView) findViewById(R.id.rvRecipies);
        gridLayoutManager = new GridLayoutManager(MainActivity.this, 3);
        linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        rvRecipies.setLayoutManager(linearLayoutManager);
        //call the below line on success of retrofit
        recipieRecyclerViewAdapter = new RecipieRecyclerViewAdapter(generateRecipies(), MainActivity.this); //send parameter (RecipieModel) o;
        rvRecipies.setAdapter(recipieRecyclerViewAdapter);
    }
}
