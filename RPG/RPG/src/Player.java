import java.util.HashMap;

public  class Player {
    public static HashMap<String, Integer> inventory = new HashMap<String, Integer>();
    static int health = 100;

    //get the Player Inventory
    public static HashMap<String, Integer> getInventory() {
        return inventory;
    }

    //add an Item in the Inventory
    public static void addItem(String item, int amount) {
        if (!getInventory().containsKey(item)) {
            getInventory().put(item, 1);
        }
        else {
            int oldAmount = getInventory().get(item);
            getInventory().replace(item, oldAmount, oldAmount + amount);
        }
    }

    //removes an Item from the Inventory
    public static void removeItem(String item, int amount) {
        if (getInventory().containsKey(item)) {
            int oldAmount = getInventory().get(item);

            if (oldAmount > 0) {
                int newAmount = oldAmount - amount;
                getInventory().replace(item, oldAmount, newAmount);
            }
            else {
                getInventory().remove(item);
            }
        }
        else {
            return;
        }
    }

    //get the Player Heatlh
    public static int getHealth() {
        return health;
    }

    //set the Player Health
    public static void setHealth(int i) {
        health = i;
    }
}