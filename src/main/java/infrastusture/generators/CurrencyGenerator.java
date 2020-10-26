package infrastusture.generators;

import java.util.Arrays;
import java.util.Random;

public class CurrencyGenerator implements Generator{
    @Override
    public Currency generate() {
        return Arrays.asList(Currency.values()).get(new Random().nextInt(Currency.values().length));
    }

    public enum Currency {
        EUR,
        USD,
        RUB;
    }
}
