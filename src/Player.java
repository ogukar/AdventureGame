/**
 * this class initialize and sets players status
 */
public class Player extends Game{
    private boolean alive;
    private double health,money,damage,mana;
    public Player(){
        alive = true;
        damage = 10;
        mana = 10;
        health=50;
    }
    public void useItem(){

    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
