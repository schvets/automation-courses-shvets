package main.java.lessons.lesson11;

public final class Laptop extends Device{
    private String screenSize;
    private String arch;
    private String spec;

    public Laptop(String type, String description, String screenSize, String arch, String spec) {
        super(type, description);
        this.screenSize = screenSize;
        this.arch = arch;
        this.spec = spec;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getDescription() {
        return "laptop ovverrided descr " + super.getDescription();
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "type='" + getType() + '\'' +
                ", description='" + getDescription() + '\'' +
                "screenSize='" + screenSize + '\'' +
                ", arch='" + arch + '\'' +
                ", spec='" + spec + '\'' +
                '}';
    }
}
