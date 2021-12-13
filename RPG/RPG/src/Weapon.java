public class Weapon extends Item {
    private String name;
    private int damage;
    
    //sets the weapon damage
    public void setDamage(int i) {
        damage = i;
    }

    //get the weapon damage
    public int getDamage() {
        return damage;
    }

    //sets the Name
    public void setName(String input) {
        name = input;
    }

    //get the name
    public String getName() {
        return name;
    }
}