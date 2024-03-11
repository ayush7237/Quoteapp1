package com.example.quoteapp.categories;



public class categoriesList {
    private final String categoryName;
    private final int categoryImg;

    public categoriesList(String categoryName, int categoryImg) {
        this.categoryName = categoryName;
        this.categoryImg = categoryImg;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public int getCategoryImg() {
        return categoryImg;
    }
}
