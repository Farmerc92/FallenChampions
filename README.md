# Maven.FallenChampions
* Text Based Adventure Game By Chris Farmer, Giles Bradford, and Zeth Kane.
* Date started 3/12/2020
* Version 0.1

# Fallen Champions
Glossary
1. About
2. Classes
3. Traversing
4. Inventory
5. Items
6. Currency
7. Combat
8. Boss Fights
9. Merchants
10. Inns
11. Random Events
12. Quests???
13. Extras

# About
* Text / console based game built in java 8.  
* Single player campaign style.  The style of the game allows players to choose between options that will alter late 
game decisions. 
* Player profiles can be saved and loaded.
* To save the game data, you must sleep at an Inn.
The game will be loaded up from the respective Inn the player slept at. 

# Classes
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
* Leveling up is instant but you must go to a trainer in a locations to spend your skill and attribute points. 
    * On level up, the player will be rewarded 1 skill point and 2 attribute points.  
    
* Player level will cap at 60. 

* Weapons and armors are acquirable through NPC drops and merchants.
    * Items will have a chance to drop from mobs. 
    * Special items will be a guaranteed drop from bosses. 
    
# Traversing
* Travelling between locations leads to random encounters. See Combat section for more details. 
* There are multiple ways to traverse from locations 'a' to locations 'b'.
    * The overall map will look like a tree with different branches for locations. 
        * For example, The first locations will give you the option to lead to two locations('a' and 'b'). If the player chooses 'a'
        they then have the option to go to 'c' and 'd' but they cannot go from 'c' to 'b'. The player will need to traverse
        through the middle grounds between 'c' to 'a' to then access 'b'. To keep it short, there is not fast traveling in this
        game... for now. 
* Player has an armor slot and a weapon slot.  You start with a shirt and a club.  
* There are bosses to defeat for loot!
* The story is still being written.
    
# Inventory
* Each character will have an inventory with the below. 
    * Each player will have two slots in their inventory for gear. 
        * One for armor
        * One for weapon
    * Miscellaneous fields to hold the below values will be shown in the inventory. 
        * Gold
        * Silver
        * Copper
    * 20 open inventory slots to store items. 

# Items
* Each item that is found in the game(weapon and armor) will have stats. 
    * weapon
        * Damage(DMG)
        * RequiredLVL(Req.)
        * Sell price
    * armor
        * Defense(DEF)
        * RequiredLVL(Req.)
        * Sell price
        
# Currency
* The main currency in this game is coin. 
* Three types of coin. 
    1. Gold (1) = 100 Silver
    2. Silver (1) = 100 Copper
    3. Copper (1) = 1 Copper
        
* Currency can be acquired from killing monsters or selling goods to a merchant. 

# Combat
* Combat will be turn based combat giving the player options to choose from. The hit percentages will be based off of 
a random number given the players accuracy(ACC) level. 

* While a player is traversing between locations, they will have a chance to encounter an enemy. The player will have two options;
    1. Fight
    2. Attempt to run
        * If the attempt to run feature does not pass, the fight function will run. 
        
    How does combat work?
    * The hitpoints(HP) and level of the monster will be displayed. 
    * The player will choose an option from attack. 
        * Use basic attack.
            * This stems from the base damage of their weapon. 
        * Use skill
            * The player will be given an option of skills with the display of what the skill can do. 
    * If the monster is defeated and any items drop, the user will have the option to pickup the items. There will be 
    no instance where the user is hindered by weight. They will need to worry about inventory space. 
       

# Boss Fights
* Boss fights are encountered until the boss is defeated. Once the boss has been defeated, you cannot fight the boss again. 
The idea of a boss fight is to acquire the loot which has a 100% drop rate but the fight is rather difficult. The players stats
must be high enough to withstand the boss for the duration of the fight and come out victorious. 
* Each boss has it's own special attack that will happen on the boss's first attack and again every 5th attack after that. 

# Extras
* RaNdOm EnCoUnTeRs?!

* These will be extra random encounters that happen during the game rather than the mobs that you 
find between locations. 

* Possible Encounters
    * Fall into a pit that leads to a maze/instance of loot
    * Secret boss that has a random chance to fight you whenever(maybe a shade or Dhuum?).
    * Stumble upon a cave that houses a bandit camp with potentially valuable loot. 
    * If it's between the hours of 12AM and 6AM you can encounter a fight with a vampire.
