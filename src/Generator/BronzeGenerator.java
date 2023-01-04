package Generator;

import Interface.GameItem;
import Interface.ItemGenerator;
import Reward.BronzeReward;

public class BronzeGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new BronzeReward();
    }
}
