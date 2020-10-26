package infrastusture;

import java.util.Random;

public class StringUtils {
    public String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public String nums = "0123456789";

    public String stringGeneretor(String mode, int length){

//        abcdefghijklmnopqrstuvwxyz 0123456789 (){}[]
//        ABCDEFGHIJKLMNOPQRSTUVWXYZ +-*/= .,;:!? #&$%@|^

        StringBuilder result = new StringBuilder();

        String tempString = "";

        if(mode.equals("alpha")){
            tempString = alphabet;
        }
        else if (mode.equals("alphaNumeric")){
            tempString = alphabet + nums;
        }
        else if (mode.equals("numeric")){
            tempString = nums;
        }

        Random rand = new Random();

        StringBuilder build = new StringBuilder();
        for (int i = 0; i < length; i++) {
            build.append(tempString.charAt(rand.nextInt(tempString.length())));
        }

        return build.toString();
    }
}
