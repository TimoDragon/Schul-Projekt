import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        startGame();

        Player.addItem("Schwert", 1);
        Player.addItem("Axt", 1);
        Player.addItem("Messer", 1);

        //for Console input
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        onInput(input);
    }

    //starts the game
    public static void startGame() {
        System.out.println("Willkommen in unserem Spiel\n"
                            + "Gebe 0 ein um das Inventar aufzurufen");
    }

    //on Console input
    public static void onInput(int input) {
        switch(input) {
            case 0: printInv();
        }
    }

    //print the Inventory in the Console
    public static void printInv() {
        if (!Player.getInventory().isEmpty()) {
            //add more here

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
    public static void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}