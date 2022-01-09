public class Food extends Item {
    private int saturation = 0;
    private boolean canHeal = false;
    private int healingFactor = 0;

    public Food() {
    }
    public Food(int saturation) {
        this.saturation = saturation;
    }

    //get the Food saturation
    public int getSaturation() {
        return saturation;
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