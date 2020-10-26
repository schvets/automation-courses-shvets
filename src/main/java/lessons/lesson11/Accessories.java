package main.java.lessons.lesson11;

public class Accessories extends Device{
    private Boolean isWirless;

    public Accessories(String type, String description, Boolean isWirless) {
        super(type, description);
        this.isWirless = isWirless;
    }

    public Boolean getWirless() {
        return isWirless;
    }

    public void setWirless(Boolean wirless) {
        isWirless = wirless;
    }

    @Override
    public String toString() {
        return "Accessories{" +
                "type='" + getType() + '\'' +
                ", description='" + getDescription() + '\'' +
                "isWirless=" + isWirless +
                '}';
    }
}
