import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        startGame();

        //for Console input
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        onInput(input);
    }

    //starts the game
    public static void startGame() {
        System.out.println("Willkommen in unserem Spiel\n"
                            + "Gebe 0 ein um das Inventar aufzurufen");
        Player.addItem("Schwert", 1);
    }

    //on Console input
    public static void onInput(int input) {
        switch(input) {
            case 0: System.out.println(Player.getInventory());
        }
    }

    //print the Inventory in the Console
    public static void printInv() {
        if (!Player.getInventory().isEmpty()) {
            //add more here


            
        }
        else {
            System.out.println("Dein Inventar ist leer");
            return;
        }
    }

    //let the programm sleep
    public static void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
