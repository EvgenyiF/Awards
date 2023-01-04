package Generator;

import Interface.GameItem;
import Interface.ItemGenerator;
import Reward.IronReward;

public class IronGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new IronReward();
    }
}
