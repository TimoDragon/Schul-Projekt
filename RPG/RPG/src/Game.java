import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    Fight fight;
    Player player;
    boolean started = false;
    Texte texte;
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
        texte = new Texte();
        texte.setPlayer(player);

        Weapon fist = new Weapon("Faust", "fist", 2);
        player.getInventory().add(fist);

        //remove when project is done
            //fightsDone.add(1);
            continue2();

        //story begins here

        Main.animation(texte.start1, 25);
        Main.animation(texte.start2, 20);
        Main.animation(texte.start1, 25);
        
        Scanner nameSc = new Scanner(System.in);
        String name = nameSc.next();
        player.setName(name);
        texte.setPlayer(player);

        Main.animation(texte.prologue1, 25);
        Main.animation(texte.prologue2, 20);
        Main.animation(texte.prologue1, 25);
        Main.animation(texte.randomNumber, 10);
        requestInput();

        ///*
        Main.animation(texte.story1, 20);
        boolean checker1 = false;
        do {
            if (requestInput() == 1) {
                checker1 = true;
                boolean checker2 = false;

                Main.animation(texte.story2, 25);
                Main.animation(texte.story3, 25);
                Main.animation(texte.choose, 25);
                Main.animation(texte.story4, 25);
                
                do {
                    int in = requestInput();
                    if (in == 1) {
                        checker2 = true;
                        boolean checker3 = false;

                        Main.animation(texte.story5, 25);
                        Main.animation(texte.choose, 25);
                        Main.animation(texte.story6, 25);

                        do {
                            if (requestInput() == 1) {
                                checker3 = true;

                                Main.animation(texte.story7, 25);
                                Main.animation(texte.choose, 25);
                                Main.animation(texte.story8, 25);

                                boolean checker4 = true;
                                do {
                                    if (requestInput() == 1) {
                                        checker4 = true;

                                        Main.animation(texte.story9, 25);
                                        Main.animation(texte.story10, 25);
                                        Main.animation(texte.choose, 25);
                                        Main.animation(texte.story11, 25);
                                
                                        boolean checker5 = true;
                                        do {
                                            int number = requestInput();
                                
                                            switch(number) {
                                                case 1 :{
                                                    checker5 = true;
                                                    Main.animation(texte.storyA1, 25);
                                                    Main.animation(texte.choose, 25);
                                                    Main.animation(texte.storyA1A, 25);

                                                    //kol = knife or lantern
                                                    int kol = requestInput();
                                                    if (kol == 1) {
                                                        Weapon knife = new Weapon("Messer", "knife", 5);
                                                        player.getInventory().add(knife);

                                                        Main.animation(texte.storyA1B, 25);
                                                    }
                                                    else if (kol == 2) {
                                                        Item lantern = new Item("Laterne");
                                                        player.getInventory().add(lantern);

                                                        Main.animation(texte.storyA1C, 25);
                                                    }
                                
                                                    Main.animation(texte.storyA2, 25);
                                                    continue1();
                                
                                                    break;
                                                }
                                                case 2: {
                                                    checker5 = true;
                                                    Main.animation(texte.storyB1, 25);
                                                    Main.animation(texte.choose, 25);
                                                    Main.animation(texte.storyB2, 25);
                                            
                                                    boolean checker6 = false;
                                                    do {
                                                        if (requestInput() == 1) {
                                                            checker6 = true;
                                                            Main.animation(texte.storyB3, 25);
                                                            Main.animation(texte.choose, 25);
                                                            Main.animation(texte.storyB4, 25);
                                
                                                            boolean checker7 = false;
                                                            do {
                                                                if (requestInput() == 1) {
                                                                    checker7 = true;
                                                                    Main.animation(texte.storyB5, 25);
                                                                    Main.animation(texte.choose, 25);
                                                                    Main.animation(texte.storyB6, 25);
                                
                                                                    boolean checker8 = false;
                                                                    do {
                                                                        if (requestInput() == 1) {
                                                                            checker8 = true;
                                
                                                                            Main.animation(texte.storyB7, 25);
                                                                            Main.animation(texte.choose, 25);
                                                                            Main.animation(texte.storyB8, 25);
                                
                                                                            boolean checker9 = false;
                                                                            
                                                                            do {
                                                                                if (requestInput() == 1) {
                                                                                    checker9 = true;
                                                                                    Main.animation(texte.storyB9, 25);
                                                                                    Main.animation(texte.choose, 25);
                                                                                    Main.animation(texte.storyB10, 25);
                                
                                                                                    boolean checker10 = false;
                                
                                                                                    do {
                                                                                        if (requestInput() == 1) {
                                                                                            checker10 = true;
                                
                                                                                            Main.animation(texte.storyB11, 25);
                                                                                            
                                                                                            Item lantern = new Item();
                                                                                            lantern.setType("Laterne");
                                                                                            Weapon knife = new Weapon();
                                                                                            knife.setType("knfie");
                                                                                            knife.setDamage(5);
                                                                                            knife.setName("Messer");

                                                                                            player.getInventory().add(lantern);
                                                                                            player.getInventory().add(knife);
                                
                                                                                            Main.animation(texte.choose, 25);
                                                                                            Main.animation(texte.storyB12, 25);
                                
                                                                                            boolean checker11 = false;
                                
                                                                                            do {
                                                                                                if (requestInput() == 1) {
                                                                                                    Main.animation(texte.storyB13, 25);
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
        Main.animation(texte.storyC1, 25);
        Main.animation(texte.choose, 25);
        Main.animation(texte.storyC2, 25);

        boolean checker1 = false;
        do {
            if (requestInput() == 1) {
                Main.animation(texte.storyC3, 25);
                Main.animation(texte.choose, 25);
                Main.animation(texte.storyC4, 25);

                boolean checker2 = false;

                do {
                    int number = requestInput();
                    switch(number) {
                        case 1: {
                            checker2 = true;
                            Item lantern = new Item();
                            lantern.setType("Laterne");

                            if (player.getInventory().contains(lantern)) {
                                Main.animation(texte.storyD1, 25);
                            }
                            else {
                                Main.animation(texte.storyD2, 25);
                                player.setHealth(player.getHealth() - 5);
                            }

                            continue2();

                            break;
                        }
                        case 2: {
                            checker2 = true;
                            Main.animation(texte.storyE1, 25);

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
            Main.animation(texte.storyF1, 25);
            Main.animation(texte.choose, 25);
            Main.animation(texte.storyG2, 25);

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
                        Main.animation(texte.storyG1, 25);
                    }
                    else {
                        Main.animation(texte.storyG2, 25);
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
            Main.animation(texte.storyG4, 25);
            Main.animation(texte.choose, 25);
            Main.animation(texte.storyG5, 25);

            boolean checker = false;
            do {
                if (requestInput() == 1) {
                    checker = true;

                    Main.animation(texte.storyG6, 25);
                    
                    Weapon bow = new Weapon("Bogen", "bow", 10);
                    player.getInventory().add(bow);

                    Main.animation(texte.choose, 25);
                    Main.animation(texte.storyG7, 25);

                    boolean checker1 = false;
                    do {
                        if (requestInput() == 1) {
                            checker1 = true;

                            Main.animation(texte.storyG8, 25);
                            Main.animation(texte.choose, 25);
                            Main.animation(texte.storyG9, 25);

                            boolean checker2 = false;
                            do {
                                if (requestInput() == 1) {
                                    Main.animation(texte.storyG10, 25);
                                    
                                    Food apple = new Food();
                                    apple.setHeal(true);
                                    apple.setType("Apfel");
                                    apple.setSaturation(10);
                                    apple.setHealingFactor(20);
                                    apple.setPrice(20);

                                    Shop shop = new Shop();
                                    shop.addItem(apple);
                                    shop.startSelling(player);

                                    Main.animation(texte.storyG11, 25);
                                    Main.animation(texte.choose, 25);
                                    Main.animation(texte.storyG12, 25);

                                    boolean checker3 = false;
                                    do {
                                        if (requestInput() == 1) {
                                            checker3 = true;
                                            Main.animation(texte.storyH1, 25);
                                            Main.animation(texte.choose, 25);
                                            Main.animation(texte.storyH2, 25);

                                            boolean checker4 = false;
                                            do {
                                                if (requestInput() == 1) {
                                                    checker4 = true;
                                                    Main.animation(texte.storyH3, 25);
                                                    Main.animation(texte.choose, 25);
                                                    Main.animation(texte.storyH4, 25);

                                                    boolean checker5 = false;
                                                    do {
                                                        if (requestInput() == 1) {
                                                            continue3();
                                                        }
                                                    } while (checker5 == false);
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

    public void continue3() {
        if (!fightsDone.contains(1)) {
            Main.animation(texte.storyH5, 25);

            Enemy meerjungfrau = new Enemy("Meerjungfrau", 50);
            Weapon dreizack = new Weapon("Dreizack", "trident", 10);
            meerjungfrau.addWeapon(dreizack);
    
            fightsDone.add(1);
            Fight fight = new Fight(player, meerjungfrau, "einer", "die");
            fight.startFight(this);
        }
        else {
            Main.animation(texte.storyH6, 25);
            Main.animation(texte.choose, 25);
            Main.animation(texte.storyH7, 25);

            boolean checker = false;
            do {
                if (requestInput() == 1) {
                    checker = true;
                    Main.animation(texte.storyH8, 25);
                    Main.animation(texte.choose, 25);
                    Main.animation(texte.storyH9, 25);

                    boolean checker1 = false;
                    do {
                        if (requestInput() == 1) {
                            checker1 = true;
                            Main.animation(texte.storyH10, 25);
                            Main.animation(texte.choose, 25);
                            Main.animation(texte.storyH11, 25);

                            boolean checker2 = false;
                            do {
                                if (requestInput() == 1) {
                                    checker2 = true;
                                    Main.animation(texte.storyH12, 25);

                                    boolean hasLantern = false;
                                    for (Item item : player.getInventory()) {
                                        if (item.getType().equals("Laterne")) {
                                            hasLantern = true;
                                        }
                                    }
                                    if (hasLantern == true) {
                                        Main.animation(texte.storyH13B, 25);
                                    }
                                    else {
                                        Main.animation(texte.storyH13A, 25);
                                        player.setHealth(player.getHealth() - 10);
                                    }

                                    Main.animation(texte.storyI1, 25);
                                    Main.animation(texte.choose, 25);
                                    Main.animation(texte.storyI2, 25);

                                    boolean checker3 = false;
                                    do {
                                        if (requestInput() == 1) {
                                            checker3 = true;
                                            Main.animation(texte.storyI3, 25);
                                            Main.animation(texte.storyI4, 25);
                                            Main.animation(texte.choose, 25);
                                            Main.animation(texte.storyI5, 25);

                                            boolean checker4 = false;
                                            do {
                                                if (requestInput() == 1) {
                                                    Main.animation(texte.storyI6, 25);
                                                    Main.animation(texte.storyJ1, 25);
                                                    Main.animation(texte.choose, 25);
                                                    Main.animation(texte.storyJ2, 25);

                                                    boolean checker5 = false;
                                                    do {
                                                        if (requestInput() == 1) {
                                                            Main.animation(texte.storyJ3, 25);
                                                            Main.animation(texte.choose, 25);
                                                            Main.animation(texte.storyJ4, 25);

                                                            boolean checker6 = false;
                                                            do {
                                                                if (requestInput() == 1) {
                                                                    checker6 = true;
                                                                    Main.animation(texte.storyJ5, 25);
                                                                    Main.animation(texte.choose, 25);
                                                                    Main.animation(texte.storyJ6, 25);

                                                                    boolean checker7 = false;
                                                                    do {
                                                                        if (requestInput() == 1) {
                                                                            checker7 = true;
                                                                            Main.animation(texte.storyJ7, 25);
                                                                            Main.animation(texte.choose, 25);
                                                                            Main.animation(texte.storyJ8, 25);

                                                                            boolean checker8 = false;
                                                                            do {
                                                                                if (requestInput() == 1) {
                                                                                    checker8 = true;
                                                                                    Main.animation(texte.storyJ9, 25);

                                                                                    Enemy diener = new Enemy("Diener", 30);
                                                                                    Weapon fist = new Weapon("Faust", "fist", 4);
                                                                                    diener.addWeapon(fist);
                                                                                    Fight fight = new Fight(player, diener, "der", "der");
                                                                                    fight.startFight(this);

                                                                                    Main.animation(texte.storyJ10, 25);
                                                                                    Main.animation(texte.choose, 25);
                                                                                    Main.animation(texte.storyJ11, 25);

                                                                                    boolean checker9 = false;
                                                                                    do {
                                                                                        int input = requestInput();
                                                                                        if (input == 1) {
                                                                                            checker9 = true;
                                                                                            Main.animation(texte.storyJ12A, 25);
                                                                                        }
                                                                                        else if (input == 2) {
                                                                                            checker9 = true;
                                                                                            Main.animation(texte.storyJ12B, 25);
                                                                                            player.setHealth(player.getHealth() + 25);
                                                                                        }
                                                                                        Main.animation(texte.choose, 25);
                                                                                        Main.animation(texte.storyJ13, 25);

                                                                                        boolean checker10 = false;
                                                                                        do {
                                                                                            if (requestInput() == 1) {
                                                                                                checker10 = true;
                                                                                                Main.animation(texte.storyJ14, 25);
                                                                                                Main.animation(texte.choose, 25);
                                                                                                Main.animation(texte.storyJ15, 25);

                                                                                                boolean checker11 = false;
                                                                                                do {
                                                                                                    if (requestInput() == 1) {
                                                                                                        checker11 = true;
                                                                                                        Main.animation(texte.storyJ16, 25);
                                                                                                        Main.animation(texte.choose, 25);
                                                                                                        Main.animation(texte.storyJ17, 25);

                                                                                                        boolean checker12 = false;
                                                                                                        do {
                                                                                                            if (requestInput() == 1) {
                                                                                                                checker12 = true;
                                                                                                                Main.animation(texte.storyJ18, 25);
                                                                                                                Main.animation(texte.choose, 25);
                                                                                                                Main.animation(texte.storyJ19, 25);

                                                                                                                boolean checker13 = false;
                                                                                                                do {
                                                                                                                    if (requestInput() == 1) {
                                                                                                                        Main.animation(texte.storyJ20, 25);
                                                                                                                        Main.animation(texte.choose, 25);
                                                                                                                    }
                                                                                                                } while(checker13 == false);
                                                                                                            }
                                                                                                        } while(checker12 == false);
                                                                                                    }
                                                                                                } while(checker11 == false);
                                                                                            }
                                                                                        } while(checker10 == false);

                                                                                    } while(checker9 == false);
                                                                                }
                                                                            } while(checker8 == false);
                                                                        }
                                                                    } while(checker7 == false);
                                                                }
                                                            } while(checker6 == false);
                                                        }
                                                    } while (checker5 == false);
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