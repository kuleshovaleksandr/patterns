package main.java.patterns.creational.factory_method;

public class GoldReward implements GameItem {
    @Override
    public void open() {
        System.out.println("GoldReward opened");
    }
}
