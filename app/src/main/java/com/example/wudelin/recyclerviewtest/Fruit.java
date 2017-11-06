package com.example.wudelin.recyclerviewtest;

/**
 * Created by wudelin on 2017/11/2.
 */

public class Fruit {
    private int imageViewID;
    private String fruitName;

    public Fruit(int imageViewID,String fruitName) {
        this.imageViewID = imageViewID;
        this.fruitName = fruitName;
    }

    public int getImageViewID() {
        return imageViewID;
    }

    public String getFruitName() {
        return fruitName;
    }
}
