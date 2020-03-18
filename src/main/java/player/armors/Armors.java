package player.armors;

import Money.Coin;
import player.Managable;

public enum Armors implements Managable {
    CHAINMAIL("Chainmail", 3, Coin.COPPER, 20),
    CHESTPLATE("Chestplate", 5, Coin.COPPER, 78),
    GREENDHIDE("Green d'hide", 24, Coin.SILVER, 30),
    LEATHERVEST("Leather Vest", 3, Coin.COPPER, 3),
    OBSIDIANROBES("Obsidian Robes", 50, Coin.GOLD, 2),
    ROBES("Robes", 4, Coin.COPPER, 10),
    RUNEPLATEBODY("Rune Platebody", 55, Coin.GOLD, 2),
    SHIRT("Shirt", 1, Coin.COPPER, 1);

    private final String name;
    private final int defensePower;
    private final Coin armorCurrency;
    private final int howManyCoin;

    Armors (String name, int defensePower, Coin coinType, int howManyCoin) {
        this.name = name;
        this.defensePower = defensePower;
        this.armorCurrency = coinType;
        this.howManyCoin = howManyCoin;
    }

    public String getName() {
        return name;
    }

    public int getDefensePower() {
        return defensePower;
    }

    public Coin getArmorCurrency() {
        return armorCurrency;
    }

    public int getHowManyCoin() {
        return howManyCoin;
    }
}
