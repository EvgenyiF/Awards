package Reward;

import Interface.GameItem;

public class PlatinumReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Platinum");
    }
}
