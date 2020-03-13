# Maven.FallenChampions
* Text Based Adventure Game By Chris Farmer, Giles Bradford, and Zeth Kane.
* Date started 3/12/2020
* Version 0.1

# Fallen Champions
* Text / console based game built in java 8.  
* Single player campaign style.  The style of the game allows players to choose between options that will alter late 
game decisions. 
* Player profiles can be saved and loaded.
* To save the game data, you must sleep at an Inn.
The game will be loaded up from the respective Inn the player slept at. 

#Classes
* There are no classes, but the current character is based off of customization from attributes and skills.
For example, the user can spec into intelligence for mage like abilities or build up dex to act as a rogue and access rogue 
skills.  
* Skill types:
    1. Warrior skills
    2. Archer skills
    3. Mage skills
* Attributes: 
    1. (Strength(STR)
    2. Dexterity(DEX)
    3. Intelligence(INT)
    4. Accuracy(ACC)
    5. Hitpoints(HP)
    6. Mana(MANA))
* Leveling up is instant but you must go to a trainer in a town to spend your skill and attribute points. 
    * On level up, the player will be rewarded 1 skill point and 2 attribute points.  
    
* Player level will cap at 60. 

* Weapons and armors are acquirable through NPC drops and merchants.
    * Items will have a chance to drop from mobs. 
    * Special items will be a guaranteed drop from bosses. 
    
#Inventory
* Each character will have an inventory with the below. 
    * Each player will have two slots in their inventory for gear. 
        * One for armor
        * One for weapon
    * Miscellaneous fields to hold the below values will be shown in the inventory. 
        * Gold
        * Silver
        * Copper

#Items
* Each item that is found in the game(weapon and armor) will have stats. 
    * weapon
        * Damage(DMG)
        * RequiredLVL(Req.)
    * armor
        * Defense(DEF)
        * RequiredLVL(Req.)
        
#Combat
* Combat will be turn based combat giving the player options to choose from. The hit percentages will be based off of 
a random number given the players accuracy(ACC) level. 
        
#Traversing
* Travelling between towns leads to random encounters.  
* There are multiple ways to traverse from town 'a' to town 'b'.
* Player has an armor slot and a weapon slot.  You start with a shirt and a club.  
* There are bosses to defeat for loot!
* The story is still being written.
