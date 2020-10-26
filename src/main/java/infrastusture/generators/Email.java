package infrastusture.generators;

import lessons.lesson14.TestUrlOr;

public class Email {
    public String name = "";
    public String firstName = "";
    public String lastName= "";
    public String freeEmailDomain= "";
    public String randomNumber= "";
    public String year= "";


        public static class Builder {
            private Email email;

            public Builder() {
                email = new Email();
            }

            public Builder withName(String name) {
                email.name = name;
                return this;
            }

            public Builder withFirstName(String firstName) {
                email.firstName = firstName;
                return this;
            }

            public Builder withLastName(String lastName) {
                email.lastName = lastName;
                return this;
            }

            public Builder withFreeEmailDomain(String freeEmailDomain) {
                email.freeEmailDomain = freeEmailDomain;
                return this;
            }

            public Builder withRandomNumber(String randomNumber) {
                email.randomNumber = randomNumber;
                return this;
            }

            public Builder withYear(String year) {
                email.year = year;
                return this;
            }

            public String build() {
                return new StringBuilder()
                        .append(email.firstName)
                        .append(email.lastName)
                        .append(email.name)
                        .append(email.randomNumber)
                        .append(email.year)
                        .append("@")
                        .append(email.freeEmailDomain)
                        .toString();
            }
        }
    }
