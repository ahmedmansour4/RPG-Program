import java.util.Scanner;
import java.util.*;
/**
 * This is the main class, where all the action happens. 
 * 
 * @author Ahmed Mansour
 * @version 8/3/17
 */
public class Game
{
  static final String newline = System.getProperty("line.separator");
    public static void main(String[] args)
    {
    String choice; //where choices of the player are stored
    String shopChoice = "Y"; //choice of the player in the shop
    String yesOrNo = "Y"; //decides if the player will continue shopping at store
    int area;
    char c;
    ArrayList<String> items = new ArrayList<String>(); //dummy ArrayList so player object can initialize
    Scanner in = new Scanner(System.in); //Scanner object to accept player input
    Player player = new Player(null, 500, 100, 10, 100, 10, 1, 0, 500, 100, items, 0, 0, "Fists", "Tree Branch", 5, 5, "null", "null"); //The player object
    Enemy enemy = new Enemy(null, 0, 0, 0, 0, 0); //the enemy object, will be given values at the start of every battle
    Shop shop = new Shop(); //shop object to interact with the shop
    Effects effect = new Effects(); //effects object to create special print outs
    System.out.println("");
    effect.Title(); //calls the Title method in the Effect class to print out the title
    effect.pauseAttack(); //pause for effect
    effect.pressToContinue(); //calls the pressEnterToContinue method in the Effect class to tell the player to press Enter
    choice = in.next();
    if(choice.equals("L"))
    {
        try 
        {
            player.passwordMenu();
        }
        catch (Exception e)
        {
        }
    }
    else
    {
        effect.Scroll("Please choose your player name");
        choice = in.next(); //stores the player name
        player.setPlayerName(choice); //calls the setPlayerName method in the Player class to set the player name to the words in the variable choice
        effect.Scroll("Please choose your player gender ([M]ale or [F]emale)");
        choice = in.next(); //stores the letter corresponding to the player's gender
        player.setPlayerGender(choice); //calls the setPlayerGender method in the Player class with the letter in the variable choice
        effect.Scroll("Please choose your class!");
        effect.pauseQuick();
        effect.Scroll("   [S]wordsmen     [W]izard     [T]ank");
        choice = in.next(); //stores the letter corresponding to the player's chosen class
        player.setPlayerClass(choice); //calls the setPlayerClass method in the Player class with the letter in the variable choice
        effect.Scroll("Fight your way to the prize! Good Luck!\n\n\n");
    }
    effect.pauseNorm(); //pause for effect
        while(player.getPlayerHealth() > 0) //will continue to loop as long as the player isn't dead
        {
        player.setRunning(false);
        area = player.areaSelect();
            while(player.getBattleComplete() <= 5)
            {
               enemy.setLevel(area); //sets the level of the enemy using the level of the area as a basis
               enemy.Boss(player.getBattleComplete(), area); //checks if the player is at stage 5, and if so changes the enemy level
               effect.StageProgression(player.getBattleComplete());
               enemy.Encounter(); //calls the Encounter method
               effect.pauseNorm(); //pause for effect
               while(!enemy.isDead()) //will continue to loop as long as the enemy isn't dead (this is the battle turns loop)
               {
                     player.showStats(); //displays the player stats
                     enemy.showStats(); //displays the enemy stats
                     player.Action(); //calls the Action method, giving the player battle options
                     if(player.getRunning())
                     {
                         enemy.run();
                         break;
                     }
                     effect.pauseAttack(); //pause for effect
                     enemy.takeDamage(player.dealDamage(), player.attackType()); //enemy takes damage
                     effect.pauseAttack(); //pause for effect}                     
                     if(!enemy.isDead()) //checks if the enemy isn't dead in order to let it attack. If this statement wasn't here the enemy would attack even if it's dead
                     {
                         enemy.Action(); //calls the Action method, creating a damage value for the enemy to attack with
                         effect.pauseAttack(); //pause for effect
                         player.takeDamage(enemy.dealDamage()); //player takes damage
                         effect.pauseAttack(); //pause for effect
                     }
                     if(player.getPlayerHealth() <= 0) //checks if the player is dead from the enemy's attack
                     {
                         player.revive(); //calls the revive method
                     } 
               }
               if(!player.getRunning())
               {
                   enemy.death(); //calls the death method
                   player.victory(); //calls the victory method
                   player.dropCheck(enemy.getName());
                   effect.pauseAttack(); //pause for effect
                   //player.EXPGain(enemy.getLevel()); //calls the EXPGain method and uses the enemy level as a basis for how much EXP the player gains
                   player.goldGain(enemy.getLevel()); //calls the goldGain method and uses the enemy level as a basis for how much gold the player gains
                   effect.pauseAttack(); //pause for effect
                   if(player.getBattleComplete() > 5)
                   {
                       player.areaComplete();
                       effect.Scroll("Would you like to generate a password? (Y/N)");
                       try
                       {
                           player.generatePassword(in.next());
                       }
                       catch (Exception e)
                       { 
                       }
                       effect.Scroll("Would you like to visit the shop? (Y/N)");
                       effect.Scroll("You have: " + player.getPlayerGold() + " gold");
                       shopChoice = shop.welcome(in.next()); //calls the welcome method and uses a input String, and also stores the return value to shopChocie
                       effect.pauseAttack(); //pause for effect
                       player.shopItem(shopChoice); //calls the shopItem method using the shopChoice String
                       while(yesOrNo.equals("Y") && !(shopChoice.equals("N"))) //loop will allow the player to repeatedly buy things from the shop
                       {
                             effect.Scroll("Would you like to continue shopping? (Y/N)");
                             yesOrNo = in.next();
                             if(yesOrNo.equals("Y"))
                             {
                                 effect.Scroll("You have: " + player.getPlayerGold() + " gold");
                                 shopChoice = shop.welcome(yesOrNo);
                                 effect.pauseAttack();
                                 player.shopItem(shopChoice);
                             }
                       }
                       break;
                   }
               }
               else
               {
                   break;
                }
        }
    }
        in.close();
  }
}
