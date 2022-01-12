import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    private ArrayList<Item> items = new ArrayList<>();

    //add an Item to the shop
    public void addItem(Item item) {
        items.add(item);
    }

    //removes an Item
    public void removeItem(Item item) {
        items.remove(item);
    }

    //get all items
    public ArrayList<Item> getItems() {
        return items;
    }

    public void startSelling(Player player) {
        Main.animation("Dein Geld: " + player.getMoney() + "\n", 25);
        int itemsSize = items.size();
        for (int i = 0; i < itemsSize; i++) {
            Main.animation("(" + i + ") " + items.get(i).getType() + " | Preis: " + items.get(i).getPrice() + "\n", 10);
        }
        Main.animation("(" + itemsSize + ") um die Angebote aufzulisten\n", 25);
        itemsSize = itemsSize + 1;
        Main.animation("(" + itemsSize + ") zum Verlassen\n", 25);

        sellStuff(player);
    }

    private void sellStuff(Player player) {
        boolean checker = false;
        do {
            int input = requestInput();
            if (input == items.size()) {
                for (int i = 0; i < items.size(); i++) {
                    Main.animation("(" + i + ") " + items.get(i).getType() + " | Preis: " + items.get(i).getPrice() + "\n", 5);
                }
            }
            else if (input == items.size()+1) {
                checker = true;
                Main.animation("*Du verlässt den Laden*\n", 25);
            }
            else {
                if (input < items.size()) {
                    Item item = items.get(input);

                    if (player.getMoney() - item.getPrice() >= 0) {
                        player.setMoney(player.getMoney() - item.getPrice());
                        player.getInventory().add(item);
                        Main.animation("Du hast 1x " + item.getType() + " Gekauft.\n"
                                        + "Du kannst jetzt weiter einkaufen oder den Laden verlassen.\n"
                                        + "Dein Geld: " + player.getMoney() + "\n", 25);
                    }
                    else {
                        int missing = item.getPrice() - player.getMoney();
                        Main.animation("Du hast nicht genug Geld dir 1x " + item.getType() + " zu kaufen. Dir fehlen " + missing + " Gold.\n", 25);
                    }
                }
            }
        } while(checker == false);
    }

    private int requestInput() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        return number;
    }
}