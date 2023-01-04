package Generator;

import Interface.GameItem;
import Interface.ItemGenerator;
import Reward.PlatinumReward;

public class PlatinumGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new PlatinumReward();
    }
}
