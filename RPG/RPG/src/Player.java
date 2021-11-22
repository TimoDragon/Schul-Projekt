import java.util.HashMap;
import java.util.LinkedHashMap;

public  class Player {
    private LinkedHashMap<String, Integer> inventory = new LinkedHashMap<String, Integer>();
    private int health = 100;

    //get the Player Inventory
    public LinkedHashMap<String, Integer> getInventory() {
        return inventory;
    }

    //get the Item from a specific slot
    public HashMap<String, Integer> getInventorySlot(int position) {
        HashMap<String, Integer> invSlot = new HashMap<String, Integer>();
        Object object = inventory.keySet().toArray()[position];
        invSlot.put(object.toString(), inventory.get(object.toString()));

        return invSlot;
    }

    //add an Item in the Inventory
    public void addItem(String item, int amount) {
        if (!getInventory().containsKey(item)) {
            getInventory().put(item, amount);
        }
        else {
            int oldAmount = getInventory().get(item);
            getInventory().replace(item, oldAmount, oldAmount + amount);
        }
    }

    //removes an Item from the Inventory
    public void removeItem(String item, int amount) {
        if (getInventory().containsKey(item)) {
            int oldAmount = getInventory().get(item);
            int newAmount = oldAmount - amount;

            if (newAmount > 0) {
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
    public int getHealth() {
        return health;
    }

    //set the Player Health
    public void setHealth(int i) {
        health = i;
    }
}