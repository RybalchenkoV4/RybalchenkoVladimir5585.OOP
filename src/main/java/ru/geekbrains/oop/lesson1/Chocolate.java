package ru.geekbrains.oop.lesson1;

public class Chocolate extends Product{

    private int calorieContent; //калорийность

    public Chocolate(String brand, String name, double price, int calorieContent) {

        super(brand, name, price);
        this.calorieContent = calorieContent;

    }
    public int getCalorieContent() {
        return calorieContent;
    }

    public void setCalorieContent(int calorieContent) {
        this.calorieContent = calorieContent;
    }
    
    @Override
    public String displayInfo() {
        return String.format("Шоколадка:\n\t%s\n\t%s\n\t%.2f\n\tКалорийность: %.d",
                brand, name, price, calorieContent);
    }
}
