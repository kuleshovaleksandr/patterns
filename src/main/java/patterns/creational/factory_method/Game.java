package main.java.patterns.creational.factory_method;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    public static void main(String[] args) {
        Random random = ThreadLocalRandom.current();
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GemGenerator());
        generatorList.add(new GoldGenerator());

        for(int i = 0; i < 10; i++) {
            int idx = random.nextInt(2);
            ItemGenerator itemGenerator = generatorList.get(idx);
            itemGenerator.openReward();
        }
    }
}
