package com.example.csc518_listexample;

public class Card
{
    private String name;
    private int startDate;
    private int minSpend;
    private int points;

    public Card(String name, int startDate, int minSpend, int points)
    {
        this.name = name;
        this.startDate = startDate;
        this.minSpend = minSpend;
        this.points = points;
    }

    public void display()
    {
        System.out.println(this.name + " " + this.startDate + " " + this.minSpend + " " + this.points);
    }
}
