package main.java.lessons.lesson13;

public class ElectroCar {
    public String id;
    private static String connectionPort = "999";

    public ElectroCar(String id) {
        this.id = id;
    }

    public void start(){
        Engine engine = new Engine();
        engine.startMotor();
        System.out.println("car started");

    }

    // вложенный не статический класс относится к объекту
    public class Engine {
        public void startMotor(){
            System.out.println("motor is starting in car " + id);

            int x = 5;

            class Sprinkler {
                public void sprinklFuel(){
                    System.out.println("check x value " + x);
                    System.out.println("check id " +id);
                    System.out.println("check connectionPort " + connectionPort);
                }
            }
            Sprinkler sprinkler = new Sprinkler();
            sprinkler.sprinklFuel();
//            test(sprinkler);
        }

    }

    // вложенный статический класс относится к классу
    public static class Battery {
        public void charge(){
            System.out.println("Battery starting charge by port " + connectionPort);
        }
    }

//    private void test(Sprinkler sp){
//        (Sprinkler)sp
//
//    }
}
