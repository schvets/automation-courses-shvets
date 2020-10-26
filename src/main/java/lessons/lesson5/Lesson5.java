package main.java.lessons.lesson5;


import java.util.Arrays;
import java.util.Random;

public class Lesson5 {
    public static void main(String[] args) {

        Random rand = new Random();
        System.out.println(isEven(rand.nextInt()));

        int[] arrayInt = {1, 2, 34 ,5};
        int[] arrayInt1 = {1, 3, 34 ,5};
        char[] arrayInt3 = {'1', ' ','q', '%'};

        System.out.println(sumArray(arrayInt));
        System.out.println(Arrays.toString(getIntDataOfArray(arrayInt3)));

//        0 1 1 2 3 5 8 13 21

//        5!  1*2*4*3*5
//        factorial(5);
        System.out.println(factorialRec(5));
    }

    private static int factorialRec(int i) {
        int result = 1;
        if(i==0 || i ==1){
            return result;
        }
        result = i * factorialRec(i-1);
        return result;
    }

    private static void factorial(int facrctorialRange) {
        int result = 1;
        for (int j = 1; j <= facrctorialRange; j++) {
            result = result * j;
        }
        System.out.println(result);
    }



    public static boolean isEven(int number){
        return number%2 ==0;
    }

    public  static int sumArray(int[] ints){
        int sum = 0;
        for (int num: ints){
            sum = sum + num;
        }
        return sum;
    }

    public static int[] getIntDataOfArray(char[] chars){
        int[] resultInt = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            resultInt[i] = (int) chars[i];
        }

        return resultInt;
    }


}