package day36_inheritance.app;

public class Application {
    String name;
    double version;

    public Application(String name, double version) {
        this.name = name;
        this.version = version;
    }

    public void download(){
        System.out.println(name + " is downloading version " + version);
    }
}
