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
                                                                                                                        Main.animation(texte.storyJ21, 25);

                                                                                                                        boolean checker14 = false;
                                                                                                                        do {
                                                                                                                            if (requestInput() == 1) {
                                                                                                                                checker14 = true;
                                                                                                                                Main.animation(texte.storyJ22, 25);
                                                                                                                                Main.animation(texte.choose, 25);
                                                                                                                                Main.animation(texte.storyJ23, 25);

                                                                                                                                boolean checker15 = false;
                                                                                                                                do {
                                                                                                                                    if (requestInput() == 1) {
                                                                                                                                        checker15 = true;
                                                                                                                                        Main.animation(texte.storyJ24, 25);
                                                                                                                                        Main.animation(texte.storyJ25, 25);
                                                                                                                                        Main.animation(texte.choose, 25);
                                                                                                                                        Main.animation(texte.storyJ26, 25);

                                                                                                                                        boolean checker16 = false;
                                                                                                                                        do {
                                                                                                                                            if (requestInput() == 1) {
                                                                                                                                                checker16 = true;
                                                                                                                                                Main.animation(texte.storyJ27, 25);
                                                                                                                                                Main.animation(texte.choose, 25);
                                                                                                                                                Main.animation(texte.storyJ28, 25);
        
                                                                                                                                                boolean checker17 = false;
                                                                                                                                                do {
                                                                                                                                                    if (requestInput() == 1) {
                                                                                                                                                        checker17 = true;
                                                                                                                                                        Main.animation(texte.storyJ29, 25);
                                                                                                                                                        Main.animation(texte.choose, 25);
                                                                                                                                                        Main.animation(texte.storyJ30, 25);
                
                                                                                                                                                        boolean checker18 = false;
                                                                                                                                                        do {
                                                                                                                                                            if (requestInput() == 1) {
                                                                                                                                                                checker18 = true;
                                                                                                                                                                Main.animation(texte.storyJ31, 25);
                                                                                                                                                                Main.animation(texte.storyJ32, 25);
                                                                                                                                                                Main.animation(texte.choose, 25);
                                                                                                                                                                Main.animation(texte.storyJ33, 26);

                                                                                                                                                                boolean checker19 = false;
                                                                                                                                                                do {
                                                                                                                                                                    if (requestInput() == 1) {
                                                                                                                                                                        continue4();
                                                                                                                                                                    }
                                                                                                                                                                } while(checker19 == false);                                                                                                                                                            }
                                                                                                                                                        } while(checker18 == false);
                                                                                                                                                    }
                                                                                                                                                } while(checker17 == false);
                                                                                                                                            }
                                                                                                                                        } while(checker16 == false);
                                                                                                                                    }
                                                                                                                                } while(checker15 == false);
                                                                                                                            }
                                                                                                                        } while(checker14 == false);
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

    public void continue4() {
        Main.animation(texte.storyJ34, 25);
        Main.animation(texte.choose, 25);
        Main.animation(texte.storyJ35, 25);

        boolean checker = false;
        do {
            if (requestInput() == 1) {
                checker = true;
                Main.animation(texte.storyJ36, 25);
                Main.animation(texte.choose, 25);
                Main.animation(texte.storyJ37, 25);

                boolean checker1 = false;
                do {
                    if (requestInput() == 1) {
                        checker1 = true;
                        Main.animation(texte.storyJ38, 25);
                        Main.animation(texte.choose, 25);
                        Main.animation(texte.storyJ39, 25);

                        boolean checker2 = false;
                        do {
                            if (requestInput() == 1) {
                                checker2 = true;
                                Main.animation(texte.storyJ40, 25);
                                Main.animation(texte.choose, 25);
                                Main.animation(texte.storyJ41, 25);

                                boolean checker3 = false;
                                do {
                                    if (requestInput() == 1) {
                                        checker3 = true;
                                        Main.animation(texte.storyJ42, 25);
                                        Main.animation(texte.choose, 25);
                                        Main.animation(texte.storyJ43, 25);

                                        boolean checker4 = false;
                                        do {
                                            if (requestInput() == 1) {
                                                checker4 = true;
                                                Main.animation(texte.storyJ44, 25);
                                                Main.animation(texte.choose, 25);
                                                Main.animation(texte.storyJ45, 25);

                                                boolean checker5 = false;
                                                do {
                                                    if (requestInput() == 1) {
                                                        checker5 = true;
                                                        Main.animation(texte.storyJ46, 25);
                                                        Main.animation(texte.choose, 25);
                                                        Main.animation(texte.storyJ47, 25);
                                                        
                                                        boolean checker6 = false;
                                                        do {
                                                            if (requestInput() == 1) {
                                                                checker6 = true;
                                                                Main.animation(texte.storyJ48, 25);
                                                                Main.animation(texte.storyJ49, 25);
                                                                Main.animation(texte.choose, 25);
                                                                Main.animation(texte.storyJ50, 25);
                                                                Main.animation(texte.storyJ50B, 25);

                                                                boolean checker7 = false;
                                                                do {
                                                                    int input = requestInput();
                                                                    if (input == 1) {
                                                                        Main.animation(texte.storyJ51A, 25);
                                                                    } else if (input == 2) {
                                                                        Main.animation(texte.storyJ52, 25);
                                                                        checker7 = true;

                                                                        Main.animation(texte.storyJ53, 25);
                                                                        Main.animation(texte.choose, 25);
                                                                        Main.animation(texte.storyJ54, 25);

                                                                        boolean checker8 = false;
                                                                        do {
                                                                            if (requestInput() == 1) {
                                                                                checker8 = true;
                                                                                Main.animation(texte.storyJ55, 25);
                                                                                Main.animation(texte.choose, 25);
                                                                                Main.animation(texte.storyJ56, 25);

                                                                                boolean checker9 = false;
                                                                                do {
                                                                                    if (requestInput() == 1) {
                                                                                        Main.animation(texte.storyJ57, 25);
                                                                                        Main.animation(texte.storyJ58, 25);
                                                                                        Main.animation(texte.choose, 25);
                                                                                        Main.animation(texte.storyJ59, 25);

                                                                                        boolean checker10 = false;
                                                                                        do {
                                                                                            if (requestInput() == 1) {
                                                                                                checker10 = true;
                                                                                                Main.animation(texte.storyJ60, 25);
                                                                                                Main.animation(texte.choose, 25);
                                                                                                Main.animation(texte.storyJ61, 25);

                                                                                                boolean checker11 = false;
                                                                                                do {
                                                                                                    if (requestInput() == 1) {
                                                                                                        checker11 = true;
                                                                                                        Main.animation(texte.storyJ62, 25);
                                                                                                        Main.animation(texte.choose, 25);
                                                                                                        Main.animation(texte.storyJ63, 25);

                                                                                                        boolean checker12 = false;
                                                                                                        do {
                                                                                                            if (requestInput() == 1) {
                                                                                                                checker12 = true;
                                                                                                                Main.animation(texte.storyJ63B, 25);
                                                                                                                Main.animation(texte.choose, 25);
                                                                                                                Main.animation(texte.storyJ64, 25);

                                                                                                                boolean checker13 = false;
                                                                                                                do {
                                                                                                                    if (requestInput() == 1) {
                                                                                                                        Main.animation(texte.storyJ65, 25);
                                                                                                                        Main.animation(texte.choose, 25);
                                                                                                                        Main.animation(texte.storyJ65A, 25);
                                                                                                                        Main.animation(texte.storyJ65B, 25);

                                                                                                                        boolean checker14 = false;
                                                                                                                        do {
                                                                                                                            int input2 = requestInput();
                                                                                                                            if (input2 == 1) {
                                                                                                                                checker14 = true;
                                                                                                                                Main.animation(texte.storyJ66A, 25);
                                                                                                                            }
                                                                                                                            else if (input2 == 2) {
                                                                                                                                checker14 = true;
                                                                                                                                Main.animation(texte.storyJ66B, 25);
                                                                                                                                Main.animation(texte.choose, 25);
                                                                                                                                Main.animation(texte.storyJ66B1, 25);

                                                                                                                                boolean checker15 = false;
                                                                                                                                do {
                                                                                                                                    if (requestInput() == 1) {
                                                                                                                                        checker15 = true;
                                                                                                                                        Main.animation(texte.storyJ66B2, 25);
                                                                                                                                        Main.animation(texte.choose, 25);
                                                                                                                                        Main.animation(texte.storyJ66B3, 25);

                                                                                                                                        boolean checker16 = false;
                                                                                                                                        do {
                                                                                                                                            if (requestInput() == 1) {
                                                                                                                                                checker16 = true;
                                                                                                                                                Main.animation(texte.storyJ66B4, 25);
                                                                                                                                                Main.animation(texte.choose, 25);
                                                                                                                                                Main.animation(texte.storyJ66B5, 25);
                                                                                                                                                
                                                                                                                                                boolean checker17 = false;
                                                                                                                                                do {
                                                                                                                                                    if (requestInput() == 1) {
                                                                                                                                                        checker17 = true;
                                                                                                                                                        Main.animation(texte.storyJ66B6, 25);
                                                                                                                                                        Main.animation(texte.choose, 25);
                                                                                                                                                        Main.animation(texte.storyJ66B7, 25);

                                                                                                                                                        boolean checker18 = false;
                                                                                                                                                        do {
                                                                                                                                                            if (requestInput() == 1) {
                                                                                                                                                                checker18 = true;
                                                                                                                                                                Main.animation(texte.storyJ66B8, 25);
                                                                                                                                                                Main.animation(texte.choose, 25);
                                                                                                                                                                Main.animation(texte.storyJ66B9, 25);

                                                                                                                                                                boolean checker19 = false;
                                                                                                                                                                do {
                                                                                                                                                                    if (requestInput() == 1) {
                                                                                                                                                                        checker19 = true;
                                                                                                                                                                        Main.animation(texte.storyJ66B10, 25);
                                                                                                                                                                        Main.animation(texte.choose, 25);
                                                                                                                                                                        Main.animation(texte.storyJ66B11, 25);

                                                                                                                                                                        boolean checker20 = false;
                                                                                                                                                                        do {
                                                                                                                                                                            if (requestInput() == 1) {
                                                                                                                                                                                checker20 = true;
                                                                                                                                                                                Main.animation(texte.storyJ66B12, 25);
                                                                                                                                                                                Main.animation(texte.choose, 25);
                                                                                                                                                                                Main.animation(texte.storyJ67, 25);
                                                                                                                                                                                
                                                                                                                                                                                boolean checker21 = false;
                                                                                                                                                                                do {
                                                                                                                                                                                    if (requestInput() == 1) {
                                                                                                                                                                                        checker21 = true;
                                                                                                                                                                                        Main.animation(texte.storyJ68, 25);
                                                                                                                                                                                        Main.animation(texte.choose, 25);
                                                                                                                                                                                        Main.animation(texte.storyJ69, 25);

                                                                                                                                                                                        boolean checker22 = false;
                                                                                                                                                                                        do {
                                                                                                                                                                                            if (requestInput() == 1) {
                                                                                                                                                                                                checker22 = true;
                                                                                                                                                                                                Main.animation(texte.storyJ70, 25);
                                                                                                                                                                                            }
                                                                                                                                                                                        } while(checker22 == false);
                                                                                                                                                                                    }
                                                                                                                                                                                } while(checker21 == false);
                                                                                                                                                                            }
                                                                                                                                                                        } while(checker20 == false);
                                                                                                                                                                    }
                                                                                                                                                                } while(checker19 == false);
                                                                                                                                                            }
                                                                                                                                                        } while(checker18 == false);
                                                                                                                                                    }
                                                                                                                                                } while(checker17 == false);
                                                                                                                                            }
                                                                                                                                        } while(checker16 == false);
                                                                                                                                    }
                                                                                                                                } while(checker15 == false);
                                                                                                                            }
                                                                                                                        } while(checker14 == false);
                                                                                                                    }
                                                                                                                } while(checker13 == false);
                                                                                                            }
                                                                                                        } while(checker12 == false);
                                                                                                    }
                                                                                                } while(checker11 == false);
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
                                                    }
                                                } while (checker5 == false);
                                            }
                                        } while(checker4 == false);
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