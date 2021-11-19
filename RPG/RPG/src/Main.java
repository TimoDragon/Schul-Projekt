import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        startGame();

        requestInput();
    }

    //starts the game
    public static void startGame() {
        animation("#########################\n", 25);
        animation("Willkommen in unserem Spiel\n"
        + "Gebe 0 ein um das Inventar aufzurufen\n", 25);
        animation("#########################\n", 25);
    }

    //to request User Input
    public static void requestInput() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        onInput(input);
    }

    //on Console input
    public static void onInput(int input) {
        switch(input) {
            case 0: printInv();
        }

        requestInput();
    }

    //print the Inventory in the Console
    public static void printInv() {
        if (!Player.getInventory().isEmpty()) {
            String inv = "Inventar: ";
            if (!Player.getInventory().isEmpty()) {
                for (int i = 0; i < Player.getInventory().size(); i++) {
                    Object object = Player.getInventorySlot(i).keySet().toArray()[0];
                    String item = object.toString();
                    int amount = Player.getInventory().get(item);

                    inv = inv + amount + "x " + item;

                    if (i < Player.getInventory().size()-1) {
                        inv = inv + ", ";
                    }
                }
            }
            else {
                inv = "Dein Invetar ist leer";
            }

            System.out.println(inv);
        }
        else {
            System.out.println("Dein Inventar ist leer");
            return;
        }
    }

    //let the programm sleep
    public static void sleep(int time) throws InterruptedException {
        Thread.sleep(time);
    }

    //for a very fancy animation
    public static void animation(String text, int time) {
        for (char c : text.toCharArray()) {
            System.out.print(c);

            try {
                sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
