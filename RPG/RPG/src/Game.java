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
                        Main.animation(Texte.story5, 25);

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