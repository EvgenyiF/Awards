package Reward;

import Interface.GameItem;

public class BronzeReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Bronze");
    }
}
