package main.java.lessons.lesson13;

public abstract class LessonApp {
    public  static void main(String[] args) {

        ElectroCar car = new ElectroCar("5");
        ElectroCar carEn = new ElectroCar("6");

        ElectroCar.Battery battery= new ElectroCar.Battery();
        car.start();
        battery.charge();

        ElectroCar carHybrid = new ElectroCar("chevrole volt"){
            public void start(){
                System.out.println("check fuel level");
                System.out.println("motor is starting in car " + id);
            }
        };
        carHybrid.start();
    }
}
