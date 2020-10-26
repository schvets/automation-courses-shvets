package lessons;

import infrastusture.generators.*;

public class FakeData {
    private static Generator generator;

    public static void main(String[] args) {
        generator = new ColorGenerator();
        System.out.println(generator.generate());

        generator = new CurrencyGenerator();
        System.out.println(generator.generate());

        generator = new CreditCardGenerator();
        System.out.println(generator.generate());
        System.out.println(generator.generate());
        System.out.println(generator.generate());
        System.out.println(generator.generate());

        generator = new EmailGenerator();
        System.out.println(generator.generate());
        System.out.println(generator.generate());
        System.out.println(generator.generate());
        System.out.println(generator.generate());
        System.out.println(generator.generate());

    }


}
