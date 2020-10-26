package main.java.lessons.lesson8;

public class Animal {
    public int legs;
    public String color;
    public int weight;
    public boolean canFly;
    public boolean canSwim;
    public boolean isPredator;

    public Animal(){

    }

    public Animal(int legs, boolean canFly, boolean canSwim, String color, boolean isPredator, int weight) {
        this.legs = legs;
        this.canFly = canFly;
        this.canSwim = canSwim;
        this.color = color;
        this.isPredator = isPredator;
        this.weight = weight;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public boolean isPredator() {
        return isPredator;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "legs=" + legs +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", canFly=" + canFly +
                ", canSwim=" + canSwim +
                ", isPredator=" + isPredator +
                '}';
    }
}
