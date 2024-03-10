

/**
 * this class is a base for combat system and other location classes for battle
 */
public abstract class BattleLocation extends Location {

    PlayerInventory inventory = new PlayerInventory();

    public BattleLocation(String locationName) {
        super(locationName);
    }

    /**
     * gets locations name and creates enemies according to location
     * shows players and enemys stats to user
     * gets input from player and attacks/flees according to it
     */
    public void attack() {
        String enemyType = getLocationName();
        Enemies enemy ;
        switch (enemyType) {
            case "Forest":
                enemy = new Wolf();
                break;
            default:
                enemy = new Wolf();
                break;
        }
        System.out.println("your stats :");
        System.out.print("health : " + getHealth());
        System.out.println(" damage : " + getDamage());
        System.out.println("---------------------------------------");
        System.out.println("enemy stats : ");
        System.out.print("health : " + enemy.getEnemyHealth());
        System.out.println(" damage : " + enemy.getEnemyDamage());
        System.out.println("---------------------------------------");
        boolean flee = false;
        while (getHealth() > 0 && enemy.getEnemyHealth() > 0 && !flee) {
            System.out.println("Press 1 to attack");
            System.out.println("Press 2 to flee");
            int decision = in.nextInt();
            switch (decision) {
                case 1:
                    enemy.setEnemyHealth(enemy.getEnemyHealth() - getDamage());
                    System.out.println("you hit, enemy health : " + enemy.getEnemyHealth());
                    setHealth(getHealth() - enemy.getEnemyDamage());
                    System.out.println("enemy hit, your health : " + getHealth());
                    break;
                case 2:
                    flee = true;
                    break;
                default:
            }
        }
    }
}
