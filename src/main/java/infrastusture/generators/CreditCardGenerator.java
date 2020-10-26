package infrastusture.generators;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;

import static infrastusture.generators.CreditCard.CreditCardType.*;
import static java.lang.Integer.*;

public class CreditCardGenerator implements Generator{
    Random r = new Random();

    @Override
    public CreditCard generate() {
        CreditCard result = null;
        switch (CreditCard.CreditCardType.values()[new Random().nextInt(values().length)]){
            case VISA:
                result = new CreditCard(VISA, 4 + generateNumber(), generateCvv(), generateExpire());
                break;
            case MAESTRO:
                result = new CreditCard(MAESTRO, 6 + generateNumber(), generateCvv(), generateExpire());
                break;
            case MASTERCARD:
                result = new CreditCard(MASTERCARD, 5 + generateNumber(), generateCvv(), generateExpire());
                break;
        }
        return result;
    }

    private String generateNumber(){
        return generateStringByParam(15,10);

    }


    private String generateCvv(){
        return generateStringByParam(3,10);
    }

    private String generateExpire(){
        StringBuilder sb = new StringBuilder();
        LocalDateTime now = LocalDateTime.now();
        int minYear = parseInt(Integer.toString(now.getYear()).substring(2));
        int minMonth = now.getMonth().getValue();

        int year = r.nextInt((99 - minYear) + 1) + minYear;
        int month = (year == minYear) ? (r.nextInt((12 - minMonth) + 1) + minMonth) : (r.nextInt((12 - 1) + 1) + 1);

        return sb.append(month<10 ? 0 + Integer.toString(month): Integer.toString(month)).append("/").append(year).toString();
    }


    private String generateStringByParam(int length, int bound){
        StringBuilder sb = new StringBuilder();
        while (sb.toString().length()<length){
            sb.append(r.nextInt(bound));
        }
        return sb.toString();
    }
}
