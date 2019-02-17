package com.example.csc518_listexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity
{


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Core.cardListView = (ListView)this.findViewById(R.id.cardListView);
        Core.bankListView = (ListView)this.findViewById(R.id.bankListView);


        //Connecting our lists to the list adapter
        Core.listAdapter = new ArrayAdapter<String>(this,
                R.layout.listview_row, Core.stringListOfCards);
        Core.cardListView.setAdapter(Core.listAdapter);

        Core.listAdapter = new ArrayAdapter<String>(this,
                R.layout.listview_row, Core.stringListOfBanks);
        Core.bankListView.setAdapter(Core.listAdapter);
    }

    public void onAddCardButtonPressed(View v)
    {
        Intent i = new Intent(this, Page2.class);
        this.startActivity(i);
    }

    public void onAddLoyaltyButtonPressed(View v)
    {
        Intent i = new Intent(this, Page3.class);
        this.startActivity(i);
    }


}
