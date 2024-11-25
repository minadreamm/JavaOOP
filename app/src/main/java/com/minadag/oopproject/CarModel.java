package com.minadag.oopproject;

public class CarModel {
   private   String name;
   private int year;

   private String color;

    public CarModel(String name, int year, String color){
        this.name = name;
        this.year = year;
        this.color = color;

    }

    // getter ekleyerek okunabilir yaptık

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    // setter ekleyerek degistirilebilir yaptik

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
