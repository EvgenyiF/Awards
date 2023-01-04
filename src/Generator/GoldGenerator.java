package Generator;

import Interface.GameItem;
import Interface.ItemGenerator;
import Reward.GoldReward;

public class GoldGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new GoldReward();
    }
}
