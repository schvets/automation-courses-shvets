package main.java.lessons.lesson11;

public class LessonApp {
    public static void main(String[] args) {
        Device mouse = new Accessories("mouse", "apple magic mouse", true);
        Laptop laptop = new Laptop("laptop", "lenovo thinkPad", "15 inch.", "x64", "i7 core, 16 GB, SSD 128 GB");

//        System.out.println(mouse.getDescription());
//        System.out.println(mouse.getType());
////        System.out.println(mouse.getWirless());
//        System.out.println(mouse.toString());

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println(laptop.getDescription());
//        System.out.println(laptop.getSuperDescription());
        System.out.println(laptop.getType());
//        System.out.println(laptop.getSpec());
        System.out.println(laptop.toString());

        Device[] deviceArray = {mouse, laptop};

        for (Device d: deviceArray) {
            System.out.println(d);
        }

    }
}
