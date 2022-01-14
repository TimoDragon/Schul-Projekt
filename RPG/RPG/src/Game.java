import java.util.ArrayList;
import java.util.List;
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

        Weapon fist = new Weapon("Faust", "fist", 2);
        player.getInventory().add(fist);

        //remove when project is done
            //fightsDone.add(0);
            continue2();

        //story begins here
        /*
        Main.animation(Texte.start1, 25);
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
        //*/
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
                            checker2 = true;
                            Item lantern = new Item();
                            lantern.setType("Laterne");

                            if (player.getInventory().contains(lantern)) {
                                Main.animation(Texte.storyD1, 25);
                            }
                            else {
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

                    boolean hasKnife = false;
                    for (int i = 0; i < player.getInventory().size(); i++) {
                        if (player.getInventory().get(i).getType().equals("knife")) {
                            hasKnife = true;
                            break;
                        }
                    }
        
                    if (hasKnife == true) {
                        Main.animation(Texte.storyG1, 25);
                    }
                    else {
                        Main.animation(Texte.storyG2, 25);
                    }

                    Enemy mann = new Enemy("Mann", 25);
                    Fight fight = new Fight(player, mann, "dem", "der");
                    mann.setHealth(25);
        
                    Weapon knife = new Weapon();
                    knife.setType("knife");
                    knife.setName("Messer");
                    knife.setDamage(5);
                    mann.addWeapon(knife);

                    fightsDone.add(0);
                    fight.startFight(this);
                }
            } while(checker1 == false);
        }
        else {
            Main.animation(Texte.storyG4, 25);
            Main.animation(Texte.choose, 25);
            Main.animation(Texte.storyG5, 25);

            boolean checker = false;
            do {
                if (requestInput() == 1) {
                    checker = true;

                    Main.animation(Texte.storyG6, 25);
                    
                    Weapon bow = new Weapon("Bogen", "bow", 10);
                    player.getInventory().add(bow);

                    Main.animation(Texte.choose, 25);
                    Main.animation(Texte.storyG7, 25);

                    boolean checker1 = false;
                    do {
                        if (requestInput() == 1) {
                            checker1 = true;

                            Main.animation(Texte.storyG8, 25);
                            Main.animation(Texte.choose, 25);
                            Main.animation(Texte.storyG9, 25);

                            boolean checker2 = false;
                            do {
                                if (requestInput() == 1) {
                                    Main.animation(Texte.storyG10, 25);
                                    
                                    Food apple = new Food();
                                    apple.setHeal(true);
                                    apple.setType("Apfel");
                                    apple.setSaturation(10);
                                    apple.setHealingFactor(20);
                                    apple.setPrice(20);

                                    Shop shop = new Shop();
                                    shop.addItem(apple);
                                    shop.startSelling(player);

                                    Main.animation(Texte.storyG11, 25);
                                    Main.animation(Texte.choose, 25);
                                    Main.animation(Texte.storyG12, 25);

                                    boolean checker3 = false;
                                    do {
                                        if (requestInput() == 1) {
                                            checker3 = true;
                                            Main.animation(Texte.storyH1, 25);
                                            Main.animation(Texte.choose, 25);
                                            Main.animation(Texte.storyH2, 25);

                                            boolean checker4 = false;
                                            do {
                                                if (requestInput() == 1) {
                                                    checker4 = true;
                                                    Main.animation(Texte.storyH3, 25);
                                                }
                                            } while (checker4 == false);
                                        }
                                    } while(checker3 == false);
                                }
                            } while(checker2 == false);
                        }
                    } while(checker1 == false);
                }
            } while(checker == false);
        }
    }
}