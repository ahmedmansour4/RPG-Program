/**
 * This class holds special methods that make the experience of playing this game much more enjoyable.
 * 
 * @author Ahmed Mansour
 * @version 8/3/17
 */

public class Effects
{
    public void pauseAttack() //pause the program. Note the number in the method is the milliseconds paused
    {
        try {
            Thread.sleep(1200); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void pauseNorm()
    {
        try {
            Thread.sleep(1000); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void pauseQuick()
    {
        try {
            Thread.sleep(300); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void pauseSuperQuick()
    {
        try {
            Thread.sleep(50); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void pauseScroll()
    {
        try {
            Thread.sleep(10); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void pauseInstant()
    {
        try {
            Thread.sleep(5); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void pauseLong()
    {
        try {
            Thread.sleep(2100); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void Title() //displays the title of the game
    {
        System.out.println(""); 
        pauseLong();
        System.out.println("                                                       -------------------------------------------------------------------------");
        pauseSuperQuick();
        System.out.println("                                                       |               ____     ______   ___     ____     __   __  __          |");  
        pauseSuperQuick();
        System.out.println("                                                       |              / __ \\   / ____/  /   |   / __ \\   / /   \\ \\/ /          |");     
        pauseSuperQuick();
        System.out.println("-------------------------------------------------------|             / / / /  / __/    / /| |  / / / /  / /     \\  /           |-------------------------------------------------------");           
        pauseSuperQuick();
        System.out.println("                                                       |            / /_/ /  / /___   / ___ | / /_/ /  / /___   / /            |");  
        pauseSuperQuick();
        System.out.println("                                                       |           /_____/  /_____/  /_/  |_|/_____/  /_____/  /_/             |"); 
        pauseSuperQuick();
        System.out.println("                                                       |                                                                       |");  
        pauseSuperQuick();
        System.out.println("-------------------------------------------------------|     _____   __  __    ____  _    __    ____ _    __    ___     __     |-------------------------------------------------------");
        pauseSuperQuick();
        System.out.println("                                                       |    / ___/  / / / /   / __ \\| |  / /   /  _/| |  / /   /   |   / /     |");
        pauseSuperQuick();
        System.out.println("                                                       |    \\__ \\  / / / /   / /_/ /| | / /    / /  | | / /   / /| |  / /      |");
        pauseSuperQuick();
        System.out.println("                                                       |   ___/ / / /_/ /   / _, _/ | |/ /   _/ /   | |/ /   / ___ | / /___    |");
        pauseSuperQuick();
        System.out.println("-------------------------------------------------------|  /____/  \\____/   /_/ |_|  |___/   /___/   |___/   /_/  |_|/_____/    |-------------------------------------------------------");
        pauseSuperQuick();
        System.out.println("                                                       |                                                                       |");
        pauseSuperQuick();
        System.out.println("                                                       -------------------------------------------------------------------------");
        pauseSuperQuick();
    }
    public void Bar(int number, int maxNumber) //takes a value (such a health), and the max of that number, and converts it into a visual element
    {
        number = (int)(number / 40);
        maxNumber = (int)(maxNumber / 40);
        for(int i = 0; i < maxNumber; i++)
        {
            System.out.print("_");
        }
        System.out.print("_\n|");
        for(int i = 0; i < number; i++)
        {
            System.out.print("¦");
            //pauseInstant();
        }
        for(int i = 0; i < maxNumber - number; i++)
        {
            System.out.print(" ");
        }
        System.out.println("|");
        for(int i = 0; i < maxNumber; i++)
        {
            System.out.print("¯");
        }
        System.out.print("¯\n");
    }
    public void Blizzard() //Blizzard effect
    {
        pauseNorm();
        for(int i = 0; i < 4; i++)
        {         
            pauseSuperQuick();
            System.out.println("                               .      .    .");
            System.out.println("                                  _\\/  \\/_ ");   
            System.out.println("                                   _\\/\\/_    "); 
            System.out.println("                               _\\_\\_\\/\\/_/_/_ ");
            System.out.println("                                / /_/\\/\\_\\ \\  ");
            System.out.println("                                   _/\\/\\_     ");
            System.out.println("                                   /\\  /\\     ");
            System.out.println("                                  '      '    ");
            pauseSuperQuick();
            System.out.println("                        .      .    .");
            System.out.println("                           _\\/  \\/_ ");   
            System.out.println("                            _\\/\\/_    "); 
            System.out.println("                        _\\_\\_\\/\\/_/_/_ ");
            System.out.println("                         / /_/\\/\\_\\ \\  ");
            System.out.println("                            _/\\/\\_     ");
            System.out.println("                            /\\  /\\     ");
            System.out.println("                           '      '    ");
            pauseSuperQuick();
            System.out.println("                  .      .    .");
            System.out.println("                     _\\/  \\/_ ");   
            System.out.println("                      _\\/\\/_    "); 
            System.out.println("                  _\\_\\_\\/\\/_/_/_ ");
            System.out.println("                   / /_/\\/\\_\\ \\  ");
            System.out.println("                      _/\\/\\_     ");
            System.out.println("                      /\\  /\\     ");
            System.out.println("                     '      '    ");
            pauseSuperQuick();
            System.out.println("                        .      .    .");
            System.out.println("                           _\\/  \\/_ ");   
            System.out.println("                            _\\/\\/_    "); 
            System.out.println("                        _\\_\\_\\/\\/_/_/_ ");
            System.out.println("                         / /_/\\/\\_\\ \\  ");
            System.out.println("                            _/\\/\\_     ");
            System.out.println("                            /\\  /\\     ");
            System.out.println("                           '      '    ");
        }
    }
    public void Thunder() //Thunder effect
    {
        pauseNorm();
        System.out.println("                      .-~~~-.                                      .-~~~-.");
        System.out.println("              .- ~ ~-(       )_ _                          .- ~ ~-(       )_ _    ");    
        System.out.println("             /                    ~ -.                    /                    ~ -.      ");     
        System.out.println("            |                          ',                 |                          ',   ");      
        System.out.println("             \\                         .'                 \\                         .'   ");
        System.out.println("               ~- ._ ,. ,.,.,., ,.. -~                      ~- ._ ,. ,.,.,., ,.. -~     ");  
        pauseAttack();
        for(int i = 0; i < 6; i++)
        {
            System.out.println("                        |                                          /");
            pauseInstant();
            System.out.println("                       /                                           \\");
            pauseInstant();
            System.out.println("                       |                                           |");
            pauseInstant();
            System.out.println("                       \\                                          /");
            pauseInstant();
        }
        pauseInstant();
        System.out.println("              \\         .  .      /                         \\         .  .       /");
        System.out.println("             \\   .:\";'.:..\"   /                          \\   .:\";'.:..\"   /                    ");
        System.out.println("                  (M^^.^~~:.'\").                              (M^^.^~~:.'\").            ");
        System.out.println("               -(/  .    . . \\ \\)  -                       -(/  .    . . \\ \\)  -                  ");
        System.out.println("               ((| :. ~ ^  :. .|))                           ((| :. ~ ^  :. .|))                   ");
        System.out.println("               -(\\- |  \\ /  |  /)  -                       ((| :. ~ ^  :. .|))                    ");
        System.out.println("                -\\  \\     /  /-                             -\\  \\     /  /-              ");
        System.out.println("                  \\  \\   /  /                                 \\  \\   /  /           ");
        System.out.println("______________________________________________________________________________________________________________________");
    }    
    public void Heal() //Heal effect
    {
        pauseNorm();
        for(int i = 0; i < 3; i++)
        {
            System.out.println("    _                        _                        _                ");
            pauseSuperQuick();
            System.out.println("  _| |_                    _| |_                    _| |_                      ");
            pauseSuperQuick();
            System.out.println(" |_   _|                  |_   _|                  |_   _|                ");
            pauseSuperQuick();
            System.out.println("   |_|                      |_|                      |_|              ");
            pauseSuperQuick();
            System.out.println("                _                         _                                        ");
            pauseSuperQuick();
            System.out.println("              _| |_                     _| |_                                         ");
            pauseSuperQuick();
            System.out.println("             |_   _|                   |_   _|                                          ");
            pauseSuperQuick();
            System.out.println("               |_|                       |_|                                          ");
            pauseSuperQuick();
        }
    }
    public void Fire()
    {
        pauseNorm();
        for(int i = 0; i < 10; i++)
        {
            System.out.println("   )");
            System.out.println("  ) \\");
            System.out.println(" / ) (");
            System.out.println(" \\(_)/");
        }
    }
    public void StageProgression(int stage)
    {
        for(int i = 0; i < 16; i++)
        {
            System.out.println();
            pauseSuperQuick();
        }
        Stage(stage);
        if(stage == 1)
        {
            System.out.println("\t\t\t\t\t\t         _              _              _              _              _");
            System.out.println("\t\t\t\t\t\t      <| ● |---------|    |---------|    |---------|    |---------|    |>");
            System.out.println("\t\t\t\t\t\t         ¯              ¯              ¯              ¯              ¯");
        }
        else if(stage == 2)
        {
            System.out.println("\t\t\t\t\t\t         _               _               _              _              _");
            System.out.println("\t\t\t\t\t\t      <|    |---------|  ●  |---------|    |---------|    |---------|    |>");
            System.out.println("\t\t\t\t\t\t         ¯               ¯               ¯              ¯              ¯");
        }
        else if(stage == 3)
        {
            System.out.println("\t\t\t\t\t\t          _               _               _               _              _");
            System.out.println("\t\t\t\t\t\t      <|     |---------|     |---------|  ●  |---------|    |---------|    |>");
            System.out.println("\t\t\t\t\t\t          ¯               ¯               ¯               ¯              ¯");
        }
        else if(stage == 4)
        {
            System.out.println("\t\t\t\t\t\t          _               _               _               _               _");
            System.out.println("\t\t\t\t\t\t      <|     |---------|     |---------|     |---------|  ●  |---------|    |>");
            System.out.println("\t\t\t\t\t\t          ¯               ¯               ¯               ¯               ¯");
        }
        else
        {
            System.out.println("\t\t\t\t\t\t          _               _               _               _               _");
            System.out.println("\t\t\t\t\t\t      <|     |---------|     |---------|     |---------|     |---------|  ●  |>");
            System.out.println("\t\t\t\t\t\t          ¯               ¯               ¯               ¯               ¯");
            pauseNorm();
            System.out.println("\n\t\t\t\t\t\t\t  ____   ___  ____ ____    ___ _   _  ____ ___  __  __ ___ _   _  ____ ");
            System.out.println("\t\t\t\t\t\t\t | __ ) / _ \\/ ___/ ___|  |_ _| \\ | |/ ___/ _ \\|  \\/  |_ _| \\ | |/ ___|");
            System.out.println("\t\t\t\t\t\t\t |  _ \\| | | \\___ \\___ \\   | ||  \\| | |  | | | | |\\/| || ||  \\| | |  _ ");
            System.out.println("\t\t\t\t\t\t\t | |_) | |_| |___) |__) |  | || |\\  | |__| |_| | |  | || || |\\  | |_| |");
            System.out.println("\t\t\t\t\t\t\t |____/ \\___/|____/____/  |___|_| \\_|\\____\\___/|_|  |_|___|_| \\_|\\____|");
                                                                       

        }
        pauseLong();
    }
    public void Stage(int stage)
    {
        pauseQuick();
        System.out.println("\t\t\t\t\t\t\t\t_______  _______  _______  _______  _______ ");
        pauseSuperQuick();
        System.out.println("\t\t\t\t\t\t\t\t|       ||       ||   _   ||       ||       |");
        pauseSuperQuick();
        System.out.println("\t\t\t\t\t\t\t\t|  _____||_     _||  |_|  ||    ___||    ___|");
        pauseSuperQuick();
        System.out.println("\t\t\t\t\t\t\t\t| |_____   |   |  |       ||   | __ |   |___ ");
        pauseSuperQuick();
        System.out.println("\t\t\t\t\t\t\t\t|_____  |  |   |  |       ||   ||  ||    ___|");
        pauseSuperQuick();
        System.out.println("\t\t\t\t\t\t\t\t _____| |  |   |  |   _   ||   |_| ||   |___ ");
        pauseSuperQuick();
        System.out.println("\t\t\t\t\t\t\t\t|_______|  |___|  |__| |__||_______||_______|  "); 
        pauseNorm();
        if(stage == 1)
        {
            System.out.println("\t\t\t\t\t\t\t\t\t\t     ____  ");
            System.out.println("\t\t\t\t\t\t\t\t\t\t    |    | ");
            System.out.println("\t\t\t\t\t\t\t\t\t\t     |   | ");
            System.out.println("\t\t\t\t\t\t\t\t\t\t     |   | ");
            System.out.println("\t\t\t\t\t\t\t\t\t\t     |   | ");
            System.out.println("\t\t\t\t\t\t\t\t\t\t     |   | ");
            System.out.println("\t\t\t\t\t\t\t\t\t\t     |___| ");
        }
        else if(stage == 2)
        {
            System.out.println("\t\t\t\t\t\t\t\t\t\t     _______ ");
            System.out.println("\t\t\t\t\t\t\t\t\t\t    |       |");
            System.out.println("\t\t\t\t\t\t\t\t\t\t    |____   |");
            System.out.println("\t\t\t\t\t\t\t\t\t\t     ____|  |");
            System.out.println("\t\t\t\t\t\t\t\t\t\t    | ______|");
            System.out.println("\t\t\t\t\t\t\t\t\t\t    | |_____ ");
            System.out.println("\t\t\t\t\t\t\t\t\t\t    |_______|");
        }
        else if(stage == 3)
        {
            System.out.println("\t\t\t\t\t\t\t\t\t\t     _______ ");
            System.out.println("\t\t\t\t\t\t\t\t\t\t    |       |");
            System.out.println("\t\t\t\t\t\t\t\t\t\t    |___    |");
            System.out.println("\t\t\t\t\t\t\t\t\t\t     ___|   |");
            System.out.println("\t\t\t\t\t\t\t\t\t\t    |___    |");
            System.out.println("\t\t\t\t\t\t\t\t\t\t     ___|   |");
            System.out.println("\t\t\t\t\t\t\t\t\t\t    |_______|");
        }
        else if(stage == 4)
        {
            System.out.println("\t\t\t\t\t\t\t\t\t\t     _   ___ ");
            System.out.println("\t\t\t\t\t\t\t\t\t\t    | | |   |");
            System.out.println("\t\t\t\t\t\t\t\t\t\t    | |_|   |");
            System.out.println("\t\t\t\t\t\t\t\t\t\t    |       |");
            System.out.println("\t\t\t\t\t\t\t\t\t\t    |___    |");
            System.out.println("\t\t\t\t\t\t\t\t\t\t        |   |");
            System.out.println("\t\t\t\t\t\t\t\t\t\t        |___|");
        }
        else
        {
            System.out.println("\t\t\t\t\t\t\t\t\t\t     _______ ");
            System.out.println("\t\t\t\t\t\t\t\t\t\t    |       |");
            System.out.println("\t\t\t\t\t\t\t\t\t\t    |   ____|");
            System.out.println("\t\t\t\t\t\t\t\t\t\t    |  |____ ");
            System.out.println("\t\t\t\t\t\t\t\t\t\t    |_____  |");
            System.out.println("\t\t\t\t\t\t\t\t\t\t     _____| |");
            System.out.println("\t\t\t\t\t\t\t\t\t\t    |_______|");
        }
        pauseNorm();
    }
    public void Revive()
    {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        pauseQuick();
        for(int i = 0; i < 2; i++)
        {
        System.out.println("                   /\\");
        pauseSuperQuick();
        System.out.println("                  /  \\");
        pauseSuperQuick();
        System.out.println("                 /    \\");
        pauseSuperQuick();
        System.out.println("                /      \\");
        pauseSuperQuick();
        System.out.println("               /        \\");
        pauseSuperQuick();
        System.out.println("              /          \\");
        pauseSuperQuick();
        System.out.println("             /            \\");
        pauseSuperQuick();
        System.out.println("            /              \\");
        pauseSuperQuick();
        System.out.println("           /                \\");
        pauseSuperQuick();
        System.out.println("          /                  \\");
        pauseSuperQuick();
        System.out.println("         /                    \\");
        pauseSuperQuick();
        System.out.println("        /                      \\");
        pauseSuperQuick();
        System.out.println("       /                        \\");
        pauseSuperQuick();
        System.out.println("      /                          \\");
        pauseSuperQuick();
        System.out.println("     /                            \\");
        pauseSuperQuick();
        System.out.println("    /                              \\");
        pauseSuperQuick();
        System.out.println("   /                                \\");
        pauseSuperQuick();
        System.out.println("  /                                  \\");
        pauseSuperQuick();
        System.out.println(" /                                    \\");
        pauseSuperQuick();
        System.out.println("/                                      \\");
        pauseSuperQuick();
        System.out.println("\\                                      /");
        pauseSuperQuick();
        System.out.println(" \\                                    /");
        pauseSuperQuick();
        System.out.println("  \\                                  /");
        pauseSuperQuick();
        System.out.println("   \\                                /");
        pauseSuperQuick();
        System.out.println("    \\                              /");
        pauseSuperQuick();
        System.out.println("     \\                            /");
        pauseSuperQuick();
        System.out.println("      \\                          /");
        pauseSuperQuick();
        System.out.println("       \\                        /");
        pauseSuperQuick();
        System.out.println("        \\                      /");
        pauseSuperQuick();
        System.out.println("         \\                    /");
        pauseSuperQuick();
        System.out.println("          \\                  /");
        pauseSuperQuick();
        System.out.println("           \\                /");
        pauseSuperQuick();
        System.out.println("            \\              /");
        pauseSuperQuick();
        System.out.println("             \\            /");
        pauseSuperQuick();
        System.out.println("              \\          /");
        pauseSuperQuick();
        System.out.println("               \\        /");
        pauseSuperQuick();
        System.out.println("                \\      /");
        pauseSuperQuick();
        System.out.println("                 \\    /");
        pauseSuperQuick();
        System.out.println("                  \\  /");
        System.out.println("                   \\/");
        pauseSuperQuick();
        }
    }
    public void Map()
    {
        System.out.println("-----+-----+-----+-----+-----+-WORLD MAP-+-----+-----+-----+-----+-----");
        pauseInstant();
        System.out.println("           . _..::__:  ,-\"-\"._        |7       ,     _,.__");
        pauseInstant();
        System.out.println("   _.___ _ _<_>`!(._`.`-.    /         _._     `_ ,_/  '  '-._.---.-.__");
        pauseInstant();
        System.out.println(">.{     \" \" `-==,',._\\{  \\  / {)      / _ \">_,-' `                    _");
        pauseInstant();
        System.out.println("  \\_.:--.       `._ )`^-. \"'       , [_/(                (5)    __,/-'");
        pauseInstant();
        System.out.println(" '\"'     \\         \"    _L        oD_,--'                )     /. (|");
        pauseInstant();
        System.out.println("          |           ,'          _)_.\\\\._<> 6              _,' /  '");
        pauseInstant();
        System.out.println("          `.   (1)   /           [_/_'` `\"(                <'}  )");
        pauseInstant();
        System.out.println("           \\\\    .-. )           /   `-'\"..' `:.#          _)  '");
        pauseInstant();
        System.out.println("    `        \\  (  `(           /         `:\\  > \\  ,-^.  /' '");
        pauseInstant();
        System.out.println("              `._,   \"\"         |   (3)     \\`'   \\|   ?_)  {\\");
        pauseInstant();
        System.out.println("                 `=.---.        `._._       ,'     \"`  |' ,- '.");
        pauseInstant();
        System.out.println("                   |    `-._         |     /          `:`<_|h--._");
        pauseInstant();
        System.out.println("                   (   (2)  >        .     | ,          `=.__.`-'\\");
        pauseInstant();
        System.out.println("                    `.     /         |     |{|              ,-.,\\     .");
        pauseInstant();
        System.out.println("                     |   ,'           \\   / `'            ,\"     \\");
        pauseInstant();
        System.out.println("                     |  /              |_'        (6)    |  __  /");
        pauseInstant();
        System.out.println("                     | |                                  '-'  `-'   \\.");
        pauseInstant();
        System.out.println("                     |/                                         \"    /");
        pauseInstant();
        System.out.println("                     \\.                                             '");
        pauseInstant();
        System.out.println();
        pauseInstant();
        System.out.println("                      ,/            ______._.--._ _..---.---------._");
        pauseInstant();
        System.out.println("     ,-----\"-..?----_/ )      __,-'\"             \"                  (");
        pauseInstant();
        System.out.println("-.._(                  `-----'             (4)                       `-");
        pauseInstant();
        System.out.println("-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----");
        pauseNorm();
    }
    public void Dead(String name) //displays when you die, includes your name
    {
        System.out.println("        _.---,._,'");
        System.out.println("       /' _.--.<");
        System.out.println("         /'     `'");
        System.out.println("       /' _.---._____");
        System.out.println("       \\.'   ___, .-'`");
        System.out.println("           /'    \\              ");
        System.out.println("         /'       `-.             ");
        System.out.println("        |                        ");
        System.out.println("        |                   .-'~~~~~~~~~~~~~~~~~~~`-.");
        System.out.println("        |                 .'                        `.");
        System.out.println("        |                 |           R  I  P        |");
        System.out.println("        |                 |                          |");
        System.out.println("        |                     " + name + "             ");
        System.out.println("         \\              \\|                          |//");
        System.out.println("   ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
    public void Scroll(String line)
    {
        for(int i = 0; i < line.length(); i++)
        {
            System.out.print(line.substring(i,i+1));
            pauseScroll();
        }
        System.out.println();
    }
    public void pressToContinue() //requires the player to press enter to begin the game.
    { 
        System.out.println("\n                                                                         [S]tart                   [L]oad");
    }
}
