package com.example.quoteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Quotes extends AppCompatActivity {
 private TextView quoteText,writerName;
 private final List<QuotesList> quotesLists = new ArrayList<>();


  private int currentQuotePosition = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);
        final  TextView categoryName = findViewById(R.id.categoryName);
        quoteText = findViewById(R.id.quoteTxt);
        writerName = findViewById(R.id.writerName);

        final Button prevBtn = findViewById(R.id.prevBtn);
        final Button nextBtn =  findViewById(R.id.nextBtn);
        final ImageView copyBtn = findViewById(R.id.copyBtn);


        //get category name from categoriesAdapter class
        final String getName = getIntent().getStringExtra("name");

        //set category Name to Textview
        categoryName.setText(getName);

      //check category name and get quotes
        if (getName.equals("love")){
           quotesLists.addAll(QuotesData.getloveQuotes());
        } else if (getName.equals("motherlove")) {
            quotesLists.addAll(QuotesData.getmotherloveQuotes());
        } else if (getName.equals("gym")) {
            quotesLists.addAll(QuotesData.getgymQuotes());
        } else if (getName.equals("motivation")) {
            quotesLists.addAll(QuotesData.getLifeQuotes());
        }
         // check your own quotes....


        //get first quote quotelist  and set textview
        setQuoteToTextView();

        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 currentQuotePosition--;
                if (currentQuotePosition < 0){
                   currentQuotePosition = quotesLists.size()-1;
                }
                 setQuoteToTextView();
            }
        });
        copyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager ClipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("quote",quotesLists.get(currentQuotePosition).getQuote()+"\nby"+quotesLists.get(currentQuotePosition).getWriter());
               ClipboardManager.setPrimaryClip(clipData);
                Toast.makeText(Quotes.this,"copied",Toast.LENGTH_SHORT).show();
            }
        });
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             currentQuotePosition++;
             // check if more current list available
                if (currentQuotePosition >= quotesLists.size()) {
                    currentQuotePosition = 0;
                }
                setQuoteToTextView();
            }
        });
    }
    private void setQuoteToTextView(){
        // get quote from list from cureent list
    quoteText.setText(quotesLists.get(currentQuotePosition).getQuote());

        // get quote from list from cureent list
        writerName.setText(quotesLists.get(currentQuotePosition).getWriter());
    }
    }
