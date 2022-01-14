import java.util.ArrayList;

public  class Player {
    private ArrayList<Item> inventory = new ArrayList<Item>();
    private int health = 100;
    private int food = 100;
    private int money = 100;
    private int resitance = 0;
    private String name;

    //get the Player Inventory
    public ArrayList<Item> getInventory() {
        return inventory;
    }

    //add an Item in the Inventory
    public void addItem(Item item, int amount) {
        for (int i = 0; i < amount; i++) {
            inventory.add(item);
        }
    }

    //get money
    public int getMoney() {
        return money;
    }

    //set the money
    public void setMoney(int amount) {
        money = amount;
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
                inventory.remove(item);
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
    public void setHealth(int health) {
        this.health = health;
    }

    //get the Player food
    public int getFood() {
        return food;
    }

    //set the Player food
    public void setFood(int food) {
        this.food = food;
    }

    //set the Player resitance
    public void setResistance(int resistance) {
        this.resitance = resistance;
    }

    //get the resistance
    public int getRestistance() {
        return resitance;
    }

    //set the player name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}