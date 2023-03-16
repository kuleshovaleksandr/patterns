package main.java.patterns.creational.factory_method;

public abstract class ItemGenerator {

    public void openReward() {
        GameItem gameItem = createItem();
        gameItem.open();
    }

    abstract GameItem createItem();
}
