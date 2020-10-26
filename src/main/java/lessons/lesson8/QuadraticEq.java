package main.java.lessons.lesson8;

public class QuadraticEq {
    // ax2 + bx + c = 0
    // x1+x2=-b  x1x2=c

//    x1 = -5
//    x2 = 3
 //  − x2  − 2x + 15  = 0

    //a
    //b
    //c

    public static double[] solverQe(double b, double c){
        double[] res = new double[10];
        int counter =0;
        double limit = Math.max(Math.abs(b), Math.abs(c));

        for (double i = -limit; i <= limit; i++) {
            for (double j = -limit; j <= limit; j++) {
                if(i*j == c && i+j== -b){
                    res[counter] = i;
                    counter++;
                    res[counter] = j;
                    counter++;
                }
            }
        }
        return  res;
    }

}
