import java.util.Scanner;

public class Game {
    //starts the game
    public void startGame() {
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
        onInput(input, player);
        sc.close();
    }

    //on Console input
    public void onInput(int input, Player player) {
        switch(input) {
            case 0: {
                Main.printInv(player);
                break;
            }
        }
        requestInput(player);
    }
}