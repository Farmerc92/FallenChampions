package Money;

import java.util.LinkedHashMap;
import java.util.Map;

public class CoinPouch {
    protected Map<Coin, Integer> mapOfCoin;

    protected Coin copperCoin = Coin.COPPER;
    protected Coin silverCoin = Coin.SILVER;
    protected Coin goldCoin = Coin.GOLD;

    public CoinPouch() {
        mapOfCoin = new LinkedHashMap<>();
        mapOfCoin.put(goldCoin, 0);
        mapOfCoin.put(silverCoin, 0);
        mapOfCoin.put(copperCoin, 0);
    }

    public void addCurrency(Coin currencyToAdd, Integer amountOfCurrency) {
        if (currencyToAdd.equals(copperCoin)) {
            mapOfCoin.put(copperCoin, mapOfCoin.get(copperCoin) + amountOfCurrency);
        } else if (currencyToAdd.equals(silverCoin)) {
            mapOfCoin.put(silverCoin, mapOfCoin.get(silverCoin) + amountOfCurrency);
        } else {
            mapOfCoin.put(goldCoin, mapOfCoin.get(goldCoin) + amountOfCurrency);
        }
    }

    public String getCoins() {
        String stringOfCoins = "";
        for (Map.Entry<Coin, Integer> coin : mapOfCoin.entrySet()) {
            stringOfCoins += coin.getKey().toString()+ ": ";
            stringOfCoins += coin.getValue().toString() + " ";
        }
        System.out.println(stringOfCoins);
        return stringOfCoins;
    }

    public void fixCopper() {
        if (mapOfCoin.get(copperCoin) > 99) {
            Integer copperResult = mapOfCoin.get(copperCoin) / 100;
            Integer leftOverCopper = mapOfCoin.get(copperCoin) - (100 * copperResult);
            mapOfCoin.replace(silverCoin, copperResult + mapOfCoin.get(silverCoin));
            mapOfCoin.replace(copperCoin, leftOverCopper);
        }
    }

    public void fixSilver() {
        if (mapOfCoin.get(silverCoin) > 99) {
            Integer silverResult = mapOfCoin.get(silverCoin) / 100;
            Integer leftOverSilver = mapOfCoin.get(silverCoin) - (100 * silverResult);
            mapOfCoin.replace(goldCoin, silverResult + mapOfCoin.get(goldCoin));
            mapOfCoin.replace(silverCoin, leftOverSilver);
        }
    }

    public void fixCoin() {
        fixCopper();
        fixSilver();
    }

    public Integer getCopper() {
        return mapOfCoin.get(copperCoin);
    }

    public Integer getSilver() {
        return mapOfCoin.get(silverCoin);
    }

    public Integer getGold() {
        return mapOfCoin.get(goldCoin);
    }

}
