package Game;

import java.util.Scanner;

public class GameLogic {
    static Scanner scanner = new Scanner(System.in);
    static Player player;

    public static boolean isRunning;
    //random encounters
    public static String[] encounters={"Battle","Battle","Battle","Rest","Rest"};
    //enemy names
    public static String[] enemies ={"Ogre","Ogre","Goblin","Goblin","Stone Elemental"};
    //story elements
    public static int place=0, act=1;
    public static String[] places={"Everlasting Mountains","Haunted Landlines", "Castle of the Evil Emperor", "Throne room"};
    //method to get user input from console
    public static int readInt(String prompt, int userChoices){
        int input;
        do{
            System.out.println(prompt);
            try{
                input=Integer.parseInt(scanner.next());
            }catch (Exception exc){
                input=-1;
                System.out.println("Please enter an integer");
            }
        }while (input<1||input>userChoices);
        return input;
    }
    //method to simulate clearing out the console
    public static void clearConsole(){
        for(int i=0; i<100;i++)
            System.out.println();
    }
    //method to print a separator with length n
    public static void printSeparator(int n){
        for (int i =0; i<n; i++)
            System.out.print("-");
        System.out.println();
    }
    //method to pring a heading
    public static void printHeading(String title){
        printSeparator(30);
        System.out.println(title);
        printSeparator(30);
    }
    //method to stop the game until user enters anything
    public static void anythingToContinue(){
        System.out.println("\nEnter anything to continue...");
        scanner.next();
    }
    //method to start the game
    public static void startGame(){
        boolean nameSet=false;
        String name;
        //print title screen
        clearConsole();
        printSeparator(40);
        printSeparator(30);
        System.out.println("AGE OF THE EVIL EMPEROR");
        System.out.println("TEXT RPG BY ROMAN KMET'");
        printSeparator(30);
        printSeparator(40);
        anythingToContinue();
        //getting the player name
        do {
            clearConsole();
            printHeading("What's your name?");
            name = scanner.next();
            //asking the player if he wants to correct his choice
            clearConsole();
            printHeading("Your name is "+name+ "\nIs that correct?");
            System.out.println("(1) Yes!");
            System.out.println("(2) No, I want to change my name.");
            int input = readInt("-> ",2);
            if(input==1)
                nameSet=true;
        }while (!nameSet);

        //print story intro
        Story.printIntro();

        //create new player object with the name
        player=new Player(name);

        //print first story act intro
        Story.printFirstActIntro();

        isRunning=true;
        //start main game loop
        gameLoop();
    }
    //method that changes the game's values based on player xp
    public static void checkAct(){
        //change acts based on xp
        if (player.xp>=10&&act==1){
            //increment acts based on xp
            act=2;
            place=1;
            //story
            Story.printFirstActOutro();
            //let the player "level up"
            player.chooseTrait();
            //story
            Story.printSecondActIntro();
            //assign new values to enemies
            enemies[0]="Evil Mercenary";
            enemies[1]="Goblin";
            enemies[2]="Wolve Pack";
            enemies[3]="Henchman of the Evil Emperor";
            enemies[4]="Scary stranger";
            //assign new values to encounters
            encounters[0]="Battle";
            encounters[1]="Battle";
            encounters[2]="Battle";
            encounters[3]="Rest";
            encounters[4]="Shop";
            //fully heal the player
            player.hp=player.maxHp;
        }else if (player.xp>=50&&act==2){
            act=3;
            place=2;
            Story.printSecondActOutro();
            player.chooseTrait();
            Story.printThirdActIntro();
            enemies[0]="Evil Mercenary";
            enemies[1]="Evil Mercenary";
            enemies[2]="Henchman of the Evil Emperor";
            enemies[3]="Henchman of the Evil Emperor";
            enemies[4]="Henchman of the Evil Emperor";
            encounters[0]="Battle";
            encounters[1]="Battle";
            encounters[2]="Battle";
            encounters[3]="Rest";
            encounters[4]="Shop";
            player.hp=player.maxHp;
        }else if (player.xp>=100&&act==3){
            act=4;
            place=3;
            Story.printThirdActOutro();
            player.chooseTrait();
            Story.printFourthActIntro();
            player.hp=player.maxHp;
            //calling the final battle
            finalBattle();
        }
    }
    //method to calculate a random encounter
    public static void randomEncounter(){
        //random number between 0 and the length of the encounters array
        int encounter = (int) (Math.random()*encounters.length);
        //calling the respective methods
        if (encounters[encounter].equals("Battle")){
            randomBattle();
        }else if (encounters[encounter].equals("Rest")){
            takeRest();
        }else {
            shop();
        }
    }
    //method to continue the journey
    public static void continueJourney(){
        //check if act must be increased
        checkAct();
        //check if game isn't in last act
        if (act!=4)
            randomEncounter();
    }
    //printing out the most important information about the player character
    public static void characterInfo(){
        clearConsole();
        printHeading("CHARACTER INFO");
        System.out.println(player.name+"\tHP: "+player.hp+"/"+player.maxHp);
        printSeparator(20);
        //player xp and gold
        System.out.println("XP: "+player.xp+"\tGold: "+player.gold);
        printSeparator(20);
        //# of pots
        System.out.println("Amount of Potions: "+player.pots);
        printSeparator(20);
        //printing the chosen traits
        if (player.numAtkUpgrades>0){
            System.out.println("Offensive trait: "+player.atkUpgrades[player.numAtkUpgrades-1]);
            printSeparator(20);
        }
        if (player.numDefUpgrades>0){
            System.out.println("Defensive trait: "+player.defUpgrades[player.numDefUpgrades-1]);
            printSeparator(20);
        }
        anythingToContinue();
    }
    //shopping / encountering a travelling trader
    public static void shop(){
        clearConsole();
        printHeading("You met a mysterious stranger. \nHe offers you something:");
        int price=(int) (Math.random()*(10+player.pots*3)+10+player.pots);
        System.out.println("- Magic Potion: "+price+" gold.");
        printSeparator(20);
        //ask the player to buy one
        System.out.println("Do you want to buy one?\n(1) Yes!\n(2) No, thanks.");
        int input =readInt("-> ",2);
        //check if player wants to buy
        if (input==1){
            clearConsole();
            //check if player has enough gold
            if (player.gold>=price){
                printHeading("You bought a magical potion for "+price+" gold");
                player.pots++;
                player.gold-=price;
            }else{
                printHeading("You don't have enough gold to buy this...");
            }anythingToContinue();
        }
    }
    //taking a rest
    public static void takeRest(){
        clearConsole();
        if (player.restsLeft>=1){
            printHeading("Do you want to take a rest? ("+player.restsLeft+" rest(s) left).");
            System.out.println("(1) Yes\n(2) No, not now.");
            int input =readInt("->",2);
            if (input==1){
                //player actually takes rest
                clearConsole();
                if (player.hp<player.maxHp){
                    int hpRestored=(int) (Math.random()*(player.xp/4+1)+10);
                    player.hp+=hpRestored;
                    if (player.hp>player.maxHp){
                        player.hp=player.maxHp;
                    }
                    System.out.println("You took a rest and restored up to "+hpRestored+" health.");
                    System.out.println("You're now at "+player.hp+"/"+player.maxHp+" health.");
                    player.restsLeft--;
                }
            }else {
                System.out.println("You're at full health. You don't need to rest now!");
            }anythingToContinue();
        }
    }
    //creating a random battle
    public static void randomBattle(){
        clearConsole();
        printHeading("You encountered an evil minded creature. You'll have to fight it!");
        anythingToContinue();
        //creating new enemy with random name
        battle(new Enemy(enemies[(int) (Math.random()*enemies.length)],player.xp));
    }
    //the main BATTLE method
    public static void battle(Enemy enemy){
        //main battle loop
        while (true){
            clearConsole();
            printHeading(enemy.name+"\nHP: "+enemy.hp+"/"+enemy.maxHp);
            printHeading(player.name +"\nHP: "+player.hp+"/"+player.maxHp);
            System.out.println("Choose an action");
            printSeparator(20);
            System.out.println("(1) Fight\n(2) Use Potion\n(3) Run Away");
            int input =readInt("-> ",3);
            //react accordingly to player input
            if (input==1){
                //FIGHT
                //calculate dmg and dmgTook (dmg enemy deals to player)
                int dmg = player.attack()-enemy.defend();
                int dmgTook=enemy.attack()-player.defend();
                //check that dmg and dmgTook isn't negative
                if (dmgTook<0){
                    //add some dmg if player defends very well
                    dmg-=dmgTook/2;
                    dmgTook=0;
                }
                if (dmg<0)
                    dmg=0;
                //deal damage to both parties
                player.hp -=dmgTook;
                enemy.hp-=dmg;
                //print the info of this battle round
                clearConsole();
                printHeading("BATTLE");
                System.out.println("You dealt "+dmg+ " damage to the "+enemy.name+".");
                printSeparator(15);
                System.out.println("The "+enemy.name+" dealt "+dmgTook+" damage to you.");
                anythingToContinue();
                //check if player is still alive or dead
                if (player.hp<0){
                    //method to end the game
                    playerDied();
                    break;
                } else if (enemy.hp<=0) {
                    //tell the player he won
                    clearConsole();
                    printHeading("You defeated the "+enemy.name+"!");
                    //increase player xp
                    player.xp+=enemy.xp;
                    System.out.println("You earned "+enemy.xp+" XP!");
                    //random drops
                    boolean addRest=(Math.random()*5+1<=2.25);
                    int goldEarned= (int) (Math.random()*enemy.xp);
                    if (addRest){
                        player.restsLeft++;
                        System.out.println("You earned the chance to get an additional rest!");
                    }
                    if (goldEarned>0){
                        player.gold+=goldEarned;
                        System.out.println("You collect "+goldEarned+" gold from the "+enemy.name+"'s corpse!");
                    }
                    anythingToContinue();
                    break;
                }
            } else if (input==2) {
                //Use potion
                clearConsole();
                if (player.pots>0&&player.hp<player.maxHp){
                    //player CAN take a potion
                    //make sure player wants to drink a potion
                    printHeading("Do you want to drink a potion? ("+player.pots+" left).");
                    System.out.println("(1) Yes\n(2) No, maybe later");
                    input = readInt("-> ",2);
                    if (input==1){
                        //player actually took it
                        player.hp=player.maxHp;
                        clearConsole();
                        printHeading("You drank a magic potion. It restored your health back to "+player.maxHp);
                        anythingToContinue();
                    }
                }else {
                    //player CANNOT take a potion
                    printHeading("You don't have any potions or you're at full health.");
                    anythingToContinue();
                }
            }else {
                clearConsole();
                //chance of 25% to escape
                if (act!=4){
                    if (Math.random()*10+1<=2.5){
                        printHeading("You ran away from the "+enemy.name+"!");
                        anythingToContinue();
                        break;
                    }else {
                        printHeading("You didn't manage to escape.");
                        anythingToContinue();
                        //calculate damage the player takes
                        int dmgTook = enemy.attack();
                        System.out.println("In your hurry you took 0 "+ dmgTook+" damage!");
                        //check if player is still alive
                        if (player.hp<=0)
                            playerDied();
                    }
                }else {
                    printHeading("YOU CANNOT ESCAPE FROM THE EVIL EMPEROR!!!");
                    anythingToContinue();
                }
            }
        }
    }
    //printing the main menu
    public static void printMenu(){
        clearConsole();
        printHeading(places[place]);
        System.out.println("Choose an action:");
        printSeparator(20);
        System.out.println("(1) Continue on your journey");
        System.out.println("(2) Character Info");
        System.out.println("(3) Exit Game");
    }
    //the final (last) battle of the entire game
    public static void finalBattle(){
        //creating the Evil Emperor and letting the player fight against him
        battle(new Enemy("THE EVIL EMPEROR",300));
        //printing the proper ending
        Story.printEnd(player);
        isRunning=false;
    }
    //method that gets called when the player is dead
    public static void playerDied(){
        clearConsole();
        printHeading("You died...");
        printHeading("You earned "+player.xp+" XP on your journey. Try to earn more next time!");
        System.out.println("Thank you for playing my game. I hope you enjoyed it!");
    }
    //main game loop
    public static void gameLoop(){
        while (isRunning){
            printMenu();
            int input = readInt("-> ",3);
            if (input==1){
                continueJourney();
            } else if (input==2){
                characterInfo();
            }else {
                isRunning=false;
            }
        }
    }
}

