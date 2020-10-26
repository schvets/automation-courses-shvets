package lessons.lesson15;

public class SeniorJavaDevaloper extends DeveloperDecorator {

    public SeniorJavaDevaloper(Developer developer) {
        super(developer);
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }

    public String makeCodeReview() {
        return " make code review ";
    }
}
