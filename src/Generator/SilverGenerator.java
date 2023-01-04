package Generator;

import Interface.GameItem;
import Interface.ItemGenerator;
import Reward.SilverReward;

public class SilverGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new SilverReward();
    }
}
