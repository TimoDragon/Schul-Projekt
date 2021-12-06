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
        requestInput(player);

        Main.animation(Texte.prologue1, 25);
        Main.animation(Texte.prologue2, 20);
        Main.animation(Texte.prologue1, 25);
        Main.animation(Texte.randomNumber, 10);
        requestInput(player);

        Main.animation(Texte.prologue3, 20);
        boolean test1 = false;
        do {
            if (requestInput(player) == 1) {
                test1 = true;
                Main.animation(Texte.prologue4, 25);
            }
        } while(test1 == false);
    }

    public int requestInput(Player player) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }

    //check if the player is fighting
    public boolean isFighting() {
        return fighting;
    }
}