import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
    Fight fight;
    Player player;
    boolean started = false;
    private List<Integer> fightsDone = new ArrayList<Integer>();

    //to get input from the player
    public int requestInput() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if (input == 69) {
            Main.animation("Nice\n", 69);
        }

        return input;
    }

    //starts the game
    public void startGame(Game game) {
        player = new Player();  

        Weapon weapon = new Weapon();
        weapon.setDamage(5);
        weapon.setName("Messer");
        weapon.setType("knife");
        player.addItem(weapon, 1);

        continue2();

        //story begins here
        
        /*Main.animation(Texte.start1, 25);
        Main.animation(Texte.start2, 20);
        Main.animation(Texte.start1, 25);
        requestInput();

        Main.animation(Texte.prologue1, 25);
        Main.animation(Texte.prologue2, 20);
        Main.animation(Texte.prologue1, 25);
        Main.animation(Texte.randomNumber, 10);
        requestInput();

        Main.animation(Texte.story1, 20);
        boolean checker1 = false;
        do {
            if (requestInput() == 1) {
                checker1 = true;
                boolean checker2 = false;

                Main.animation(Texte.story2, 25);
                Main.animation(Texte.story3, 25);
                Main.animation(Texte.choose, 25);
                Main.animation(Texte.story4, 25);
                
                do {
                    int in = requestInput();
                    if (in == 1) {
                        checker2 = true;
                        boolean checker3 = false;

                        Main.animation(Texte.story5, 25);
                        Main.animation(Texte.choose, 25);
                        Main.animation(Texte.story6, 25);

                        do {
                            if (requestInput() == 1) {
                                checker3 = true;

                                Main.animation(Texte.story7, 25);
                                Main.animation(Texte.choose, 25);
                                Main.animation(Texte.story8, 25);

                                boolean checker4 = true;
                                do {
                                    if (requestInput() == 1) {
                                        checker4 = true;

                                        Main.animation(Texte.story9, 25);
                                        Main.animation(Texte.story10, 25);
                                        Main.animation(Texte.choose, 25);
                                        Main.animation(Texte.story11, 25);
                                
                                        boolean checker5 = true;
                                        do {
                                            int number = requestInput();
                                
                                            switch(number) {
                                                case 1 :{
                                                    checker5 = true;
                                                    Main.animation(Texte.storyA1, 25);
                                                    
                                                    Item lantern = new Item();
                                                    lantern.setType("Laterne");
                                                    Weapon knife = new Weapon();
                                                    knife.setType("knife");
                                                    knife.setDamage(5);
                                                    knife.setName("Messer");
                                
                                                    Main.animation(Texte.storyA2, 25);
                                                    continue1();
                                
                                                    break;
                                                }
                                                case 2: {
                                                    checker5 = true;
                                                    Main.animation(Texte.storyB1, 25);
                                                    Main.animation(Texte.choose, 25);
                                                    Main.animation(Texte.storyB2, 25);
                                            
                                                    boolean checker6 = false;
                                                    do {
                                                        if (requestInput() == 1) {
                                                            checker6 = true;
                                                            Main.animation(Texte.storyB3, 25);
                                                            Main.animation(Texte.choose, 25);
                                                            Main.animation(Texte.storyB4, 25);
                                
                                                            boolean checker7 = false;
                                                            do {
                                                                if (requestInput() == 1) {
                                                                    checker7 = true;
                                                                    Main.animation(Texte.storyB5, 25);
                                                                    Main.animation(Texte.choose, 25);
                                                                    Main.animation(Texte.storyB6, 25);
                                
                                                                    boolean checker8 = false;
                                                                    do {
                                                                        if (requestInput() == 1) {
                                                                            checker8 = true;
                                
                                                                            Main.animation(Texte.storyB7, 25);
                                                                            Main.animation(Texte.choose, 25);
                                                                            Main.animation(Texte.storyB8, 25);
                                
                                                                            boolean checker9 = false;
                                                                            
                                                                            do {
                                                                                if (requestInput() == 1) {
                                                                                    checker9 = true;
                                                                                    Main.animation(Texte.storyB9, 25);
                                                                                    Main.animation(Texte.choose, 25);
                                                                                    Main.animation(Texte.storyB10, 25);
                                
                                                                                    boolean checker10 = false;
                                
                                                                                    do {
                                                                                        if (requestInput() == 1) {
                                                                                            checker10 = true;
                                
                                                                                            Main.animation(Texte.storyB11, 25);
                                                                                            
                                                                                            Item lantern = new Item();
                                                                                            lantern.setType("Laterne");
                                                                                            Weapon knife = new Weapon();
                                                                                            knife.setType("knfie");
                                                                                            knife.setDamage(5);
                                                                                            knife.setName("Messer");
                                
                                                                                            Main.animation(Texte.choose, 25);
                                                                                            Main.animation(Texte.storyB12, 25);
                                
                                                                                            boolean checker11 = false;
                                
                                                                                            do {
                                                                                                if (requestInput() == 1) {
                                                                                                    Main.animation(Texte.storyB13, 25);
                                                                                                    continue1();
                                                                                                }
                                                                                            } while (checker11 == false);
                                                                                        }
                                                                                    } while(checker10 == false);
                                                                                }
                                                                            } while(checker9 == false);
                                                                        }
                                                                    } while(checker8 == false);
                                                                }
                                                            } while(checker7 == false);
                                                        }
                                                    } while(checker6 == false);
                                
                                                    break;
                                                }
                                            }
                                        } while(checker5 == false);
                                    }
                                } while(checker4 == false);
                            }
                        } while(checker3 == false);
                    }
                } while(checker2 == false);
            }
        } while(checker1 == false);
        */
    }

    public void continue1() {
        Main.animation(Texte.storyC1, 25);
        Main.animation(Texte.choose, 25);
        Main.animation(Texte.storyC2, 25);

        boolean checker1 = false;
        do {
            if (requestInput() == 1) {
                Main.animation(Texte.storyC3, 25);
                Main.animation(Texte.choose, 25);
                Main.animation(Texte.storyC4, 25);

                boolean checker2 = false;

                do {
                    int number = requestInput();
                    switch(number) {
                        case 1: {
                            Random random = new Random();
                            int randomNumber = random.nextInt(2);
                            checker2 = true;

                            if (randomNumber == 0) {
                                Main.animation(Texte.storyD1, 25);
                            }
                            else if (randomNumber == 1) {
                                Main.animation(Texte.storyD2, 25);
                                player.setHealth(player.getHealth() - 5);
                            }

                            continue2();

                            break;
                        }
                        case 2: {
                            checker2 = true;
                            Main.animation(Texte.storyE1, 25);

                            continue2();

                            break;
                        }
                    }
                } while(checker2 == false);
            }
        } while(checker1 == false);
    }

    public void continue2() {
        if (!fightsDone.contains(0)) {
            Main.animation(Texte.storyF1, 25);
            Main.animation(Texte.choose, 25);
            Main.animation(Texte.storyF2, 25);
    
            boolean checker1 = false;
    
            do {
                if (requestInput() == 1) {
                    checker1 = true;
                    fightsDone.add(0);

                    Main.animation(Texte.storyG1, 25);

                    Enemy mann = new Enemy("Mann", 25);
                    Fight fight = new Fight(player, mann, "dem", "der");
                    mann.setHealth(25);
        
                    Weapon knife = new Weapon();
                    knife.setType("knife");
                    knife.setName("Messer");
                    knife.setDamage(5);
                    mann.addWeapon(knife);

                    fight.startFight(this);
                }
            } while(checker1 == false);
        }
        else {
            Main.animation(Texte.storyG2, 25);
        }
    }
}