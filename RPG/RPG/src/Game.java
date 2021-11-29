import java.util.Scanner;

public class Game {
    Fight fight;
    boolean fighting = false;

    //starts the game
    public void startGame(Game game) {
        Player player = new Player();
        
        Main.animation("#########################\n", 25);
        Main.animation("Willkommen in unserem Spiel\n"
        + "Gebe 0 ein um das Inventar aufzurufen\n", 20);
        Main.animation("#########################\n", 25);
        
        requestInput(player);
    }

    //to request Input
    public void requestInput(Player player) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        onInput(input, player);
    }

    //check if the player is fighting
    public boolean isFighting() {
        return fighting;
    }

    //on Console input
    public void onInput(int in, Player player) {
        switch(in) {
            case 0: {
                Main.printInv(player);
                break;
            }
        }
        requestInput(player);
    }
}