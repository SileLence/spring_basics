package dv.trunov;

public class Singleton {

    private static Singleton INSTANCE;
    private final String name;

    private Singleton(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println(name);
    }

    public static Singleton getInstance(String name) {
        if (INSTANCE == null) {
            INSTANCE = new Singleton(name);
        }
        return INSTANCE;
    }
}
