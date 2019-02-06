package com.example.csc518_listexample;

public class Bank
{
    private String name;
    private String bankAff;
    private int currBal;

    public Bank(String name, String bankAff, int currBal)
    {
        this.name = name;
        this.bankAff = bankAff;
        this.currBal = currBal;
    }

    public void display()
    {
        System.out.println(this.name + " " + this.bankAff + " " + this.currBal);
    }
}
