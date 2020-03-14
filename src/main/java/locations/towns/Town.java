package locations.towns;

import locations.Location;
import locations.towns.buildings.Inn;
import locations.towns.buildings.Shop;
import locations.towns.buildings.SkillShop;

public abstract class Town extends Location {
    protected Shop shop;
    protected Inn inn;
    protected SkillShop skillShop;
}
