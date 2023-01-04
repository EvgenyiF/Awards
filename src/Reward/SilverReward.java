package Reward;

import Interface.GameItem;

public class SilverReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Silver");
    }
}
