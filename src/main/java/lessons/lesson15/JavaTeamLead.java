package lessons.lesson15;

public class JavaTeamLead extends DeveloperDecorator{
    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendReport();
    }

    public String sendReport() {
        return "send weekly report";
    }
}
