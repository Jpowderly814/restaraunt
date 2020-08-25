package com.company;
import java.util.ArrayList;
import java.util.Date;

public class Menu {

    ArrayList<menuItem> dishes = new ArrayList<>();
    private Date lastUpdated = new Date();

    public Menu(ArrayList<menuItem> dishes, Date lastUpdated) {
        this.dishes = dishes;
        this.lastUpdated = lastUpdated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    private static void main (String [] args) {

    }

    private ArrayList<menuItem> addItem(menuItem toAdd){
        if (!dishes.contains(toAdd)){
            dishes.add(toAdd);
        }
        return dishes;
    }

    private ArrayList<menuItem> removeItem(menuItem toRemove){
        if (dishes.contains(toRemove)){
            dishes.remove(toRemove);
        }
        return dishes;
    }



}
