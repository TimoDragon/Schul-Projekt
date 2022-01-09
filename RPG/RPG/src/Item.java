public class Item {
    private String type;
    private int price;

    public Item(String type) {
        this.type = type;
    }

    public Item() {
    }

    //set the Item price for the shop
    public void setPrice(int price) {
        this.price = price;
    }

    //get the item price
    public int getPrice() {
        return price;
    }

    //set the Item Type
    public void setType(String type) {
        this.type = type;
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