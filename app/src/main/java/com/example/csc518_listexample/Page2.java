package com.example.csc518_listexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Page2 extends AppCompatActivity
{
    // This is the add card page

    private EditText nameET, startDateET, minSpendET, rewardPointsET;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        //name, start date, minimum spend, and reward points

        this.nameET = (EditText)findViewById(R.id.nameET);
        this.startDateET = (EditText)findViewById(R.id.startDateET);
        this.minSpendET = (EditText)findViewById(R.id.minSpendET);
        this.rewardPointsET = (EditText)findViewById(R.id.rewardPointsET);

    }

    public void onSubmitButtonPressed(View v)
    {
        String name = this.nameET.getText().toString();
        int date = Integer.parseInt(this.startDateET.getText().toString());
        int minSpend = Integer.parseInt(this.minSpendET.getText().toString());
        int rewardPoints = Integer.parseInt(this.rewardPointsET.getText().toString());
        Card card = new Card(name, date, minSpend, rewardPoints);
        card.display();

        Intent i = new Intent(this, MainActivity.class);
        this.startActivity(i);
    }
}
