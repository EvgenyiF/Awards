package Reward;

import Interface.GameItem;

public class DiamondReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Diamond");
    }
}
