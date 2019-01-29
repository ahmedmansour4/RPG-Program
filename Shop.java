import java.util.Scanner;
/**
 * This class acts as the 'shop' of the game.
 * 
 * @author Ahmed Mansour
 * @version 8/3/17
 */
public class Shop
{
    public String welcome(String choice)//shop menu
    {
        Scanner in = new Scanner(System.in);
        Effects effect = new Effects();
        String shopChoice;
        if(choice.equals("Y"))
        {
        System.out.println("Welcome to the shop! What will you buy?\n");
        effect.pauseNorm();
        System.out.println("[U]n-Weakness Brew(80)  [V]igor Tonic(60)");
        effect.pauseSuperQuick();
        System.out.println("[W]ooden Sword(100)     [P]lastic Stick(100)");
        effect.pauseSuperQuick();
        System.out.println("[C]opper Longsword(350) [M]agican's Wand(300)");
        effect.pauseSuperQuick();
        System.out.println("[I]ron Broadsword(600)  [G]olden Scepter(550)");
        effect.pauseSuperQuick();
        System.out.println("[R]azor Sabre(800)      [T]itanium Staff(700");
        effect.pauseSuperQuick();
        System.out.println("[K]atana(1000)          [H]olographic Rod(950)");
        effect.pauseSuperQuick();
        System.out.println("[E]xcalibur(5000)       [S]trange Twig(6000)");
        effect.pauseSuperQuick();
        System.out.println("        [F]eather of Resurrection(1000)");
        effect.pauseSuperQuick();
        System.out.println("                 [N]one                     ");
        return in.next();
        }
        else if(choice.equals("N"))
        {
        return "N";
        }
        else
        {
        effect.Scroll("Invalid choice. Try again!");
        effect.Scroll("Would you like to visit the shop? (Y/N)");
        shopChoice = in.next();
        welcome(shopChoice);
       }
       return "N";
    }
}
