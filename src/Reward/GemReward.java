package Reward;

import Interface.GameItem;

public class GemReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Gem");
    }
}
