package Generator;

import Interface.GameItem;
import Interface.ItemGenerator;
import Reward.GemReward;

public class GemGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new GemReward();
    }
}
