public class PlayerInventory{
    private int healthPotion,manaPotion,healthWithItems,damageWithItems,wolfTooth;
    private boolean trophy;
    public PlayerInventory(){
        healthPotion=0;
        manaPotion=0;
        trophy=false;
        setHealthWithItems(50); // setHealthWithItems(50+items additional health);
        setDamageWithItems(10); // setDamageWithItems(10+ items additional damage);
    }


    public int getHealthWithItems() {
        return healthWithItems;
    }

    public void setHealthWithItems(int healthWithItems) {
        this.healthWithItems = healthWithItems;
    }

    public int getDamageWithItems() {
        return damageWithItems;
    }

    public void setDamageWithItems(int damageWithItems) {
        this.damageWithItems = damageWithItems;
    }

    public int getHealthPotion() {
        return healthPotion;
    }

    public void setHealthPotion(int healthPotion) {
        this.healthPotion = healthPotion;
    }

    public int getManaPotion() {
        return manaPotion;
    }

    public void setManaPotion(int manaPotion) {
        this.manaPotion = manaPotion;
    }

    public boolean isTrophy() {
        return trophy;
    }

    public void setTrophy(boolean trophy) {
        this.trophy = trophy;
    }
}
