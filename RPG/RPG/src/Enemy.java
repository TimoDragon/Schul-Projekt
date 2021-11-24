import java.util.ArrayList;

public class Enemy {
    private String name;
    private ArrayList<Item> weapons = new ArrayList<Item>();
    private int health = 100;
    private int resistance = 10;
    private int damage = 10;

    //set the enemy Name
    public void setName(String in) {
        name = in;
    }

    //get the enemy Name
    public String getName() {
        return name;
    }

    //get the enemy Health
    public int getHealth() {
       return health;
    }

    //set the enemy Health
    public void setHealth(int i) {
        health = i;
    }
 
    //get the enemy resistance
    public int getResistance() {
        return resistance;
    }
 
    //set the enemy resistance
    public void setResistance(int i) {
        resistance = i;
    }
 
    //get the enemy Damage
    public int getDamage() {
        return damage;
    }
 
    //set the enemy Damage
    public void setDamage(int i) {
        damage = i;
    }

    //get the weapon ArrayList
    public ArrayList<Item> getWeapons() {
        return weapons;
    }

    //add a weapon
    public void addWeapon() {
        
    }
}