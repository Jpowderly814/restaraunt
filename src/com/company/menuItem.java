package com.company;

public class menuItem {
    private String category;
    private String name;
    private String description;
    private int price;

    //description
    public String getDescription(){
        return description;
    }

    protected void setDescription(String description){
        this.description = description;
    }

    //price
    public int getPrice(){
        return price;
    }

    protected void setPrice(int price){
        this.price = price;
    }

    //name
    public String getName(){
        return name;
    }

    protected void setName(String name){
        this.name = name;
    }

    //category

    public String getCategory(){
        return category;
    }

    protected void setCategory(String category) {
        this.category = category;
    }



}
