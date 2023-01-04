package Generator;

import Interface.GameItem;
import Interface.ItemGenerator;
import Reward.TreeReward;

public class TreeGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new TreeReward();
    }
}
