import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Game game = new Game();
        game.startGame();
        requestInput(player);
    }

    //to request User Input
    public static void requestInput(Player player) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        onInput(input, player);
        sc.close();
    }

    //on Console input
    public static void onInput(int input, Player player) {
        switch(input) {
            case 0: {
                Main.printInv(player);
            }
        }
        requestInput(player);
    }

    //print the Inventory in the Console
    public static void printInv(Player pPlayer) {
        if (!pPlayer.getInventory().isEmpty()) {
            String inv = "Inventar: ";
                for (int i = 0; i < pPlayer.getInventory().size(); i++) {
                    Object object = pPlayer.getInventorySlot(i).keySet().toArray()[0];
                    String item = object.toString();
                    int amount = pPlayer.getInventory().get(item);

                    inv = inv + amount + "x " + item;

                    if (i < pPlayer.getInventory().size()-1) {
                        inv = inv + ", ";
                    }
                    else {
                        inv = inv + "\n";
                    }
                }

                animation(inv, 25);
        }
        else {
            animation("Dein Inventar ist leer\n", 25);
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