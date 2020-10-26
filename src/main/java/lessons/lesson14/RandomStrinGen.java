package lessons.lesson14;

import java.util.Random;

public class RandomStrinGen {
    public String alphabet = "hroshogihpahpihpfa";
    public String nums = "1290395";

    public String strinGeneretor(String mode, int length) {
        String tempString = "";
        if (mode.equals("alpha")) {
            tempString = alphabet;
        } else if (mode.equals("alphanumeric")) {
            tempString = alphabet + nums;
        } else if (mode.equals("numeric")) {
            tempString = nums;
        }
        StringBuilder result = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            result.append(tempString.charAt(rand.nextInt(tempString.length())));
        }
        return result.toString();
    }
}
