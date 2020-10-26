package lessons.lesson14;

public enum Courses implements Teacher{
    FRONTEND_DEVELOPMENT("10_000"){
        @Override
        public String getName() {
            return "alex";
        }
    },
    BACKEND_DEVELOPMENT("11_000"){
        @Override
        public String getName() {
            return "alexey";
        }
    },
    QA_MANUAL("12_000"){
        @Override
        public String getName() {
            return "alexandra";
        }
    },
    QA_AUTOMATION("13_000"){
        @Override
        public String getName() {
            return "sergii";
        }
    },
    BUSINESS_ANALYSIS("15_000"){
        @Override
        public String getName() {
            return "mark";
        }
    };


    private final String price;

    Courses(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return new StringBuilder().append(name()).append(" courses price - ").append(getPrice()).toString();
    }

}
