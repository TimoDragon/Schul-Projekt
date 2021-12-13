import java.util.ArrayList;

public class Enemy {
    private String name;
    private ArrayList<Weapon> weapons = new ArrayList<Weapon>();
    private int health = 100;
    private int resistance = 10;

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

    //get the weapon ArrayList
    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    //add a weapon
    public void addWeapon(Weapon weapon) {
        weapons.add(weapon);
    }

    //remove a weapon
    public void removeWeapon(Weapon weapon) {
        if (weapons.contains(weapon)) {
            weapons.remove(weapon);
        }
    }
}