package Reward;

import Interface.GameItem;

public class TreeReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Tree");
    }
}
