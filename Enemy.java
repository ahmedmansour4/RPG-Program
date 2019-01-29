/**
 * This class houses the methods concerning the enemy.
 * 
 * @author Ahmed Mansour 
 * @version 8/3/17
 */
public class Enemy
{
    private String name; //name of the enemy
    private int health; //health of the enemy
    private int level = 1; //level of the enemy
    private int strength; //strength of the enemy
    private int damage; //damage the enemy deals
    private int maxHealth; //maximum health the enemy has
    private int type; //used to display an drawing of the enemy
    private boolean isFrozen;
    private Effects effect = new Effects();
    Enemy(String name, int health, int level, int strength, int maxHealth, int type)
    {
        this.name = name;
        this.health = health;
        this.level = level;
        this.strength = strength;
        this.type = type;
    }
    public String getName() //returns the name of the enemy
    {
        return name;
    }
    public void setStats() //sets the stats of the enemy based on its level
    {
        int rand = (int)(Math.random() * 100); //creates a random number between 0 and 100;
        if(rand < 5) //determines what enemy, currently all stats are identical
        {
            name = "Dragon";
            health = 500 * (int)(0.5 * level + 1);
            strength = 10 * level;
            maxHealth = health;
            type = 0;
        }
        else if(rand < 10)
        {
            name = "Skeleton";
            health = 200 * (int)(0.5 * level + 1);
            strength = 10 * level;
            maxHealth = health;
            type = 1;
        }
        else if(rand < 15)
        {
            name = "Imp";
            health = 100 * (int)(0.5 * level + 1);
            strength = 10 * level;
            maxHealth = health;
            type = 2;
        }
        else if(rand < 25)
        {
            name = "Reaper";
            health = 50 * (int)(0.5 * level + 1);
            strength = 10 * level;
            maxHealth = health;
            type = 3;
        }
        else if(rand < 35)
        {
            name = "Unicorn";
            health = 150 * (int)(0.5 * level + 1);
            strength = 10 * level;
            maxHealth = health;
            type = 4;
        }
        else if(rand < 45)
        {
            name = "Griffin";
            health = 300 * (int)(0.5 * level + 1);
            strength = 10 * level;
            maxHealth = health;
            type = 5;
        }
        else if(rand < 60)
        {
            name = "Spider";
            health = 100 * (int)(0.5 * level + 1);
            strength = 10 * level;
            maxHealth = health;
            type = 6;
        }
        else if(rand < 70)
        {
            name = "Orc";
            health = 250 * (int)(0.5 * level + 1);
            strength = 10 * level;
            maxHealth = health;
            type = 7;
        }
        else if(rand < 80)
        {
            name = "Vicious Bird";
            health = 300 * (int)(0.5 * level + 1);
            strength = 10 * level;
            maxHealth = health;
            type = 8;
        }
        else if(rand < 90)
        {
            name = "Pumpkin Man";
            health = 400 * (int)(0.5 * level + 1);
            strength = 10 * level;
            maxHealth = health;
            type = 9;
        }
        else if(rand < 97)
        {
            name = "Demon";
            health = 600 * (int)(0.5 * level + 1);
            strength = 10 * level;
            maxHealth = health;
            type = 10;
        }
        else if(rand < 100)
        {
            name = "Dragon";
            health = 800 * (int)(0.5 * level + 1);
            strength = 10 * level;
            maxHealth = health;
            type = 11;
        }
    }
    public void monster() //displays as an ASCII drawing of the monster
    {
        if(type == 0)
        {
            System.out.println("                \\                  /");
            System.out.println("       _________))                ((__________");
            System.out.println("      /.-------./\\\\    \\    /    //\\.--------.\\");
            System.out.println("     //#######//##\\\\   ))  ((   //##\\#########\\\\");
            System.out.println("    //#######//###((  ((    ))  ))###\\#########\\\\");
            System.out.println("   ((#######((#####\\\\  \\\\  //  //#####))########))");
            System.out.println("    \\##' `###\\######\\\\  \\\\)(/  //######/####' `##/");
            System.out.println("     )'    ``#)'  `##\\`->oo<-'/##'  `(#''\");    `(");
            System.out.println("             (       ``\\`..'/''       )");
            System.out.println("                        \\\"\"(");
            System.out.println("                         `- )");
            System.out.println("                         / /");
            System.out.println("                        ( /\\");  
            System.out.println("                        /\\| \\\"");
            System.out.println("                       (  \\\"");
            System.out.println("                           )");
            System.out.println("                          /");
            System.out.println("                         (");
            System.out.println("                         `");
        } 
        else if (type == 1)
        {
            System.out.println("                      _.--\"\"--._");        
            System.out.println("                    .\"          \"");     
            System.out.println("                   | .   `     ` |");    
            System.out.println("                   \\(            )/");   
            System.out.println("                    \\)__._   _._(/");  
            System.out.println("                    //   >..<   \\");  
            System.out.println("                    |__.' vv '.__/"); 
            System.out.println("                       l'''\"''l");    
            System.out.println("                       \\_    _/");  
            System.out.println("                  _      )--(     _");  
            System.out.println("                 | '--.__)--(_.--' |");  
            System.out.println("                  \\ |`----''----'| /"); 
            System.out.println("                   ||  `-'  '--' ||"); 
            System.out.println("                   || `--'  '--' ||"); 
            System.out.println("                   |l `--'--'--' |l");  
            System.out.println("                  |__|`--'  `--'|__|"); 
            System.out.println("                  |  |    )-(   |  |"); 
            System.out.println("                   ||     )-(    \\||");     
        }
        else if (type == 2)
        {
            System.out.println("             ,  .   (          )          -.\\ |");
            System.out.println("             | / .- |\\        /|         _  \\'/");
            System.out.println("              \\'/   | \\.-\"\"-./ |          \\_) ;-'");
            System.out.println("           `'-; (_/ ;   _  _   ;           ) /");
            System.out.println("               \\ (   \\ (.\\/.) /    .-.    / |");
            System.out.println("                \\ \\   \\ \\/\\/ /-._.'   \\   | |");
            System.out.println("                 \\ \\   \\ .. /_         \\  | |");
            System.out.println("                  \\ \\   |  |__)     |\\  \\ | |");
            System.out.println("                   \\ `\"`|==|_       | \\  \\| |");
            System.out.println("                    \\,-'|==| \\      |  \\    |");
            System.out.println("                         \\/   '.    /   `\\ /");
            System.out.println("                                |   |     `   ,");
            System.out.println("                                |   |         )\\");
            System.out.println("                      __.....__/    |        /  \\");
            System.out.println("                    /`              \\        `//`");
            System.out.println("                    |  \\`-....-'\\    `-.____.'/");
            System.out.println("                    |  |        /   /`\"-----'`");
            System.out.println("                    |  |        |  |");
            System.out.println("                    | /         |  |");
            System.out.println("             .------' \\         /  /");
            System.out.println("            (((--------'        \\  |");
            System.out.println("                                 | \\");
            System.out.println("                                 | |");
            System.out.println("                                 | |");
            System.out.println("                                 | /");
            System.out.println("                                /  )");
            System.out.println("                               /   |");
            System.out.println("                              (-(-('");
        }
        else if (type == 3)
        {
            System.out.println("                                            .\"\"--..");
            System.out.println("                                           []      `'--.._");
            System.out.println("                                           ||__           `'-,");
            System.out.println("                                         `)||_ ```'--..       \\");
            System.out.println("                     _                    /|//}        ``--._  |");
            System.out.println("                  .'` `'.                /////}              `\\/");
            System.out.println("                 /  .\"\"\".\\              //{///    ");
            System.out.println("                /  /_  _`\\\\            // `||");
            System.out.println("                | |(_)(_)||          _//   ||");
            System.out.println("                | |  /\\  )|        _///\\   ||");
            System.out.println("                | |L====J |       / |/ |   ||");
            System.out.println("               /  /'-..-' /    .'`  \\  |   ||");
            System.out.println("              /   |  :: | |_.-`      |  \\  ||");
            System.out.println("             /|   `\\-::.| |          \\   | ||");
            System.out.println("           /` `|   /    | |          |   / ||");
            System.out.println("         |`    \\   |    / /          \\  |  ||");
            System.out.println("        |       `\\_|    |/      ,.__. \\ |  ||");
            System.out.println("        /                     /`    `\\ ||  ||");
            System.out.println("       |           .         /        \\||  ||");
            System.out.println("       |                     |         |/  ||");
            System.out.println("       /         /           |         (   ||");
            System.out.println("      /          .           /          )  ||");
            System.out.println("     |            \\          |             ||");
            System.out.println("    /             |          /             ||");
            System.out.println("   |\\            /          |              ||");
            System.out.println("   \\ `-._       |           /              ||");
            System.out.println("    \\ ,//`\\    /`           |              ||");
            System.out.println("     ///\\  \\  |             \\              ||");
            System.out.println("    |||| ) |__/             |              ||");
            System.out.println("    |||| `.(                |              ||");
            System.out.println("    `\\\\` /`                 /              ||");
            System.out.println("       /`                   /              ||");
            System.out.println("      /                     |              ||");
            System.out.println("     |                      \\              ||");
            System.out.println("    /                        |             ||");
            System.out.println("  /`                          \\            ||");
            System.out.println("/`                            |            ||");
            System.out.println("`-.___,-.      .-.        ___,'            ||");
            System.out.println("         `---'`   `'----'`");
        }
        else if (type == 4)
        {
            System.out.println("             ,)))))))),,,");
            System.out.println("            ,(((((((((((((((,");
            System.out.println("            )\\`\\)))))))))))))),");
            System.out.println("     *--===///`_    ```(((((((((");
            System.out.println("           \\\\\\ b\\  \\    ``)))))))");
            System.out.println("            ))\\    |     ((((((((               ,,,,");
            System.out.println("           (   \\   |`.    ))))))))       ____ ,)))))),");
            System.out.println("                \\, /  )  ((((((((-.___.-\"    `\"(((((((");
            System.out.println("                 `\\\"  /    )))))))               \\`)))))");
            System.out.println("                    /    ((((``                  \\(((((");
            System.out.println("              _____|      `))         /          |)))))");
            System.out.println("             /     \\                 |          / (((((");
            System.out.println("            /  --.__)      /        _\\         /   )))))");
            System.out.println("           /  /    /     /'`\"~----~`  `.       \\   ((((");
            System.out.println("          /  /    /    /`               `-._    `-. `)))");
            System.out.println("         /_ (    /    /`                    `-._   \\ ((");
            System.out.println("        /__|`   /   /`                        `\\`-. \\ `)");
            System.out.println("               /  /`                            `\\ \\ \\ ");
            System.out.println("              /  /                                \\ \\ \\");
            System.out.println("             /_ (                                 /_()_(");
            System.out.println("            /__|`                                /__/__|");
        }
        else if (type == 5)
        {
            System.out.println("                         .---.");
            System.out.println("                        |.    \\");
            System.out.println("                 __ _,   \\:.   \\");
            System.out.println("             __.-_ ` (    |::   \\");
            System.out.println("            /__  e>  |    /::    ;");
            System.out.println("         _  ` _) ,   /   /::'    |");
            System.out.println("        _`\\_ `\"\"`/  (__.:::'     |");
            System.out.println("       ('-\\ \\   /    `::'     (  |");
            System.out.println("         (-`\\`\\/       .--. (  ) |");
            System.out.println("             \\|   ,   (    ) ) ( ;");
            System.out.println("              |  /     '.  (/) | /");
            System.out.println("              | /\\\\.-'    `\\ ((/ /  ");
            System.out.println("             / / /         |  ||     ____");
            System.out.println("           _/ /_ \\\\     '-._|. `\\\\    /.--.\\");
            System.out.println("         ('-/.--) '.___    \\_`;    //    `)");
            System.out.println("           (   .--...__`)   |`\\\\__//     (_\\");
            System.out.println("              (((---....___/   '--'        `");
        }
        else if (type == 6)
        {
            System.out.println("                        (");
            System.out.println("                         )");
            System.out.println("                        (");
            System.out.println("                  /\\  .-\"\"\"-.  /\\");
            System.out.println("                 //\\\\/  ,,,  \\//\\\\");
            System.out.println("                 |/\\| ,;;;;;, |/\\|");
            System.out.println("                 //\\\\\\;-\"\"\"-;///\\\\");
            System.out.println("                //  \\/   .   \\/  \\\\");
            System.out.println("               (| ,-_| \\ | / |_-, |)");
            System.out.println("                 //`__\\.-.-./__`\\\\");
            System.out.println("                // /.-(() ())-.\\ \\\\");
            System.out.println("               (\\ |)   '---'   (| /)");
            System.out.println("                ` (|           |) `");
            System.out.println("                  \\)           (/");
        }
        else if (type == 7)
        {
            System.out.println("                           __.--|~|--.__                            ,,;/;");
            System.out.println("                         /~     | |    ;~\\                        ,;;;/;;'");
            System.out.println("                        /|      | |    ;~\\\\                     ,;;;;/;;;'");
            System.out.println("                       |/|      \\_/   ;;;|\\                    ,;;;;/;;;;'");
            System.out.println("                       |/ \\          ;;;/  )                 ,;;;;/;;;;;'");
            System.out.println("                   ___ | ______     ;_____ |___....__      ,;;;;/;;;;;'");
            System.out.println("             ___.-~ \\(| \\  \\.\\ \\__/ /./ /:|)~   ~   \\   ,;;;;/;;;;;'");
            System.out.println("         /~~~    ~\\    |  ~-.     |   .-~: |//  _.-~~--,;;;;/;;;;;'");
            System.out.println("        (.-~___     \\.'|    | /-.__.-\\|::::| //~     ,;;;;/;;;;;'");
            System.out.println("        /      ~~--._ \\|   /          `\\:: |/      ,;;;;/;;;;;'");
            System.out.println("     .-|             ~~|   |  /V\"\"\"\"V\\ |:  |     ,;;;;/;;;;;' \\");
            System.out.println("    /                   \\  |  ~`^~~^'~ |  /    ,;;;;/;;;;;'    ;");
            System.out.println("   (        \\             \\|`\\._____./'|/    ,;;;;/;;;;;'      '\\");
            System.out.println("  / \\        \\                             ,;;;;/;;;;;'     /    |");
            System.out.println(" |            |                          ,;;;;/;;;;;'      |     |");
            System.out.println("|`-._          |                       ,;;;;/;;;;;'              \\");
            System.out.println("|             /                      ,;;;;/;;;;;'  \\ \\__________");
            System.out.println("(             )                 |  ,;;;;/;;;;;'      |        _.--~");
            System.out.println(" \\          \\/ \\              ,  ;;;;;/;;;;;'       /( .-~_..--~~~~~~~~~~");
            System.out.println(" \\__         '  `       ,     ,;;;;;/;;;;;'    .   /  \\   / /~");
            System.out.println(" /          \\'  |`._______ ,;;;;;;/;;;;;;'    /   :    \\/'/'       /|_/| ``|");
            System.out.println("| _.-~~~~-._ |   \\ __   .,;;;;;;/;;;;;;' ~~~~'   .'    | |       /~ (/\\/  ||");
            System.out.println("/~ _.-~~~-._\\    /~/   ;;;;;;;/;;;;;;;'          |    | |       / ~/_-'|- /|");
            System.out.println("(/~         \\| /' |   ;;;;;;/;;;;;;;;            ;   | |       (.-~;  /- / |");
            System.out.println("|            /___ `-,;;;;;/;;;;;;;;'            |   | |      ,/)  /  /- /  |");
            System.out.println(" \\            \\  `-.`---/;;;;;;;;;' |          _'   |T|    /'('  /  /|- _/ //");
            System.out.println("   \\           /~~/ `-. |;;;;;''    ______.--~~ ~\\  |u|  ,~)')  /   | \\~-==//");
            System.out.println("     \\      /~(   `-\\  `-.`-;   /|    ))   __-####\\ |a|   (,   /|    |  \\");
            System.out.println("       \\  /~.  `-.   `-.( `-.`~~ /##############'~~)| |   '   / |    | ~\\");
            System.out.println("        \\(   \\    `-._ /~)_/|  /############'       |X|      /  \\     \\_\\ `\\");
            System.out.println("        ,~`\\  `-._  / )#####|/############'   /     |i|  _--~ _/ | .-~~____--'");
            System.out.println("       ,'\\  `-._  ~)~~ `################'           |o| ((~>/~   \\ (((' -_");
            System.out.println("     ,'   `-.___)~~      `#############             |n|           ~-_ ~\\_");
        }
        else if (type == 8)
        {
            System.out.println("              ,      .-; ");
            System.out.println("             ,  |\\    / /  __,");
            System.out.println("             |\\ '.`-.|  |.'.-'");
            System.out.println("              \\`'-:  `; : /");
            System.out.println("               `-._'.  \\'|");
            System.out.println("              ,_.-=` ` `  ~,_");
            System.out.println("               '--,.    .-. ,=\". ");
            System.out.println("                 /     { 0 )`;-.}");
            System.out.println("                 |      '-' /__ |");
            System.out.println("                 /          \\_,\\|");
            System.out.println("                 |          (");
            System.out.println("             __ / '          \\");
            System.out.println("     /\\_    /,'`|     '   .-~\"~~-.");
            System.out.println("     |`.\\_ |   /  ' ,    /        \\");
            System.out.println("   _/  `, \\|  ; ,     . |  ,  '  . |");
            System.out.println("   \\   `,  |  |  ,  ,   |  :  ;  : |");
            System.out.println("   _\\  `,  \\  |.     ,  |  |  |  | |");
            System.out.println("   \\`  `.   \\ |   '     |\\_|-'|_,'\\|");
            System.out.println("   _\\   `,   `\\  '  . ' | |  | |  |           __");
            System.out.println("   \\     `,   | ,  '    |_/'-|_\\_/     __ ,-;` /");
            System.out.println("    \\    `,    \\ .  , ' .| | | | |   _/' ` _=`|");
            System.out.println("     `\\    `,   \\     ,  | | | | |_/'   .=\"  /");
            System.out.println("     \\`     `,   `\\      \\/|,| ;/'   .=\"    |");
            System.out.println("      \\      `,    `\\' ,  | ; /'    =\"    _/");
            System.out.println("       `\\     `,  .-\"\"-. ': /'    =\"     /");
            System.out.println("        _`\\    ;_{  '   ; /'    =\"      /");
            System.out.println("       _\\`-/__.~  `.8.'.\"`~-. =\"     _,/");
            System.out.println("    __\\      {   '-.|.'.--~'`}\"    _/");
            System.out.println("    \\    .=\"` }.-~\"'u'-. '-..'  __/");
            System.out.println("   _/  .\"    {  -'.~('-._,.'\\_,/");
            System.out.println("  /  .\"    _/'`--; ;  `.  ;");
            System.out.println("   .=\"  _/'      `-..__,-'");
            System.out.println("    __/'");
            System.out.println("   `");
        }
        else if (type == 9)
        {
            System.out.println("                       .' /");
            System.out.println("                     _ | ;  .-''\"\"-.._");
            System.out.println("                _.-'\\\"\\\"'._|'`_         `.");
            System.out.println("              .'   _.-'   `. `  `'-.    `.");
            System.out.println("            .'   .' ./        \\.    `.    \\");
            System.out.println("            |   /  //|        |\\\\     \\    ;");
            System.out.println("           ;      ;/_;    |   ;_\\       _  |");
            System.out.println("          |       L.._\\  /'  /_..J    _.'|  |");
            System.out.println("          |   ._        |_.\\      __  >| ;  '");
            System.out.println("           ;   \\'-.   ..___    _.'  `' //  /          _");
            System.out.println("            \\   \\ \\\\__/   |/__|  _.-|_.'  /       .-.' )");
            System.out.println("    _        `.  `.\\  _/|'-.   _/\\  '   .'      .' /.-'_)");
            System.out.println("   ( `.-.      `.   `'--'  '--''`    _.'        |  ) -'.");
            System.out.println("  (_'-.\\ `.      `-.._,\\__,___,;_/-'`         _.'   /-._)");
            System.out.println("   .'- (  |        .\" / |`'-'`|  \\  \\      _.7|L /-'");
            System.out.println("  (_.-\\   `._     /  < .'     :  7   `._,-'  |\\_]");
            System.out.println("       `-\\_/|`._ / .-' ||     '.  >_  /|     \\ /|");
            System.out.println("         L_.'   `\\  \\  .'      | //\\   ' _,.--`'");
            System.out.println("          \\|         ' |       |; | `._.'");
            System.out.println("           '---...__/| '       ;| | ");
            System.out.println("                   '.7'         . :");
            System.out.println("                  / //          |' |");
            System.out.println("                .'.'|`-._      _>\\  \\");
            System.out.println("               <\"`  ;    `'\"''` `\\'  '.");
        }
        else if (type == 10)
        {
            System.out.println("          (                      )");
            System.out.println("          |\\\\    _,--------._    / |");
            System.out.println("          | `.,'            `. /  |");
            System.out.println("          `  '              ,-'   '");
            System.out.println("           \\/_         _   (     /");
            System.out.println("          (,-.`.    ,',-.`. `__,'");
            System.out.println("           |/#\\ ),-','#\\`= ,'.` |");
            System.out.println("           `._/)  -'.\\_,'   ) ))|");
            System.out.println("           /  (_.)\\\\     .   -'//");
            System.out.println("          (  /\\____/\\\\    ) )`'\\");
            System.out.println("           \\ |V----V||  ' ,    \\");
            System.out.println("            |`- -- -'   ,'   \\  \\      _____");
            System.out.println("     ___    |         .'    \\ \\  `._,-'     `-");
            System.out.println("        `.__,`---^---'       \\ ` -'");
            System.out.println("           -.______  \\ . /  ______,-");
            System.out.println("                   `.     ,' ");
        }
        else if (type ==11)
        {
            System.out.println("                                                   ___");
            System.out.println("                                                  .~))>>");
            System.out.println("                                                 .~)>>");
            System.out.println("                                               .~))))>>>");
            System.out.println("                                             .~))>>             ___");
            System.out.println("                                           .~))>>)))>>      .-~))>>  ");
            System.out.println("                                         .~)))))>>       .-~))>>)>");
            System.out.println("                                       .~)))>>))))>>  .-~)>>)>");
            System.out.println("                   )                 .~))>>))))>>  .-~)))))>>)>");
            System.out.println("                ( )@@*)             //)>))))))  .-~))))>>)>");
            System.out.println("              ).@(@@               //))>>))) .-~))>>)))))>>)>");
            System.out.println("            (( @.@).              //))))) .-~)>>)))))>>)>");
            System.out.println("          ))  )@@*.@@ )          //)>))) //))))))>>))))>>)>");
            System.out.println("       ((  ((@@@.@@             |/))))) //)))))>>)))>>)>");
            System.out.println("      )) @@*. )@@ )   (\\_(\\-\\b  |))>)) //)))>>)))))))>>)>");
            System.out.println("    (( @@@(.@(@ .    _/`-`  ~|b |>))) //)>>)))))))>>)>");
            System.out.println("     )* @@@ )@*     (@) (@)  /\\b|))) //))))))>>))))>>");
            System.out.println("   (( @. )@( @ .   _/       /  \\b)) //))>>)))))>>>_._");
            System.out.println("    )@@ (@@*)@@.  (6,   6) / ^  \\b)//))))))>>)))>>   ~~-.");
            System.out.println(" ( @jgs@@. @@@.*@_ ~^~^~, /\\  ^  \\b/)>>))))>>      _.     `,");
            System.out.println("  ((@@ @@@*.(@@ .   \\^^^/' (  ^   \\b)))>>        .'         `,");
            System.out.println("   ((@@).*@@ )@ )    `-'   ((   ^  ~)_          /             `,");
            System.out.println("     (@@. (@@ ).           (((   ^    `\\        |               `.");
            System.out.println("       (*.@*              / ((((        \\        \\      .         `.");
            System.out.println("                         /   (((((  \\    \\    _.-~\\     Y,         ;");
            System.out.println("                        /   / (((((( \\    \\.-~   _.`\" _.-~`,       ;");
            System.out.println("                       /   /   `(((((()    )    (((((~      `,     ;");
            System.out.println("                     _/  _/      `\"\"\"/   /'                  ;     ;");
            System.out.println("                 _.-~_.-~           /  /'                _.-~   _.'");
            System.out.println("               ((((~~              / /'              _.-~ __.--~");
            System.out.println("                                  ((((          __.-~ _.-~");
            System.out.println("                                              .'   .~~");
            System.out.println("                                              :    ,'");
            System.out.println("                                              ~~~~~");
        }
    }
    public int getHealth() //returns the health of the enemy
    {
        return health;
    }
    public int getLevel() //returns the health of the enemy
    {
        return level;
    }
    public void setLevel(int area) //sets the enemy level based on the player level
    {
        int leveler;
        if(area == 1)
        {
            leveler =  (int)(Math.random() * 10) - 5;
        }
        else if(area == 2)
        {
            leveler = 15 + (int)(Math.random() * 10) - 5;
        }
        else if(area == 3)
        {
            leveler = 25 + (int)(Math.random() * 10) - 5;
        }
        else if(area == 4)
        {
            leveler = 35 + (int)(Math.random() * 10) - 5;
        }
        else if(area == 5)
        {
            leveler = 45 + (int)(Math.random() * 10) - 5;
        }
        else
        {
            leveler = 60 + (int)(Math.random() * 10) - 5;
        }
        level += leveler + 1;
        if(level < 0) //if the enemy level is negative, multiply it by -1, making it positve
        {
            level *= -1;
        }
        if(level == 0) //if the enemy level is zero, increase the level
        {
            level = 7;
        }
    }
    public void Encounter() //sets the stats of the enemy the player is about to fight
    {
        setStats();
        effect.Scroll("\n--------------------A level " + getLevel() + " " + getName() + " approaches!--------------------");
        monster();
    }
    public void Boss(int stage, int area)
    {
        if(stage == 5)
        {
            level = area * 30;
        }
    }
    public void attack() //sets the damage variable as a certain number
    {
        int rand = (int)(Math.random() * 100);
        if(rand < 25)
        {
            effect.Scroll("The " + name + " attacks!");
        }
        else if(rand < 50)
        {
            effect.Scroll("The " + name + " slashes violently!");
        }
        else if(rand < 75)
        {
            effect.Scroll("The " + name + " charges!");
        }
        else
        {
            effect.Scroll("The " + name + " jumps and pounds away!");
        }
        damage = (int)(Math.random() * 10 * strength);
    }
    public void Action() //action done by the enemy
    {
        int rand = (int)(Math.random() * 100);
        damage = 0;
        if(!isFrozen)
        {
            if(rand < 15)
            {
                doNothing();
            }
            else if(rand < 50)
            {
                magicAttack();
            }
            else
            {
                attack();
            }
        }
        else
        {
            effect.Scroll("The " + name + " has thawed out!");
            isFrozen = false;
        }
    }
    public void doNothing()
    {
        int rand = (int)(Math.random() * 100);
        if(rand < 25)
        {
            effect.Scroll("The " + name + " looks confused!");
        }
        else if(rand < 50)
        {
            effect.Scroll("The " + name + " wonders if it left the oven on.");
        }
        else if(rand < 75)
        {
            effect.Scroll("The " + name + " is lost in its own world!");
        }
        else
        {
            effect.Scroll("The " + name + " falls over!");
        }
    }
    public void magicAttack()
    {
        int rand = (int)(Math.random() * 100);
        if(rand < 80)
        {
            fire();
        }
        else
        {
            heal();
        }
    }
    public void fire()
    {
        effect.Scroll("The " + name + " shoots a flurry of fireballs!");
        effect.Fire();
        damage = (int)(Math.random() * level * 30);
    }
    public void heal()
    {
        effect.Scroll("The " + name + " heals its wounds!");
        effect.Heal(); //calls the Heal method to create an effect
        int heal = (int)(Math.random() * 10 * level); //the level of the enemy if factored in to determine amount of health healed
        health += heal; //increases the enemy's health
        damage = 0; //this is necessary to ensure the last attacks damage isn't used again
        if(health > maxHealth) //check if the heal over heals the enemy
        {
            health = maxHealth; //if overheal occurs, it brings the current health to the max health
        }
        effect.Scroll("The " + name + " healed " + heal + " HP!");
    }
    public void frozen()
    {
        int rand = (int)(Math.random() * 100);
        if(rand < 50)
        {
            effect.Scroll("The " + name + " frozen solid and can't move!");
            isFrozen = true;
        }
    }
    public int dealDamage() //return damage dealt
    {
        return damage;
    }
    public void takeDamage(int healthLoss, String type) //takes damage, loses health
    {
        if(healthLoss > 0) //checks if the enemy loses any health, in case the attack missed
        {
             effect.Scroll(name + " loses " + healthLoss + " health!");
             health -= healthLoss;
        }
        if(type.equals("Ice"))
        {
            frozen();
        }
    }
    public void showStats() //shows the stats of the enemy
    {
        effect.pauseQuick();
        System.out.print("\n-----------------------------");
        effect.pauseSuperQuick();
        effect.Scroll("\nEnemy Stats:");
        effect.pauseSuperQuick();
        effect.Scroll("Health: " + health + "/" + maxHealth);
        effect.pauseSuperQuick();
        effect.Bar(health, maxHealth);
        effect.pauseSuperQuick();
    }
    public boolean isDead() //returns true if the enemy is dead
    {
        if(health <= 0)
        {
            return true;
        }
        return false;
    }
    public void run()
    {
        level = 0;
        health = 0;
    }
    public void death() //displays a random line of how the enemy died
    {
        int typeOfDeath = (int)(Math.random() * 100);
        System.out.println();
        if(typeOfDeath < 25)
        {
            effect.Scroll("The " + name + " is defeated!");
        }
        else if(typeOfDeath < 50)
        {
            effect.Scroll("The " + name + " withers away to nothingness!");
        }
        else if(typeOfDeath < 75)
        {
            effect.Scroll("The " + name + " cries in defeat!");
        }
        else if(typeOfDeath < 100)
        {
            effect.Scroll("The " + name + " returns to normal!");
        }
    }
}
