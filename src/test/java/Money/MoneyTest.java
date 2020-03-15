package Money;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoneyTest {

    CoinPouch coinPouch;
    Coin copperCoin = Coin.COPPER;
    Coin silverCoin = Coin.SILVER;
    Coin goldCoin = Coin.GOLD;

    @Before
    public void setup() {
        coinPouch = new CoinPouch();
    }

    @Test
    public void testCopperConstructor() {
        Assert.assertEquals(1, copperCoin.getValue());
    }

    @Test
    public void testSilverConstructor() {
        Assert.assertEquals(1, silverCoin.getValue());
    }

    @Test
    public void testGoldConstructor() {
        Assert.assertEquals(1, goldCoin.getValue());
    }

    @Test
    public void testCoinPouchConstructor() {
        coinPouch.getCoins();
        Assert.assertEquals(3, coinPouch.mapOfCoin.size());
    }

    @Test
    public void testAddCopper() {
        coinPouch.addCurrency(copperCoin, 10);
        coinPouch.addCurrency(copperCoin, 20);
        coinPouch.getCoins();
        int actualAmountOfCopper = coinPouch.getCopper();
        Assert.assertEquals(30, actualAmountOfCopper);
    }

    @Test
    public void testAddSilver() {
        coinPouch.addCurrency(silverCoin, 10);
        coinPouch.getCoins();
        int actualAmountOfSilver = coinPouch.getSilver();
        Assert.assertEquals(10, actualAmountOfSilver);
    }

    @Test
    public void testAddGold() {
        coinPouch.addCurrency(goldCoin, 20);
        coinPouch.getCoins();
        int actualAmountOfGold = coinPouch.getGold();
        Assert.assertEquals(20, actualAmountOfGold);
    }

    @Test
    public void testAddAllThreeCurrencies() {
        coinPouch.addCurrency(copperCoin, 76);
        coinPouch.addCurrency(silverCoin, 32);
        coinPouch.addCurrency(goldCoin, 2);
        coinPouch.getCoins();
        int actualAmountOfCopper = coinPouch.getCopper();
        int actualAmountOfSilver = coinPouch.getSilver();
        int actualAmountOfGold = coinPouch.getGold();

        Assert.assertEquals(76, actualAmountOfCopper);
        Assert.assertEquals(32, actualAmountOfSilver);
        Assert.assertEquals(2, actualAmountOfGold);
    }

    @Test
    public void testCopperOverload() {
        coinPouch.addCurrency(copperCoin, 230);
        coinPouch.getCoins();
        coinPouch.fixCoin();
        coinPouch.getCoins();

        int actualAmountOfCopper = coinPouch.getCopper();
        int actualAmountOfSilver = coinPouch.getSilver();

        Assert.assertEquals(30, actualAmountOfCopper);
        Assert.assertEquals(2, actualAmountOfSilver);
    }

    @Test
    public void testCopperMegaOverload() {
        coinPouch.addCurrency(copperCoin, 23472);
        coinPouch.getCoins();
        coinPouch.fixCoin();
        coinPouch.getCoins();

        int actualAmountOfCopper = coinPouch.getCopper();
        int actualAmountOfSilver = coinPouch.getSilver();
        int actualAmountOfGold = coinPouch.getGold();

        Assert.assertEquals(72, actualAmountOfCopper);
        Assert.assertEquals(34, actualAmountOfSilver);
        Assert.assertEquals(2, actualAmountOfGold);
    }

    @Test
    public void testSilverOverload() {
        coinPouch.addCurrency(silverCoin, 305);
        coinPouch.getCoins();
        coinPouch.fixCoin();
        coinPouch.getCoins();

        int actualAmountOfCopper = coinPouch.getSilver();
        int actualAmountOfSilver = coinPouch.getGold();

        Assert.assertEquals(5, actualAmountOfCopper);
        Assert.assertEquals(3, actualAmountOfSilver);
    }

    @Test
    public void testSilverMegaOverload() {
        coinPouch.addCurrency(silverCoin, 1002);
        coinPouch.getCoins();
        coinPouch.fixCoin();
        coinPouch.getCoins();

        int actualAmountOfSilver = coinPouch.getSilver();
        int actualAmountOfGold = coinPouch.getGold();

        Assert.assertEquals(2, actualAmountOfSilver);
        Assert.assertEquals(10, actualAmountOfGold);
    }

    @Test
    public void testRandomAdded() {
        coinPouch.addCurrency(copperCoin, 105);
        coinPouch.addCurrency(silverCoin, 15);
        coinPouch.addCurrency(goldCoin, 2);
        coinPouch.getCoins();
        coinPouch.fixCoin();
        coinPouch.getCoins();

        int actualAmountOfCopper = coinPouch.getCopper();
        int actualAmountOfSilver = coinPouch.getSilver();
        int actualAmountOfGold = coinPouch.getGold();

        Assert.assertEquals(5, actualAmountOfCopper);
        Assert.assertEquals(16, actualAmountOfSilver);
        Assert.assertEquals(2, actualAmountOfGold);
    }

    @Test
    public void testRandomAddedAgain() {
        coinPouch.addCurrency(copperCoin, 105);
        coinPouch.addCurrency(silverCoin, 107);
        coinPouch.addCurrency(goldCoin, 2);
        coinPouch.getCoins();
        coinPouch.fixCoin();
        coinPouch.getCoins();

        int actualAmountOfCopper = coinPouch.getCopper();
        int actualAmountOfSilver = coinPouch.getSilver();
        int actualAmountOfGold = coinPouch.getGold();

        Assert.assertEquals(5, actualAmountOfCopper);
        Assert.assertEquals(8, actualAmountOfSilver);
        Assert.assertEquals(3, actualAmountOfGold);
    }

}
