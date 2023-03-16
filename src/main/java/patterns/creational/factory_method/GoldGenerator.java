package main.java.patterns.creational.factory_method;

public class GoldGenerator extends ItemGenerator {
    @Override
    GameItem createItem() {
        return new GoldReward();
    }
}
