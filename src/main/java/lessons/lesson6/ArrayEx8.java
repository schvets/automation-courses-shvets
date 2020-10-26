package main.java.lessons.lesson6;

import java.util.Arrays;

public class ArrayEx8 {

    public static void main(String[] args) {
        int [] arrayInt = {1,2,3,4,5,6,7,8,9,10};
//        int [] arrayInt = {1,2,3,8,9,10, 0,0,0,0};

        int [] resArray = new int[arrayInt.length];
        int start = 5;
        int stop = 7;
        int lastIndex = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            if (i<start-1 || i > stop-1){
                resArray[lastIndex]=arrayInt[i];
                lastIndex++;
            }
        }

        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(resArray));

        int [] resArrayCopy = new int[arrayInt.length];

        System.arraycopy(arrayInt,0,resArrayCopy,0, start-1);
        System.arraycopy(arrayInt,stop, resArrayCopy,start-1, arrayInt.length-(stop));
        System.out.println(Arrays.toString(resArrayCopy));



    }
}
