package com.example.csc518_listexample;

import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Core
{
//    public static Card[] cards;
//    public static Bank[] banks;
//    public static String[] theCardsStrings;
    public static ListView cardListView, bankListView;
    public static ArrayAdapter<String> listAdapter;


    public static LinkedList<String> stringListOfCards = new LinkedList<String>();
    public static LinkedList<String> stringListOfBanks = new LinkedList<String>();

    // Currently not really using these - Will have to change my Array adapter to accept objects rather than Strings
    //    Most likely for next assignment
    public static LinkedList<Card> listOfCards = new LinkedList<Card>();
    public static LinkedList<Bank> listOfBanks = new LinkedList<Bank>();

    public static Object[] bankArray = listOfBanks.toArray();
    public static Object[] cardArray = listOfCards.toArray();

//    public static void displayCard(LinkedList<Card> lst)
//    {
//        for(int i = 0; i < lst.size(); i++)
//        {
//
//        }
//    }

}
