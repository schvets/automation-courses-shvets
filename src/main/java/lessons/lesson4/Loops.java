package main.java.lessons.lesson4;

import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {

//        String[] count = {"1", "2", "3" , "4" , "5" , "6" ,"7"};
//        for (int i = 0; i < count.length; i++) {
//            System.out.println("count start : " + count[i]);
//            if(i!=0) System.out.println(" // " + count[i-1]);
//        }

//        int i = 0;
//        String[] count = {"1", "2", "3" , "4" , "5" , "6" ,"7"};
//        for (String e:count) {
//            System.out.print(e);
//            if(i!=0) System.out.println(" // " + count[i-1]);
//            i++;
//        }

//        first:
//        for (int i = 1; i < 6; ++i) {
//            for (int j = 1; j < 5; ++j) {
//                if (i == 3 || j == 2)
//
//                    // skips the iteration of label (outer for loop)
//                    System.out.println("i = " + i + "; j = " + j);
//            }
//        }


//        long current = System.currentTimeMillis();
//        try {
//            Thread.sleep(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(System.currentTimeMillis() -  current >= 30_000);
//        while (true){
//            System.out.println("waiting" + (System.currentTimeMillis() -  current) /1000);
//            if(System.currentTimeMillis() -  current >= 5_000) break;
//        }

//        int arr[] = new int[5];
//        int arr[] = {1 ,2, 3, 4, 5 };
//        int arrNew[] = new int[5];
//
//        arr[3] = 1_000;
//
//        System.out.println(arr);
//        System.out.println(Arrays.toString(arr));
//
//        int count = 0;
//        for (int num: arr) {
//            if(num == 1000) continue;
//            num = num *5;
//            arrNew[count] = num;
//            System.out.println(num);
//            count++;
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arrNew));

//        multiArray[3][4]
        int multiArray[][] = {{0, 1,3, 5}, {0, 1, 6 ,7}, {0, 1 ,1 ,1 }};
        int multiArray2[][] = {{2,2,2}, {2,2,2}, {2,2,2}, {}};

//        for (int i = 0; i < multiArray.length; i++) {
//            if (i%2 == 0){
//                for (int j = 0; j < multiArray[0].length; j++) {
//                    if(j%2 == 0){
//                        System.out.println(multiArray[i][j]);
//                    }
//                }
//            }
//        }
        System.out.println(Arrays.toString(multiArray2[0]));
        System.out.println(Arrays.toString(multiArray2[1]));
        System.out.println(Arrays.toString(multiArray2[2]));

        System.arraycopy(multiArray, 1 , multiArray2 , 1, 1 );

        System.out.println(Arrays.toString(multiArray2[0]));
        System.out.println(Arrays.toString(multiArray2[1]));
        System.out.println(Arrays.toString(multiArray2[2]));



    }
}
