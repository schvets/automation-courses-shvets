package infrastusture.generators;

import lessons.lesson14.TestUrlOr;

import java.util.Arrays;
import java.util.Random;

import static java.util.Arrays.*;

public class
EmailGenerator implements Generator {
    static String[] names = {"Hafs", "David", "Jamelia", "Kiera", "Sanderson", "Leslie", "Gutierrez", "Jad", "Elora", "Daugherty"};
    static String[] lastNames = {"Mccarthy", "Ryan", "Mendoza", "Richards", "Robbins", "Malone", "Terry", "Silva", "Thompson", "Wyatt"};
    static String[] domains = {"11mail.com", "123.com", "123box.net", "123india.com", "123mail.cl", "123qwe.co.uk", "126.com", "150ml.com", "15meg4free.com"};
    static Random r = new Random();

    @Override
    public String generate() {
        return Arrays.asList(EmailTypes.values()).get(r.nextInt(EmailTypes.values().length)).get();

    }

    public enum EmailTypes {
        WITH_NAME {
            @Override
            public String get() {
                return new Email.Builder()
                        .withName(getRandomFromArray(names) + ".")
                        .withLastName(getRandomFromArray(lastNames))
                        .withFreeEmailDomain(getRandomFromArray(domains))
                        .build();
            }
        },
        WITH_LAST_NAME{
            @Override
            public String get() {
                return new Email.Builder()
                        .withFirstName(getRandomFromArray(names) + ".")
                        .withLastName(getRandomFromArray(lastNames))
                        .withFreeEmailDomain(getRandomFromArray(domains))
                        .build();
            }
        },
        WITH_RANDOM_NUM{
            @Override
            public String get() {
                return new Email.Builder()
                        .withFirstName(getRandomFromArray(names) )
                        .withLastName(Integer.toString(r.nextInt()))
                        .withFreeEmailDomain(getRandomFromArray(domains))
                        .build();
            }
        },
        WITH_YEAR{
            @Override
            public String get() {
                return new Email.Builder()
                        .withFirstName(getRandomFromArray(names) )
                        .withLastName(Integer.toString(r.nextInt((2020 - 1900) + 1) + 1900))
                        .withFreeEmailDomain(getRandomFromArray(domains))
                        .build();
            }
        }
        ;

        public abstract String get();
    }

    private static String getRandomFromArray(String[] array) {
        return asList(array).get(r.nextInt(asList(array).size()));
    }

}


// [name].[last_name] @ [free_email_domain]
//- [last_name].[first_name] @ [free_email_domain]
//- [first_name][random_number 1-99] @ [free_email_domain]
//- [last_name][year]@[free_email_domain]