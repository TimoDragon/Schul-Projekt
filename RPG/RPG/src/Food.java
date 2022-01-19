public class Food extends Item {
    private int saturation = 0;
    private boolean canHeal = false;
    private int healingFactor = 0;
    private String name = "";

    public Food() {
    }
    public Food(String name, int saturation) {
        this.saturation = saturation;
        this.name = name;
    }

    //get the Food saturation
    public int getSaturation() {
        return saturation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    //set the Food saturation
    public void setSaturation(int saturation) {
        this.saturation = saturation;
    }

    //check if the food can heal
    public boolean canHeal() {
        return canHeal;
    }

    public void setHeal(boolean value) {
        canHeal = value;
    }

    //set the healing factor of the food
    public void setHealingFactor(int healingFactor) {
        this.healingFactor = healingFactor;
    }

    //get the healing factor of the food
    public int getHealingFactor() {
        return healingFactor;
    }
}