import java.util.HashMap;
import java.util.LinkedHashMap;

public  class Player {
    public static LinkedHashMap<String, Integer> inventory = new LinkedHashMap<String, Integer>();
    static int health = 100;

    //get the Player Inventory
    public static LinkedHashMap<String, Integer> getInventory() {
        return inventory;
    }

    //get the Item from a specific slot
    public static HashMap<String, Integer> getInventorySlot(int position) {
        HashMap<String, Integer> invSlot = new HashMap<String, Integer>();
        Object object = inventory.keySet().toArray()[position];
        invSlot.put(object.toString(), inventory.get(object.toString()));

        return invSlot;
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