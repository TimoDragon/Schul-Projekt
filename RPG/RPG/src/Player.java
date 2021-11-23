import java.util.ArrayList;

public  class Player {
    private ArrayList<Item> inventory = new ArrayList<Item>();
    private int health = 100;

    //get the Player Inventory
    public ArrayList<Item> getInventory() {
        return inventory;
    }

    //get the Item from a specific slot
    public Item getInventorySlot(int position) {
        Item invSlot = inventory.get(position);

        return invSlot;
    }

    //add an Item in the Inventory
    public void addItem(Item item, int amount) {
        for (int i = 0; i < amount; i++) {
            inventory.add(item);
        }
    }

    //removes an Item from the Inventory
    public void removeItem(Item item, int amount) {
        if (getInventory().contains(item)) {
            int oldAmount = 0;
            for (int i = 0; i < inventory.size(); i++) {
                if (inventory.get(i).equals(item)) {
                    oldAmount = oldAmount + 1;
                }
            }

            int newAmount = oldAmount - amount;
            if (newAmount > 0) {
                int removed = 0;
                for (int i = 0; i < inventory.size(); i++) {
                    if (inventory.get(i).equals(item) && removed <= newAmount) {
                        removed = removed + 1;
                        inventory.remove(i);
                    }
                }
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