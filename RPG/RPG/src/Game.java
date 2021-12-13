import java.util.Scanner;

public class Game {
    Fight fight;
    boolean fighting, started = false;

    //starts the game
    public void startGame(Game game) {
        Player player = new Player();

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
                                                    
                                                    Item lantern = new Item();
                                                    lantern.setType("Laterne");
                                                    Weapon knife = new Weapon();
                                                    knife.setType("Messer");
                                                    knife.setDamage(5);
                                                    knife.setName("Messer");

                                                    Main.animation(Texte.storyA2, 25);

                                                    break;
                                                }
                                                case 2: {
                                                    checker5 = true;
                                                    Main.animation(Texte.storyB1, 25);


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
    }

    public int requestInput() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }

    //check if the player is fighting
    public boolean isFighting() {
        return fighting;
    }
}