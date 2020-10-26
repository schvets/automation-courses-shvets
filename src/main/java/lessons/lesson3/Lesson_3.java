package main.java.lessons.lesson3;


import java.util.Scanner;

public class Lesson_3 {
    public static void main(String[] args) {

//        Random random = new Random();
////        int a = random.nextInt(10);
////        System.out.println(a);
////        if (a > 9) {
////            System.out.println("var a > 5");
////            System.out.println("test msg");
////        } else if( a > 2 || a < 7  ){
////            System.out.println("var a > 2 and a <7");
////        } else{
////            System.out.println("var a = " + a );
////        }
//
//        String days = "mo,tu,we,th,fr,st,su";
//        List<String> daysList = Arrays.stream(days.split(",")).collect(Collectors.toList());
////        daysList.get(random.nextInt(6));
//        String randDay = daysList.get(random.nextInt(6));
//        System.out.println(randDay);
//
//        if (randDay.equals("mo") || randDay.equals("th") || randDay.equals("tu")
//                || randDay.equals("we")) {
//            System.out.println("Work hard");
//            if (randDay.equals("mo")) {
//                System.out.println("gym");
//            } else if (randDay.equals("tu") || randDay.equals("th")) {
//                System.out.println("english");
//                if (randDay.equals("th")) {
//                    System.out.println("middle of week");
//                }
//            }
//        } else if (randDay.equals("fr")) {
//            System.out.println("party hard");
//        } else if (randDay.equals("su") || randDay.equals("st")) {
//            System.out.println("relax");
//        }
//
//        System.out.println("************************************");
//
//
//        switch (randDay) {
//            case "mo":
//                System.out.println("Work hard");
//                System.out.println("gym");
//                break;
//            case "tu":
//                System.out.println("Work hard");
//                System.out.println("english");
//                break;
//            case "we":
//                System.out.println("Work hard");
//                break;
//            case "th":
//                System.out.println("Work hard");
//                System.out.println("english");
//                System.out.println("middle of week");
//                break;
//            case "fr":
//                System.out.println("party hard");
//                break;
//            case "st":
//            case "su":
//                System.out.println("relax");
//                break;
//            default:
//                System.out.println(randDay + " can not find such day");
//                break;
//
//        }
//
//
//        String test = randDay.equals("mo") ? "понед" :
//                randDay.equals("tu") ? "вторник" :
//                        randDay.equals("we") ? "среда" :
//                                randDay.equals("th") ? "четверг" :
//                                        randDay.equals("fr") ? "пятница" :
//                                                randDay.equals("st") ? "суббота" : "воскресенье";
//        System.out.println(test);


        Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter first number");
        int x = scanner.nextInt ();
        System.out.println ("Enter second number");
        int y = scanner.nextInt ();
        System.out.println ("Enter operation (available operation: +, -, *, / )");
        String operation = scanner.next ();
        System.out.println (operation + x + y  );

    }
}
