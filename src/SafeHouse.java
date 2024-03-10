public class SafeHouse extends SafeLocation{
    PlayerInventory inventory = new PlayerInventory();
    public SafeHouse(String locationName) {
        super(locationName);
        setHealth(inventory.getHealthWithItems());
        System.out.println("you are fully healed. current health : "+getHealth());
    }
}
