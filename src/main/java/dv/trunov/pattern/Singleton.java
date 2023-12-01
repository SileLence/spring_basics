package dv.trunov.pattern;

public class Singleton {

    private static Singleton instance;
    private String name;

    private Singleton(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println(name);
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
