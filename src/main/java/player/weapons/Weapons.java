package player.weapons;

import Money.Coin;
import player.Managable;

public enum Weapons implements Managable {

    CLAYMORE("Claymore",2, Coin.COPPER, 30),
    CROSSBOW("Crossbow", 1, Coin.COPPER, 25),
    DELDRIMOREGREATSWORD("Deldrimor Greatsword", 25, Coin.SILVER, 75),
    DHUUMSSOULREAPER("Dhuum's Soul Reaper",2, Coin.GOLD,5000),
    LONGSWORD("Longsword",2, Coin.COPPER, 80),
    MACE("Mace",2, Coin.COPPER,69),
    SHORTBOW("Shortbow",2, Coin.COPPER, 20),
    SHORTSWORD("Shortsword",2, Coin.COPPER, 23),
    STAFF("Staff",2, Coin.COPPER, 15),
    FISTS("Fists", 1, null, 0);

    private final String name;
    private final int attackPower;
    private final Coin coinType;
    private final int howManyCoin;

    Weapons(String name, int attackPower, Coin coinType, int howManyCoin) {
        this.name = name;
        this.attackPower = attackPower;
        this.coinType = coinType;
        this.howManyCoin = howManyCoin;
    }

    public int getAttackPower() {
        return this.attackPower;
    }

    public Coin getWeaponCurrency() {
        return this.coinType;
    }

    public int getHowManyCoin() {
        return this.howManyCoin;
    }

    public String getName() {
        return name;
    }
}
