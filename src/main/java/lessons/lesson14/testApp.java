package lessons.lesson14;


import java.io.*;
import java.util.Scanner;

public class testApp {
    public static void main(String[] args) throws MySuperExeption{
        System.out.println(
                new TestUrlOxr.Builder().withProtocol("http://")
                        .withPort("8080")
                        .withDomain("google.com.ua")
                        .withDomain("test.com.ua")



                        .build());

//        try {
//            System.out.println("result" + exeptionExample());
//            throw new MySuperExeption("test Exeption");
//
//        } catch (StackOverflowError e) {
//
//            System.out.println("recursive call of method exeptionExample()");
//        }
    }


    public static int exeptionExample() throws StackOverflowError{
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("введите число:");
        int digit = sc.nextInt();
        System.out.println("введите число:");
        String digit2 = sc2.nextLine();

        String result = "";
        int  calculation = 0;

        try{
            calculation = digit/Integer.parseInt(digit2);
            System.out.println(digit/Integer.parseInt(digit2));
            return calculation;


        }

        catch (NumberFormatException e){
            System.out.println("Incorrect input, only digit acceptable");
            result = "not";
        }catch (ArithmeticException e){
            System.out.println("Incorrect input, delemiter should not be equal 0");
            result = "not";
        }

        finally {
            System.out.println(String.format("Result %s calculated.", result));
//            throw new IllegalArgumentException();
            return 999;
        }
    }


    public static void courseSelector(Courses courseName){
        switch (courseName){
            case QA_MANUAL:
            case QA_AUTOMATION:
            case BUSINESS_ANALYSIS:
            case BACKEND_DEVELOPMENT:
            case FRONTEND_DEVELOPMENT:
                System.out.println(courseName.toString());
        }
    }



}
