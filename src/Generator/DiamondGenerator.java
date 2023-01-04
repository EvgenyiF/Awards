package Generator;

import Interface.GameItem;
import Interface.ItemGenerator;
import Reward.DiamondReward;

public class DiamondGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new DiamondReward();
    }
}
