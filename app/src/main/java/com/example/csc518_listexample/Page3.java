package com.example.csc518_listexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Page3 extends AppCompatActivity
{
    EditText nameET, bankAffET, currentBalET;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        this.nameET = (EditText)findViewById(R.id.nameET);
        this.bankAffET = (EditText)findViewById(R.id.bankAffET);
        this.currentBalET = (EditText)findViewById(R.id.currentBalET);
    }

    public void onSubmitButtonPressed(View v)
    {
        String name = this.nameET.getText().toString();
        String bankAff = this.bankAffET.getText().toString();
        int currBal = Integer.parseInt(this.currentBalET.getText().toString());
        Bank bank = new Bank(name, bankAff, currBal);
        bank.display();

        Intent i = new Intent(this, MainActivity.class);
        this.startActivity(i);
    }
}
