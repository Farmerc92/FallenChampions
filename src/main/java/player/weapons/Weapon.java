package player.weapons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import player.Value;
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Claymore.class, name = "Claymore"),
        @JsonSubTypes.Type(value = Crossbow.class, name = "Crossbow"),
        @JsonSubTypes.Type(value = DeldrimorGreatSword.class, name = "DeldrimorGreatSword"),
        @JsonSubTypes.Type(value = DhuumsSoulReaper.class, name = "DhuumsSoulReaper"),
        @JsonSubTypes.Type(value = Longsword.class, name = "Longsword"),
        @JsonSubTypes.Type(value = Mace.class, name = "Mace"),
        @JsonSubTypes.Type(value = Shortbow.class, name = "Shortbow"),
        @JsonSubTypes.Type(value = Shortsword.class, name = "Shortsword"),
        @JsonSubTypes.Type(value = Staff.class, name = "Staff") }
)

public abstract class Weapon implements Value {
    protected int attackPower;

    public Weapon(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}
