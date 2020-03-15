package npc.monster.drops;

import Money.Coin;

public class WhelpScale extends Item {

    @Override
    public int value() {
        return Coin.COPPER.getValue() * 300;
    }
}
