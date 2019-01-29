import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 * This class holds all methods concerning the player.
 * 
 * @author Ahmed Mansour 
 * @version 8/3/17
 */
public class Player
{
    private String name; //name of the player
    private int health; //current health of the player
    private int energy; //current energy of the player
    private int strength; //strength of the player
    private int EXP; //EXP the player owns
    private int magic; //magic of the player
    private int level; //level of the player
    private int damage; //damage the player deals
    private int gold; //gold the player owns
    private int EXPold; //EXP before EXP from a battle is earned, used to determine if a new level is reached
    private int healthLoss; //amount of health lost from an attack
    private int maxHealth; //max health the player has
    private int maxEnergy; //max energy the player has
    private int numHealthPot; //number of health potions the player owns
    private int numEnergyPot; //number of energy potions the player owns
    private int numRevive; //number of revive items the player own
    private String physicalWeapon; //name of the physical weapon the player owns
    private int physicalWeaponID = 0;
    private String magicWeapon; //name of the magic weapon the player owns
    private int magicWeaponID = 0;
    private int physicalWeaponStrength; //strength of the physical weapon
    private int magicWeaponStrength; //magic strength of the magic weapon
    private double healthMulti; //health stat level up multiplier, based on class
    private double energyMulti; //energy stat level up multiplier, based on class
    private double strengthMulti; //strength stat level up multiplier, based on class
    private double magicMulti; //magic stat level up multiplier, based on class
    private int areaComplete = 1; //index of the area you've been to, starting from 1, the first area
    private int currentArea;
    private int battleComplete = 1; //index of the battle you're in
    private boolean running;
    private String Password;
    private String attackType;
    private String playerClass; //class of the player
    private int classID;
    private String gender; //gender of the player (used when describing the attack of the player)
    private ArrayList<String> items = new ArrayList<String>(); //ArrayList that holds the items the player has
    private Effects effect = new Effects(); //creates an Effects class object
    public Player(String name, int health, int energy, int strength, int EXP, int magic, int level, int gold, int maxHealth, int maxEnergy, ArrayList<String> items, int numHealthPot, int numEnergyPot, String physicalWeapon, String magicWeapon, int physicalWeaponStrength, int magicWeaponStrength, String gender, String playerClass)
    {   //constructor that initalizes all the attributes of the player
        this.name = name;
        this.health = health;
        this.energy = energy;
        this.strength = strength;
        this.EXP = EXP;
        this.magic = magic;
        this.level = level;
        this.gold = gold;
        this.maxHealth = maxHealth;
        this.maxEnergy = maxEnergy;
        this.items = items;
        this.numHealthPot = numHealthPot;
        this.numEnergyPot = numEnergyPot;
        this.physicalWeapon = physicalWeapon;
        this.magicWeapon = magicWeapon;
        this.physicalWeaponStrength = physicalWeaponStrength;
        this.magicWeaponStrength = magicWeaponStrength;
        this.gender = gender;
        this.playerClass = playerClass;
    }
    public int getPlayerHealth()//returns the current health of the player
    {
        return health;
    }
    public void setPlayerHealth(int health)//sets the player health
    {
        this.health = health;
    }
    public int getPlayerLevel()//return the current level of the player
    {
        return level;
    }
    public void setPlayerLevel(int level)//sets the player level
    {
        this.level = level;
    }
    public int getPlayerEnergy()//return the current energy of the player
    {
        return energy;
    }
    public void setPlayerEnergy(int Energy)//sets the player energy
    {
        this.energy = energy;
    }
    public int getPlayerGold()//return the current gold of the player
    {
        return gold;
    }
    public void setPlayerGold(int gold)//sets the player gold
    {
        this.gold = gold;
    }
    public void setPlayerStrength(int strength)//sets the player strength
    {
        this.strength = strength;
    }
    public void setPlayerMagic(int magic)//sets the player magic
    {
        this.magic = magic;
    }
    public void setPlayerEXP(int EXP)//sets the player EXP
    {
        this.EXP = EXP;
    }
    public void setPlayerMaxHealth(int maxHealth)//sets the player EXP
    {
        this.maxHealth = maxHealth;
    }
    public void setPlayerMaxEnergy(int maxEnergy)//sets the player EXP
    {
        this.maxEnergy = maxEnergy;
    }
    public void setPlayerNumHealthPot(int numHealthPot)//sets the player EXP
    {
        this.numHealthPot = numHealthPot;
    }
    public void setPlayerNumEnergyPot(int numEnergyPot)//sets the player EXP
    {
        this.numEnergyPot = numEnergyPot;
    }
    public void setPlayerNumRevive(int numRevive)//sets the player EXP
    {
        this.numRevive = numRevive;
    }
    public void setPlayerPhysicalWeapon(int physicalWeaponID)//sets the player EXP
    {
        if(physicalWeaponID == 0)
        {
            physicalWeapon = "Fists";
            physicalWeaponStrength = 0;
        }
        else if(physicalWeaponID == 1)
        {
            physicalWeapon = "Wooden Sword";
            physicalWeaponStrength = 10;
        }
        else if(physicalWeaponID == 2)
        {
            physicalWeapon = "Copper Longsword";
            physicalWeaponStrength = 20;
        }
        else if(physicalWeaponID == 3)
        {
            physicalWeapon = "Iron Broadsword";
            physicalWeaponStrength = 35;
        }
        else if(physicalWeaponID == 4)
        {
            physicalWeapon = "Razor Sabre";
            physicalWeaponStrength = 50;
        }
        else if(physicalWeaponID == 5)
        {
            physicalWeapon = "Katana";
            physicalWeaponStrength = 75;
        }
        else if(physicalWeaponID == 6)
        {
            physicalWeapon = "Excalibur";
            physicalWeaponStrength = 250;
        }
    }
    public void setPlayerMagicWeapon(int magicWeaponID)//sets the player EXP
    {
        if(magicWeaponID == 0)
        {
            physicalWeapon = "Tree Branch";
            physicalWeaponStrength = 0;
        }
        else if(magicWeaponID == 1)
        {
            magicWeapon = "Plastic Stick";
            magicWeaponStrength = 10;
        }
        else if(magicWeaponID == 2)
        {
            magicWeapon = "Magician's Wand";
            magicWeaponStrength = 25;
        }
        else if(magicWeaponID == 3)
        {
            magicWeapon = "Golden Scepeter";
            magicWeaponStrength = 40;
        }
        else if(magicWeaponID == 4)
        {
            magicWeapon = "Titanium Staff";
            magicWeaponStrength = 65;
        }
        else if(magicWeaponID == 5)
        {
            magicWeapon = "Holographic Rod";
            magicWeaponStrength = 85;
        }
        else if(magicWeaponID == 6)
        {
            magicWeapon = "Strange Twig";
            magicWeaponStrength = 200;
        }
    }
    public void setPlayerAreaComplete(int areaComplete)//sets the player EXP
    {
        this.areaComplete = areaComplete;
    }
    public void setPlayerClassPass(int playerClassID)//sets the player EXP
    {
        if(playerClassID == 1)
        {
            playerClass = "Swordsmen";
            healthMulti = 1.5;
            energyMulti = 0.8;
            strengthMulti = 1.6;
            magicMulti = 0.5;
            maxHealth = 550;
            health = maxHealth;
            name += " The Swordsmen";
        }
        else if(playerClassID == 2)
        {
            playerClass = "Wizard";
            healthMulti = 0.9;
            energyMulti = 1.2;
            strengthMulti = 0.5;
            magicMulti = 1.7;
            maxHealth = 450;
            health = maxHealth;
            name += " The Wizard";
        }
        else if(playerClassID == 3)
        {
            playerClass = "Tank";
            healthMulti = 1.8;
            energyMulti = 1.1;
            strengthMulti = 1.3;
            magicMulti = 0.9;
            maxHealth = 650;
            health = maxHealth;
            name += " The Tank";
        }
    }
    public void setPlayerGenderPass(String gender)//sets the player EXP
    {
        this.gender = gender;
    }
    public void setPlayerName(String name)//sets the player name
    {
        this.name = name;
    }
    public int getBattleComplete()
    {
        return battleComplete;
    }
    public void setPlayerGender(String choice)//sets the player gender
    {
        Scanner ix = new Scanner(System.in);
        if(choice.equals("M"))
        {
            gender = "his";
        }
        else if(choice.equals("F"))
        {
            gender = "her";
        }
        else
        {
            effect.Scroll("Invalid choice. Please try again!");
            effect.pauseQuick();
            effect.Scroll("Please choose your player gender ([M]ale or [F]emale)");
            choice = ix.next();
            setPlayerGender(choice); //calls itself to reset the method
        }
    }
    public void setPlayerClass(String choice)
    {
        Scanner ix = new Scanner(System.in);
        if(choice.equals("S"))
        {
            playerClass = "Swordsmen";
            healthMulti = 1.5;
            energyMulti = 0.8;
            strengthMulti = 1.6;
            magicMulti = 0.5;
            maxHealth = 550;
            health = maxHealth;
            name += " The Swordsmen";
            classID = 1;
        }
        else if(choice.equals("W"))
        {
            playerClass = "Wizard";
            healthMulti = 0.9;
            energyMulti = 1.2;
            strengthMulti = 0.5;
            magicMulti = 1.7;
            maxHealth = 450;
            health = maxHealth;
            name += " The Wizard";
            classID = 2;
        }
        else if(choice.equals("T"))
        {
            playerClass = "Tank";
            healthMulti = 1.8;
            energyMulti = 1.1;
            strengthMulti = 1.3;
            magicMulti = 0.9;
            maxHealth = 650;
            health = maxHealth;
            name += " The Tank";
            classID = 3;
        }
        else
        {
            effect.Scroll("Invalid choice. Please try again!");
            effect.pauseQuick();
            effect.Scroll("Please choose your class!");
            effect.Scroll("   [S]wordsmen     [W]izard     [T]ank");
            choice = ix.next();
            setPlayerClass(choice); //calls itself to reset the method
        }
    }
    public void levelHealth()//increases player health
    {
        maxHealth += 10 * healthMulti;
    }
    public void levelEnergy()//increases player energy
    {
        maxEnergy += 5 * energyMulti;
    }
    public void levelStrength()//increases player strength
    {
       strength += 2 * strengthMulti;
    }
    public void levelMagic()//increases player magic
    {
       magic += 3 * magicMulti;
    }
    public void randLevel()//randomly increases two stats
    {
        int rand = (int)(Math.random() * 100);
        if(rand < 25)
        {
            effect.Scroll("Maximum health increased by " + (int)(10 * healthMulti) + "!");
            maxHealth += 20 * healthMulti;
        }
        else if(rand < 50)
        {
            effect.Scroll("Maximum energy increased by " + (int)(5 * energyMulti) + "!");
            maxEnergy += 10 * energyMulti;
        }
        else if(rand < 75)
        {
            effect.Scroll("Maximum strength increased by " + (int)(2 *strengthMulti) + "!");
            strength += 2 * strengthMulti;
        }
        else if(rand < 100)
        {
            effect.Scroll("Maximum magic increased by " + (int)(3 * magicMulti) + "!");
            magic += 2 * magicMulti;
        }
    }
    public void EXPGain(int enemyLevel)//increaes the EXP of the player after winning a battle, uses the enemy level to determine the EXP
    {
        EXP += enemyLevel * 10;
        effect.Scroll("EXP gain: " + EXP);
        levelUpCheck(level); //calls the levelUpCheck to check if the EXP gained is enough for a level up
    }
    public void levelUpCheck(int level)//checks if the EXP gained is enough for a level up
    {
        if(EXP - EXPold >= 50 * level) //checks if the difference between the EXP you had before the battle and your EXP now is enough for a level up
        {
            levelUpFirst(); //calls the level up prompt
            EXPold += 50 * level; //brings the oldEXP variable closer to the current EXP variable
            levelUpCheck(level + 1); //calls itself and checks if the player made it to the next level
        }
    }
    public void levelUpFirst()//first level up prompt
    {
        int oldHealth;
        int oldEnergy;
        int oldStrength;
        int oldMagic;
        String choice;
        level++;
        health = maxHealth;
        energy = maxEnergy;
        Scanner ix = new Scanner(System.in);
        effect.Scroll("------------------LEVEL UP------------------");
        randLevel();
        effect.pauseNorm();
        randLevel();
        effect.pauseNorm();
        effect.Scroll("Choose two stats to level up!");
        effect.Scroll("First Pick: [H]ealth, [E]nergy, [S]trength, [M]agic");
        choice = ix.next();
        if(choice.equals("H"))
        {
            oldHealth = maxHealth;
            levelHealth();
            health = maxHealth;
            effect.pauseNorm();
            effect.Scroll("\n" + name + "'s health increased from " + oldHealth + " to " + maxHealth);
            effect.pauseNorm();
        }
        else if(choice.equals("E"))
        {
            oldEnergy = maxEnergy;
            levelEnergy();
            energy = maxEnergy;
            effect.pauseNorm();
            effect.Scroll("\n" + name + "'s energy increased from " + oldEnergy + " to " + maxEnergy);
            effect.pauseNorm();
        }
        else if(choice.equals("S"))
        {
            oldStrength = strength + physicalWeaponStrength;
            levelStrength();
            effect.pauseNorm();
            effect.Scroll("\n" + name + "'s strength increased from " + oldStrength + " to " + (strength + physicalWeaponStrength));
            effect.pauseNorm();
        }
        else if(choice.equals("M"))
        {
            oldMagic = magic + magicWeaponStrength;
            levelMagic();
            effect.pauseNorm();
            effect.Scroll("\n" + name + "'s magic increased from " + oldMagic + " to " + (magic + magicWeaponStrength));
            effect.pauseNorm();
        }
        else
        {
            effect.Scroll("Invalid option. Try again!");
            levelUpFirst();
            return;
        }
        levelUpSecond();
    }
    public void levelUpSecond()//Second level up prompt. The two level up prompts are split so a player can't intentionally type in a wrong letter and repeat the prompt from the beginning.
    {
        int oldHealth;
        int oldEnergy;
        int oldStrength;
        int oldMagic;
        String choice;
        Scanner ix = new Scanner(System.in);
        effect.Scroll("Second Pick: [H]ealth, [E]nergy, [S]trength, [M]agic");
        choice = ix.next();
        if(choice.equals("H"))
        {
            oldHealth = health;
            levelHealth();
            health = maxHealth;
            effect.pauseNorm();
            effect.Scroll("\n" + name + "'s health increased from " + oldHealth + " to " + maxHealth);
            effect.pauseNorm();
        }
        else if(choice.equals("E"))
        {
            oldEnergy = energy;
            levelEnergy();
            energy = maxEnergy;
            effect.pauseNorm();
            effect.Scroll("\n" + name + "'s energy increased from " + oldEnergy + " to " + maxEnergy);
            effect.pauseNorm();
        }
        else if(choice.equals("S"))
        {
            oldStrength = strength + physicalWeaponStrength;
            levelStrength();
            effect.pauseNorm();
            effect.Scroll("\n" + name + "'s strength increased from " + oldStrength + " to " + (strength + physicalWeaponStrength));
            effect.pauseNorm();
        }
        else if(choice.equals("M"))
        {
            oldMagic = magic + magicWeaponStrength;
            levelMagic();
            effect.pauseNorm();
            effect.Scroll("\n" + name + "'s magic increased from " + oldMagic + " to " + (magic + magicWeaponStrength));
            effect.pauseNorm();
        }
        else
        {
            effect.Scroll("Invalid option. Try again!");
            levelUpSecond();
        }
    }
    public void dropCheck(String enemyName)
    {
        int rand = (int)(Math.random() * 100);
        if(rand < 10)
        {
            effect.Scroll("The " + enemyName + " dropped a Un-Weakness Brew!");
            items.add("Un-Weakness Brew");
        }
        else if(rand < 20)
        {
            effect.Scroll("The " + enemyName + " dropped a Vigor Tonic!");
            items.add("Vigor Tonic");
        }
        else if(rand < 22)
        {
            effect.Scroll("The " + enemyName + " dropped a Energy Sword!");
            effect.pauseQuick();
            effect.Scroll("Strength: 75        Current weapon strength: " + physicalWeaponStrength);
            effect.pauseSuperQuick();
            physicalWeaponChange("Energy Sword", 75);
        }
        else if(rand < 24)
        {
            effect.Scroll("The " + enemyName + " dropped a Ivory Staff!");
            effect.pauseQuick();
            effect.Scroll("Strength: 90        Current weapon strength: " + magicWeaponStrength);
            effect.pauseSuperQuick();
            physicalWeaponChange("Ivory Staff", 90);
        }
    }
    public void physicalWeaponChange(String physicalWeapon, int physicalWeaponStrength)
    {
        Scanner ix = new Scanner(System.in);
        String choice;
        int oldStrength = strength + this.physicalWeaponStrength;
        effect.Scroll("Would you like to change weapons? (Y or N)");
        choice = ix.next();
        if(choice.equals("Y"))
        {
            effect.Scroll(name + " equips the " + physicalWeapon + "!"); 
            effect.Scroll(name + "'s strength changed from " + oldStrength + " to " + (strength + physicalWeaponStrength) + "!");
            this.physicalWeapon = physicalWeapon;
            this.physicalWeaponStrength = physicalWeaponStrength;
        }
        else if(choice.equals("N"))
        {
            return;
        }
        else
        {
            effect.Scroll("Invalid option. Please Try again!");
            physicalWeaponChange(physicalWeapon, physicalWeaponStrength);
        }
    }
    public void magicWeaponChange(String magicWeapon, int magicWeaponStrength)
    {
        Scanner ix = new Scanner(System.in);
        String choice;
        int oldMagic = magic + this.magicWeaponStrength;
        effect.Scroll("Would you like to change weapons? (Y or N)");
        choice = ix.next();
        if(choice.equals("Y"))
        {
            effect.Scroll(name + " equips the " + magicWeapon + "!"); 
            effect.Scroll(name + "'s strength changed from " + oldMagic + " to " + (magic + magicWeaponStrength) + "!");
            this.magicWeapon = magicWeapon;
            this.magicWeaponStrength = magicWeaponStrength;
        }
        else if(choice.equals("N"))
        {
            return;
        }
        else
        {
            effect.Scroll("Invalid option. Please Try again!");
            magicWeaponChange(magicWeapon, magicWeaponStrength);
        }
    }
    public void attackPhys()//deal damage using the player's physical weapon. The different types of attacks are almost purely cosmetic, save for one case
    {
        int typeOfAttack = (int)(Math.random() * 100); //creates a random number between 0 and 100
        System.out.print("\n-----------------------------\n");
        if(typeOfAttack < 25)
        {
            effect.Scroll("\n-----------------------------\n" + name + " Slashes blindly with " + gender + " " + physicalWeapon + "!");
        }
        else if(typeOfAttack < 45)
        {
            effect.Scroll(name + " Stabs with " + gender + " " + physicalWeapon + " all " + gender + " force!");
        }
        else if(typeOfAttack < 65)
        {
            effect.Scroll(name + " performs an impressive jump strike with " + gender + " " + physicalWeapon + "!");
        }
        else if(typeOfAttack < 80)
        {
            effect.Scroll(name + " Spins wildly into the enemy with " + gender + " " + physicalWeapon + "!");
        }
        else if(typeOfAttack < 95)
        {
            effect.Scroll(name + " Charges and slices off a limb using " + gender + " " + physicalWeapon + "!");
        }
        else if(typeOfAttack < 100 && !(physicalWeapon == "Fists"))
        {
            effect.Scroll(name + " holds " + physicalWeapon + " by the blade and hammers the enemy!\n" + name + " Takes some damage from this dangerous stunt!");
            health -= 25;
        }
        attackType = "Physical";
        damage = (int)(Math.random() * 100) * (strength + physicalWeaponStrength);
    }
    public void attackMag()//Menu for attacking with magic
    {
        String choice;
        Scanner ix = new Scanner(System.in);
        effect.Scroll("Which spell would you like to cast?");
        effect.pauseQuick();
        System.out.printf("%20s %20s %20s %20s", "[B]lizzard", "[T]hunder", "[H]eal", "[C]ancel\n");
        choice = ix.next();
        if(choice.equals("B"))
        {
            blizzard();
        }
        else if(choice.equals("T"))
        {
            thunder();
        }
        else if(choice.equals("H"))
        {
            heal();
        }
        else if(choice.equals("C"))
        {
            Action();
        }
        else
        {
            effect.Scroll("Invalid option. Please Try again!");
            attackMag();
        }
    }
    public void blizzard()//deal damage using Blizzard
    {
        effect.Scroll(name + " points " + gender + " " + magicWeapon + " towards the enemy and unleashes an icy storm!");
        effect.Blizzard(); //calls the Blizzard method to create an effect
        damage = (int)(Math.random() * 100) * (magic + magicWeaponStrength); //the magic value of the weapon if factored in to determine the damage
        energy -= 8; //decreases the amount of energy the player has
        attackType = "Ice";
    }
    public void thunder()//deal damage using Thunder
    {
        effect.Scroll(name + " holds " + gender + " " + magicWeapon + " skyward and calls down a thunderstorm!");
        effect.Thunder(); //calls the Thunder method to create an effect
        int rand = (int)(Math.random() * 100); //creates a random number to test if the thunderbolt hits
        damage = (int)((Math.random() * 100) * (magic + magicWeaponStrength) * 1.5); //the magic value of the weapon if factored in to determine the damage
        energy -= 10; //decreases the amount of energy the player has
        if(rand < 30) //the thunderbolt has a 30 percent chance to miss
        {
            damage = 0; //sets the damage to zero due to the miss
            effect.Scroll("The thunderbolt missed!");
        }
        if(damage > 0)
        {
            attackType = "Lightning";
        }
    }
    public void heal()//heal using Heal
    {
        effect.Scroll(name + " aims " + gender + " " + magicWeapon + " to " + gender + " chest and lets off a blinding light!");
        effect.Heal(); //calls the Heal method to create an effect
        int heal = (int)(Math.random() * 100 * (magic + magicWeaponStrength) * 1.5); //the magic value of the weapon if factored in to determine the damage
        health += heal; //increases the player's health
        damage = 0; //this is necessary to ensure the last attacks damage isn't used again
        if(health > maxHealth) //check if the heal over heals the player
        {
            health = maxHealth; //if overheal occurs, it brings the current health to the max health
        }
        energy -= 15; //decreases the amount of energy the player has
        effect.Scroll(name + " healed " + heal + "!");
    }
    public void isRunning()
    {
        int rand = (int)(Math.random() * 100);
        effect.Scroll(name + " tries to run away!");
        effect.pauseLong();
        if(rand < 70)
        {
            effect.Scroll("Ran away successfully!");
            running = true;
            effect.pauseNorm();
            effect.Scroll("Returning to the World Map!");
            effect.pauseNorm();
        }
        else
        {
            effect.Scroll("Couldn't run!");
            running = false;
            effect.pauseNorm();
        }
    }
    public void setRunning(boolean state)
    {
        running = state;
    }
    public boolean getRunning()
    {
        return running;
    }
    public void Action()//Main attacking menu
    {
        Scanner ix = new Scanner(System.in);
        String choice;
        attackType = null;
        System.out.print("-----------------------------\n");
        effect.Scroll("\nWhat will " + name + " do?");
        effect.pauseQuick(); //pause for effect
        System.out.printf("\n%10s %10s %10s %10s","[A]ttack", "[M]agic", "[I]tem", "[R]un\n");
        choice = ix.next();
        if(choice.equals("A"))
        {
            attackPhys();
        }
        else if(choice.equals("M"))
        {
            attackMag();
        }
        else if(choice.equals("I"))
        {
            chooseItem();
        }
        else if(choice.equals("R"))
        {
            isRunning();
        }
        else
        {
            effect.Scroll("Invalid option. Try again!");
            Action(); //calls itself to reset the menu
        }
    }
    public int dealDamage()//return damage dealt during this turn
    {
        return damage;
    }
    public void takeDamage(int healthLoss)//take damage and lose health
    {
        if(healthLoss > 0)
        {
            effect.Scroll(name + " loses " + healthLoss + " health!\n");
            health -= healthLoss;
        }
    }
    public String attackType()
    {
        return attackType;
    }
    public void showStats()//display player information
    {
        if(health < 0) //this if statement is used when the player dies, so the final stats doesn't have negative health
        {
            health = 0;
        }
        effect.Scroll("\nPlayer Stats:");
        effect.pauseInstant();
        effect.Scroll("Level: " + level);
        effect.pauseInstant();
        effect.Scroll("Health: " + health + "/" + maxHealth);
        effect.pauseInstant();
        effect.Bar(health, maxHealth);
        effect.pauseInstant();
        effect.Scroll("Energy: " + energy + "/" + maxEnergy);
        effect.pauseInstant();
        effect.Bar(energy, maxEnergy);
        effect.pauseInstant();
        effect.Scroll("Strength: " + (strength + physicalWeaponStrength));
        effect.pauseInstant();
        effect.Scroll("Magic: " + (magic + magicWeaponStrength));
        effect.pauseInstant();
        effect.Scroll("Physical Weapon: " + physicalWeapon);
        effect.pauseInstant();
        effect.Scroll("Magical Weapon: " + magicWeapon);
        effect.pauseInstant();
    }
    public void victory()//display victory text
    {
        effect.Scroll("\nCongratulations! You win!");
        battleComplete++;
    }
    public void areaComplete()
    {
        effect.Scroll("AREA COMPLETED!");
        battleComplete = 1;
        if(currentArea == areaComplete)
        {
            areaComplete++;
        }
    }
    public int areaSelect()
    {
        Scanner ix = new Scanner(System.in);
        int area;
        effect.Map();
        effect.Scroll("Which area would you like to go to?");
        System.out.print("(1): Grassy Plains\t\n");
        currentArea = 1;
        if(areaComplete == 2)
        {
            System.out.print("(2): Dark Forest\t\n");
        }
        else
        {
            System.out.print("(2): LOCKED\t\n");
        }
        effect.pauseSuperQuick();
        if(areaComplete == 3)
        {
            System.out.print("(3): Arid Desert\t\n");
        }
        else
        {
            System.out.print("(3): LOCKED\t\n");
        }
        effect.pauseSuperQuick();
        if(areaComplete == 4)
        {
            System.out.print("(4): Frozen Wastelands\t\n");
        }
        else
        {
            System.out.print("(4): LOCKED\t\n");
        }
        effect.pauseSuperQuick();
        if(areaComplete == 5)
        {
            System.out.print("(5): Rocky Mountainside\t\n");
        }
        else
        {
            System.out.print("(5): LOCKED\t\n");
        }
        effect.pauseSuperQuick();
        if(areaComplete == 6)
        {
            System.out.print("(6): Underwater Palace\n");
        }
        else
        {
            System.out.print("(6): LOCKED\n");
        }
        area = ix.nextInt();
        currentArea = area;
        if(area > areaComplete)
        {
            effect.Scroll("Not a valid choice!");
            area = 1;
            areaSelect();
        }
        return area;
    }
    public void goldGain(int enemyLevel)//increase the amount of gold owned by player
    {
        int goldGained;
        goldGained = (int)(20 + Math.random() * 100) * enemyLevel * 2; //the amount of gold the player earns is determined using the enemy level
        effect.Scroll("Gold Gained: " + goldGained + "\n\n");
        gold += goldGained;
    }
    public void shopItem(String choice)//change the player's items or physical weapon strength or magical weapon strength
    {
        int oldStrength;
        int oldMagic;
        if(choice.equals("U") && gold >= 80) //tests the choice of the player as well as the amount of gold the player has
        {
            items.add("[U]n-Weakness Brew");
            effect.Scroll(name + "puts a Un-Weakness Brew in " + gender + " inventory!");
            inventory();
        }
        else if(choice.equals("V") && gold >= 60)
        {
            items.add("[V]igor Tonic");
            effect.Scroll(name + "puts a Vigor Tonic in " + gender + " inventory!");
            inventory();
        }
        else if(choice.equals("W") && gold >= 100)
        {
            physicalWeapon = "Wooden Sword";
            oldStrength = strength + physicalWeaponStrength;
            physicalWeaponStrength = 10;
            effect.Scroll(name + " equips the " + physicalWeapon + "!"); 
            effect.Scroll(name + "'s strength changed from " + oldStrength + " to " + (strength + physicalWeaponStrength) + "!");
            gold -= 100;
            physicalWeaponID = 1;
        }
        else if(choice.equals("C") && gold >= 350)
        {
            physicalWeapon = "Copper Longsword";
            oldStrength = strength + physicalWeaponStrength;
            physicalWeaponStrength = 20;
            effect.Scroll(name + " equips the " + physicalWeapon + "!"); 
            effect.Scroll(name + "'s strength changed from " + oldStrength + " to " + (strength + physicalWeaponStrength) + "!");
            gold -= 350;
            physicalWeaponID = 2;
        }
        else if(choice.equals("I") && gold >= 600)
        {
            physicalWeapon = "Iron Broadsword";
            oldStrength = strength + physicalWeaponStrength;
            physicalWeaponStrength = 35;
            effect.Scroll(name + " equips the " + physicalWeapon + "!"); 
            effect.Scroll(name + "'s strength changed from " + oldStrength + " to " + (strength + physicalWeaponStrength) + "!");
            gold -= 600;
            physicalWeaponID = 3;
        }
        else if(choice.equals("R") && gold >= 800)
        {
            physicalWeapon = "Razor Sabre";
            oldStrength = strength + physicalWeaponStrength;
            physicalWeaponStrength = 50;
            effect.Scroll(name + " equips the " + physicalWeapon + "!"); 
            effect.Scroll(name + "'s strength changed from " + oldStrength + " to " + (strength + physicalWeaponStrength) + "!");
            gold -= 800;
            physicalWeaponID = 4;
        }
        else if(choice.equals("K") && gold >= 1000)
        {
            physicalWeapon = "Katana";
            oldStrength = strength + physicalWeaponStrength;
            physicalWeaponStrength = 75;
            effect.Scroll(name + " equips the " + physicalWeapon + "!"); 
            effect.Scroll(name + "'s strength changed from " + oldStrength + " to " + (strength + physicalWeaponStrength) + "!");
            gold -= 1000;
            physicalWeaponID = 5;
        }
        else if(choice.equals("E") && gold >= 5000)
        {
            physicalWeapon = "Excalibur";
            oldStrength = strength + physicalWeaponStrength;
            physicalWeaponStrength = 250;
            effect.Scroll(name + " equips " + physicalWeapon + "!"); 
            effect.Scroll(name + "'s strength changed from " + oldStrength + " to " + (strength + physicalWeaponStrength) + "!");
            gold -= 5000;
            physicalWeaponID = 6;
        }
        else if(choice.equals("P") && gold >= 100)
        {
            magicWeapon = "Plastic Stick";
            oldMagic = magic + magicWeaponStrength;
            magicWeaponStrength = 10;
            effect.Scroll(name + " equips the " + magicWeapon + "!"); 
            effect.Scroll(name + "'s magic changed from " + oldMagic + " to " + (magic + magicWeaponStrength) + "!");
            gold -= 100;
            magicWeaponID = 1;
        }
        else if(choice.equals("M") && gold >= 300)
        {
            magicWeapon = "Magician's Wand";
            oldMagic = magic + magicWeaponStrength;
            magicWeaponStrength = 25;
            effect.Scroll(name + " equips the " + magicWeapon + "!"); 
            effect.Scroll(name + "'s magic changed from " + oldMagic + " to " + (magic + magicWeaponStrength) + "!");
            gold -= 300;
            magicWeaponID = 2;
        }
        else if(choice.equals("G") && gold >= 550)
        {
            magicWeapon = "Golden Scepter";
            oldMagic = magic + magicWeaponStrength;
            magicWeaponStrength = 40;
            effect.Scroll(name + " equips the " + magicWeapon + "!"); 
            effect.Scroll(name + "'s magic changed from " + oldMagic + " to " + (magic + magicWeaponStrength) + "!");
            gold -= 550;
            magicWeaponID = 3;
        }
        else if(choice.equals("T") && gold >= 700)
        {
            magicWeapon = "Titanium Staff";
            oldMagic = magic + magicWeaponStrength;
            magicWeaponStrength = 65;
            effect.Scroll(name + " equips the " + magicWeapon + "!"); 
            effect.Scroll(name + "'s magic changed from " + oldMagic + " to " + (magic + magicWeaponStrength) + "!");
            gold -= 700;
            magicWeaponID = 4;
        }
        else if(choice.equals("H") && gold >= 950)
        {
            magicWeapon = "Holographic Rod";
            oldMagic = magic + magicWeaponStrength;
            magicWeaponStrength = 85;
            effect.Scroll(name + " equips the " + magicWeapon + "!"); 
            effect.Scroll(name + "'s magic changed from " + oldMagic + " to " + (magic + magicWeaponStrength) + "!");
            gold -= 950;
            magicWeaponID = 5;
        }
        else if(choice.equals("S") && gold >= 6000)
        {
            magicWeapon = "Strange Twig";
            oldMagic = magic + magicWeaponStrength;
            magicWeaponStrength = 200;
            effect.Scroll(name + " equips the " + magicWeapon + "!"); 
            effect.Scroll(name + "'s magic changed from " + oldMagic + " to " + (magic + magicWeaponStrength) + "!");
            gold -= 6000;
            magicWeaponID = 6;
        }
        else if(choice.equals("F") && gold >= 1000)
        {
            items.add("[F]eather of Resurrection");
            numRevive++;
            effect.Scroll(name + " puts a Feather of Resurrection in " + gender + " inventory!");
            gold -= 1000;
            inventory();
        }
        else if(choice.equals("N"))
        {
            effect.Scroll("Returning to the battle!");
        }
        else
        {
            effect.Scroll("Sorry " + name + ", I can't give credit. Come back when you're a little MMMM, richer!");
        }
    }
    public void chooseItem()//menu for inventory for items
    {
        Scanner ix = new Scanner(System.in);
        String choice;
        damage = 0;
        inventory();
        effect.Scroll("Which Item would you like to use?\n");
        System.out.printf("%10s", "[N]one\n");
        choice = ix.next();
        if(choice.equals("U") && Collections.frequency(items, "[U]n-Weakness Brew") > 0) //uses an Unweak potion, provided the player has one
        {
            items.remove("[U]n-Weakness Brew");
            health += 200;
        }
        else if(choice.equals("V") && Collections.frequency(items, "[V]igor Tonic") > 0) //uses an Vigor potion, provided the player has one
        {
            items.remove("[V]igor Tonic");
            energy += 50;
        }
        else if(choice.equals("F") && Collections.frequency(items, "[F]eather of Resurrection") > 0) //uses an Feather, provided the player has one
        {
            items.remove("[F]eather of Resurrection");
            health += 500;
        }
        else if(choice.equals("N"))
        {
            Action(); //returns to the main Action method
        }
        else
        {
            effect.Scroll("Invalid choice. Please try again!");
            chooseItem();
        }
        
        if(health > maxHealth) //if a healing item over healed, this statment will bring the player's health back down
        {
            health = maxHealth;
        }
    }
    public void inventory() //displays the inventory
    {
        if(items.size() > 0)
        {
             effect.Scroll("\n-----------------------------\nInventory:\n");
             for(int i = 0; i < items.size(); i++)
             {
                 effect.Scroll(items.get(i));            
             }
        }
        else
        {
            System.out.println("You have no items in your inventory!");
        }
        System.out.println();
    }
    public void revive()
    {
        effect.Scroll(name + " recieves a fatal blow!");
        effect.pauseLong();
        if(Collections.frequency(items, "[F]eather of Resurrection") > 0) //revive the player if they have a feather
        {
            effect.Scroll("Huh?");
            effect.pauseNorm();
            effect.Scroll(name + "'s Feather of Resurrection glows brightly!");
            effect.pauseQuick();
            effect.Revive();
            effect.pauseQuick();
            effect.Scroll(name + " was revived!");
            items.remove("[F]eather of Resurrection");
            health = maxHealth;
            return;
        }
        death();
    }
    public void death()//displays text when health = 0, and exits the game
    {
        effect.Dead(name); //calls the Dead method to create an effect
        effect.Scroll("You died! Get better and come back!");
        effect.Scroll("Final Stats\n");
        showStats();
        effect.Scroll("EXP: " + EXP);
        effect.pauseInstant();
        effect.Scroll("Gold: " + gold);
        effect.pauseInstant();
        System.exit(0); //exits the program
    }
    public void generatePassword(String choice) throws FileNotFoundException
    {
        if (choice.equals("Y"))
        {
            Password = name.substring(0, name.indexOf(" ")) + "~" + health * 42 + "~" + energy * 36 + "~" + strength * 64 + "~" + EXP * 11 + "~" + magic * 32 + "~" + level * 990 + "~" + gold / 1000 + "~" + maxHealth * 55 + "~" + maxEnergy * 22 + "~" + numHealthPot * 25 + "~" + numEnergyPot + "~" + numRevive * 2 + "~" + physicalWeaponID + "~" + magicWeaponID + "~" + areaComplete * 200 +  "~" + classID +  "~" + gender + "~";
            effect.Scroll("Your password is: \n\n" + Password);
            //save.delete();
            File save = new File("C:/Users/Ahmed/Desktop/Ahmed's Folder/APCS Course Files/SimpleRPG/Saves/save.txt");
            PrintWriter out = new PrintWriter("save.txt");
            out.println(Password);
            out.close();
            effect.Scroll("Game saved successfully!");
        }
        else if(choice.equals("N"))
        {
            return;
        }
        else
        {
            effect.Scroll("Invalid response! Please try again!");
            effect.Scroll("Would you like to visit the shop? (Y/N)");
        }
    }
    public void passwordMenu() throws FileNotFoundException
    {
        String password = "";
        File save = new File("C:/Users/Ahmed/Desktop/Ahmed's Folder/APCS Course Files/SimpleRPG/save.txt");
        int sectionNew;
        int error = 0;
        effect.Scroll("Loading your save file...");
        Scanner ix = new Scanner(save);
        password = ix.nextLine();
        
        sectionNew = password.indexOf("~");
        setPlayerName(password.substring(0, sectionNew));
        password = password.substring(sectionNew + 1, password.length());
        
        sectionNew = password.indexOf("~");
        setPlayerHealth(Integer.parseInt(password.substring(0, sectionNew)) / 42);
        if(Integer.parseInt(password.substring(0, sectionNew)) / 42 % 1 != 0)
        {
            error++;
        }
        password = password.substring(sectionNew + 1, password.length());
        
        sectionNew = password.indexOf("~");
        setPlayerEnergy(Integer.parseInt(password.substring(0, sectionNew)) / 36);
        if(Integer.parseInt(password.substring(0, sectionNew)) / 36 % 1 != 0)
        {
            error++;
        }
        password = password.substring(sectionNew + 1, password.length());
        
        sectionNew = password.indexOf("~");
        setPlayerStrength(Integer.parseInt(password.substring(0, sectionNew)) / 64);
        if(Integer.parseInt(password.substring(0, sectionNew)) / 64 % 1 != 0)
        {
            error++;
        }
        password = password.substring(sectionNew + 1, password.length());
        
        
        sectionNew = password.indexOf("~");
        setPlayerEXP(Integer.parseInt(password.substring(0, sectionNew)) / 11);
        if(Integer.parseInt(password.substring(0, sectionNew)) / 11 % 1 != 0)
        {
            error++;
        }
        password = password.substring(sectionNew + 1, password.length());
        
        
        sectionNew = password.indexOf("~");
        setPlayerMagic(Integer.parseInt(password.substring(0, sectionNew)) / 32);
        if(Integer.parseInt(password.substring(0, sectionNew)) / 32 % 1 != 0)
        {
            error++;
        }
        password = password.substring(sectionNew + 1, password.length());
        
        
        sectionNew = password.indexOf("~");
        setPlayerLevel(Integer.parseInt(password.substring(0, sectionNew)) / 990);
        if(Integer.parseInt(password.substring(0, sectionNew)) / 990 % 1 != 0)
        {
            error++;
        }
        password = password.substring(sectionNew + 1, password.length());
        
        sectionNew = password.indexOf("~");
        setPlayerGold(Integer.parseInt(password.substring(0, sectionNew)) * 1000);
        if(Integer.parseInt(password.substring(0, sectionNew)) * 1000 % 1 != 0)
        {
            error++;
        }
        password = password.substring(sectionNew + 1, password.length());
        
        
        sectionNew = password.indexOf("~");
        setPlayerMaxHealth(Integer.parseInt(password.substring(0, sectionNew)) / 55);
        if(Integer.parseInt(password.substring(0, sectionNew)) / 55 % 1 != 0)
        {
            error++;
        }
        password = password.substring(sectionNew + 1, password.length());
        
        
        sectionNew = password.indexOf("~");
        setPlayerMaxEnergy(Integer.parseInt(password.substring(0, sectionNew)) / 22);
        if(Integer.parseInt(password.substring(0, sectionNew)) / 22 % 1 != 0)
        {
            error++;
        }
        password = password.substring(sectionNew + 1, password.length());
        
        
        sectionNew = password.indexOf("~");
        setPlayerNumHealthPot(Integer.parseInt(password.substring(0, sectionNew)) / 25);
        if(Integer.parseInt(password.substring(0, sectionNew)) / 25 % 1 != 0)
        {
            error++;
        }
        password = password.substring(sectionNew + 1, password.length());
        
        
        sectionNew = password.indexOf("~");
        setPlayerNumEnergyPot(Integer.parseInt(password.substring(0, sectionNew)));
        if(Integer.parseInt(password.substring(0, sectionNew)) % 1 != 0)
        {
            error++;
        }
        password = password.substring(sectionNew + 1, password.length());
        
        
        sectionNew = password.indexOf("~");
        setPlayerNumRevive(Integer.parseInt(password.substring(0, sectionNew)) / 2);
        if(Integer.parseInt(password.substring(0, sectionNew)) / 2 % 1 != 0)
        {
            error++;
        }
        password = password.substring(sectionNew + 1, password.length());
        
        
        sectionNew = password.indexOf("~");
        setPlayerPhysicalWeapon(Integer.parseInt(password.substring(0, sectionNew)));
        password = password.substring(sectionNew + 1, password.length());
        
        sectionNew = password.indexOf("~");
        setPlayerMagicWeapon(Integer.parseInt(password.substring(0, sectionNew)));
        password = password.substring(sectionNew + 1, password.length());
        
        sectionNew = password.indexOf("~");
        setPlayerAreaComplete(Integer.parseInt(password.substring(0, sectionNew)) / 200);
        if(Integer.parseInt(password.substring(0, sectionNew)) / 200 % 1 != 0)
        {
            error++;
        }
        password = password.substring(sectionNew + 1, password.length());
        
        sectionNew = password.indexOf("~");
        setPlayerClassPass(Integer.parseInt(password.substring(0, sectionNew)));
        password = password.substring(sectionNew + 1, password.length());
        
        sectionNew = password.indexOf("~");
        setPlayerGenderPass(password.substring(0, sectionNew));
        password = password.substring(sectionNew + 1, password.length());
        
        if(error != 0)
        {
            effect.Scroll("Invalid password! Please try again!");
            error = 0;
            passwordMenu();
        }
    }
}
