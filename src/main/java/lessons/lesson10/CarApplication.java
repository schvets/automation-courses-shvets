package main.java.lessons.lesson10;

public class CarApplication {

    public static void main(String[] args) {
        Car car1 = new Car("sedan", 2.0, "gas", "red");
        Car car2 = new RacingCar("race", 5.0, "dizel", "black", true,"formula 1");
        Car car3 = new SpecialCar("golf car", 0.5, "electro", "white", true);

        Car[] carAr = {car1, car2, car3} ;
        printCarArray(carAr);
    }

    public static void printCarArray(Car[] arr){
        System.out.println(arr[0]);
        System.out.println(arr[1]);


    }
}
