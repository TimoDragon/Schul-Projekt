public class Item {
    private String type;

    //set the Item Type
    public void setType(String string) {
        type = string;
    }

    //get the Item Type
    public String getType() {
        return type;
    }

    public Weapon toWeapon() {
        Weapon weapon = (Weapon) this;
        
        return weapon;
    }
}