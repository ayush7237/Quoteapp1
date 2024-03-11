package com.example.quoteapp;

import java.util.ArrayList;
import java.util.List;

public class QuotesData {
    public static List<QuotesList> getLifeQuotes(){
      final List<QuotesList> lifeQuotesList = new ArrayList<>();

      QuotesList lifeQuotes1 = new QuotesList("Find out who you are and do it on purpose.","Dolly Parton");
      lifeQuotesList.add(lifeQuotes1);

        QuotesList lifeQuotes2 = new QuotesList("Confident people have a way of carrying themselves that makes others attracted to them","Sofia Vergara");
        lifeQuotesList.add(lifeQuotes2);

        QuotesList lifeQuotes3 = new QuotesList("If you can do what you do best and be happy, you are further along in life than most people.","Leonardo DiCaprio");
        lifeQuotesList.add(lifeQuotes3);

        return lifeQuotesList;
    }
    public static List<QuotesList> getloveQuotes(){
        final List<QuotesList> loveQuotesList = new ArrayList<>();

        QuotesList loveQuotes1 = new QuotesList("I saw that you were perfect, and so I loved you. Then I saw that you were not perfect and I loved you even more.","Angelita Lim");
        loveQuotesList.add(loveQuotes1);

        QuotesList loveQuotes2 = new QuotesList("I need you like a heart needs a beat.","Unknown");
        loveQuotesList.add(loveQuotes2);

        QuotesList loveQuotes3 = new QuotesList("If I had a flower for every time I thought of you... I could walk through my garden forever.","Alfred Tennyson");
        loveQuotesList.add(loveQuotes3);

        QuotesList loveQuotes4 = new QuotesList("You’re the closest to heaven, that I’ll ever be.","Goo Goo Dolls");
        loveQuotesList.add(loveQuotes4);


        return loveQuotesList;
    }

    public static List<QuotesList> getmotherloveQuotes(){
        final List<QuotesList> motherloveQuotesList = new ArrayList<>();

        QuotesList motherloveQuotes1 = new QuotesList("Sooner or later we all quote our mothers.","— Bern Williams");
        motherloveQuotesList.add(motherloveQuotes1);

        QuotesList motherloveQuotes2 = new QuotesList("Mothers are like buttons. They hold everything together.","Unknown");
        motherloveQuotesList.add(motherloveQuotes2);

        QuotesList motherloveQuotes3 = new QuotesList("Life began with waking up and loving my mother’s face.","— George Eliot");
        motherloveQuotesList.add(motherloveQuotes3);

        QuotesList motherloveQuotes4 = new QuotesList("A mother’s love endures through all.","— Washington Irving");
        motherloveQuotesList.add(motherloveQuotes4);


        return motherloveQuotesList;
    }
    public static List<QuotesList> getgymQuotes(){
        final List<QuotesList> gymQuotesList = new ArrayList<>();

        QuotesList gymQuotes1 = new QuotesList("You miss one hundred percent of the shots you don’t take.","– Wayne Gretzky");
        gymQuotesList.add(gymQuotes1);

        QuotesList gymQuotes2 = new QuotesList("All progress takes place outside the comfort zone.","– Michael John Bobak");
        gymQuotesList.add(gymQuotes2);




        return gymQuotesList;
    }
}
