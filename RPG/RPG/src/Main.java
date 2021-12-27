import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.startGame(game);
    }

    //print the Inventory in the Console
    public static void printInv(Player player) {
        if (!player.getInventory().isEmpty()) {
            String inv = "Inventar: ";
            HashMap<Item, Integer> inventory = new LinkedHashMap<Item, Integer>();

            //add code to get the Inventory

            for (int i = 0; i < player.getInventory().size(); i++) {
                Item item = player.getInventorySlot(i);

                if (inventory.containsKey(item)) {
                    int oldAmount = inventory.get(item);
                    inventory.replace(item, oldAmount, oldAmount + 1);
                }
                else {
                    inventory.put(item, 1);
                }
            }

            for (int i = 0; i < inventory.size(); i++) {
                Item item = (Item) inventory.keySet().toArray()[i];
                inv = inv + inventory.get(item) + "x " + item.getType();

                if (i < inventory.size()-1) {
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

            /*if (c == '.' || c == '!' || c == '?') {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else {
                try {
                    sleep(time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }*/
        }
    }
}