package se.lexicon.jennie;

public class Car {

    private String id;
    private int year;
    private String model;
    private String colour;
    private String motorSize;

    public Car(String licensePlate, int productionYear, String brand, String paint, String motor) {
        id = licensePlate;
        year = productionYear;
        model = brand;
        colour = paint;
        motorSize = motor;

    }

    public void drive() {
        System.out.println(model + " with motor " + motorSize + " can drive now.");
    }
}