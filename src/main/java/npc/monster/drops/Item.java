package npc.monster.drops;


import interfaces.Value;
import player.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import interfaces.Value;


public abstract class Item implements Value, Dropable {
    public static Map< String , Integer> dropTable = new HashMap<>();

    public void lootPickUp(){
    }
}
