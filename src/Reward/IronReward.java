package Reward;

import Interface.GameItem;

public class IronReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Iron");
    }
}
