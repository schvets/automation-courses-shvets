package main.java.lessons.lesson10;

public class Car {
    private String type;
    private double engine;
    private String fuel;
    private String color;


    public Car(String type, double engine, String fuel, String color) {
        this.type = type;
        this.engine = engine;
        this.fuel = fuel;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public double getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", engine=" + engine +
                ", fuel='" + fuel + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
