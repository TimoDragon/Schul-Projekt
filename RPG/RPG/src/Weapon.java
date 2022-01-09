public class Weapon extends Item {
    private String name;
    private int damage;
    
    public Weapon(String name, String type, int damage) {
        this.name = name;
        this.setType(type);
        this.damage = damage;
    }

    public Weapon() {
    }

    //sets the weapon damage
    public void setDamage(int damage) {
        this.damage = damage;
    }

    //get the weapon damage
    public int getDamage() {
        return damage;
    }

    //sets the Name
    public void setName(String name) {
        this.name = name;
    }

    //get the name
    public String getName() {
        return name;
    }
}