package Money;

import java.util.LinkedHashMap;
import java.util.Map;

public class CoinPouch {
    protected Map<Currency, Integer> mapOfCoin;
    protected Copper copper = new Copper();
    protected Silver silver = new Silver();
    protected Gold gold = new Gold();

    public CoinPouch() {
        mapOfCoin = new LinkedHashMap<>();
        mapOfCoin.put(gold, 0);
        mapOfCoin.put(silver, 0);
        mapOfCoin.put(copper, 0);
    }

    public void addCurrency(Currency currencyToAdd, Integer amountOfCurrency) {
        if (currencyToAdd instanceof Copper) {
            mapOfCoin.put(copper, mapOfCoin.get(copper) + amountOfCurrency);
        } else if (currencyToAdd instanceof Silver) {
            mapOfCoin.put(silver, mapOfCoin.get(silver) + amountOfCurrency);
        } else {
            mapOfCoin.put(gold, mapOfCoin.get(gold) + amountOfCurrency);
        }
    }

    public String getCoins() {
        String stringOfCoins = "";
        for (Map.Entry<Currency, Integer> coin : mapOfCoin.entrySet()) {
            stringOfCoins += coin.getKey().toString()+ ": ";
            stringOfCoins += coin.getValue().toString() + " ";
        }
        System.out.println(stringOfCoins);
        return stringOfCoins;
    }

    public void fixCopper() {
        if (mapOfCoin.get(copper) > 99) {
            Integer copperResult = mapOfCoin.get(copper) / 100;
            Integer leftOverCopper = mapOfCoin.get(copper) - (100 * copperResult);
            mapOfCoin.replace(silver, copperResult + mapOfCoin.get(silver));
            mapOfCoin.replace(copper, leftOverCopper);
        }
    }

    public void fixSilver() {
        if (mapOfCoin.get(silver) > 99) {
            Integer silverResult = mapOfCoin.get(silver) / 100;
            Integer leftOverSilver = mapOfCoin.get(silver) - (100 * silverResult);
            mapOfCoin.replace(gold, silverResult + mapOfCoin.get(gold));
            mapOfCoin.replace(silver, leftOverSilver);
        }
    }

    public void fixCoin() {
        fixCopper();
        fixSilver();
    }

    public Integer getCopper() {
        return mapOfCoin.get(copper);
    }

    public Integer getSilver() {
        return mapOfCoin.get(silver);
    }

    public Integer getGold() {
        return mapOfCoin.get(gold);
    }

}
