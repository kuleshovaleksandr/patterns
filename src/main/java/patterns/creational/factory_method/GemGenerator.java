package main.java.patterns.creational.factory_method;

public class GemGenerator extends ItemGenerator {
    @Override
    GameItem createItem() {
        return new GemReward();
    }
}
