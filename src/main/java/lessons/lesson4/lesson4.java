package main.java.lessons.lesson4;

import java.util.Random;

public class lesson4 {
    public static void main(String[] args) {
        Random random = new Random();
        int intPositve = random.nextInt(100);
        System.out.println(intPositve);
        describeAge(intPositve);
    }

    private static void describeAge(int intPositve) {
        System.out.println(
                intPositve <= 12 ? "You're kid" :
                        intPositve <= 17 ? "You're teenager" :
                                intPositve <= 64 ? "You're adult" :
                                        "You're eldery");

    }
}
