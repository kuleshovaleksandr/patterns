package main.java.patterns.creational.singleton.on_demand_holder;

public class Singleton {

    private Singleton() {
    }

    public static class SingletonHolder {
        public static final Singleton HOLDER_INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}
