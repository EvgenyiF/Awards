import Generator.*;
import Interface.ItemGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        Random random = ThreadLocalRandom.current();
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        generatorList.add(new GemGenerator());
        generatorList.add(new PlatinumGenerator());
        generatorList.add(new SilverGenerator());
        generatorList.add(new BronzeGenerator());
        generatorList.add(new DiamondGenerator());
        generatorList.add(new IronGenerator());
        generatorList.add(new TreeGenerator());

        for (int i = 0; i<20; i++){
            int index = Math.abs(random.nextInt(0,8));
            ItemGenerator itemGenerator = generatorList.get(index);
            itemGenerator.openReward();
        }
    }
}

