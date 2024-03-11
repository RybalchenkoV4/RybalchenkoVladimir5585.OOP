package ru.geekbrains.oop.lesson1;

public class HotDrink extends Product{
    
    private double volume; // объем

    public HotDrink(String name, double price, double volume){
        super(name, price);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String displayInfo() {
        return String.format("Бутылка с горячем напитком:\n\t%s\n\t%s\n\t%.2f\n\tОбъем: %.2f",
                brand, name, price, volume);
    }
}
