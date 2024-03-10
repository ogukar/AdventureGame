/**
 * this class is for generating a base for enemies
 */
public abstract class Enemies extends BattleLocation {
    private double enemyHealth,enemyDamage;
    public Enemies(String locationName ,double enemyDamage,double enemyHealth){
        super(locationName);
        this.enemyHealth = enemyHealth;
        this.enemyDamage = enemyDamage;
    }

    public double getEnemyHealth() {
        return enemyHealth;
    }

    public void setEnemyHealth(double enemyHealth) {
        this.enemyHealth = enemyHealth;
    }

    public double getEnemyDamage() {
        return enemyDamage;
    }

    public void setEnemyDamage(double enemyDamage) {
        this.enemyDamage = enemyDamage;
    }
}
