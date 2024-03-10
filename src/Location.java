/**
 * this class creates other location class's base
 */
public abstract class Location extends Player{
    private final String locationName;
    public Location(String locationName){
        this.locationName = locationName;
        System.out.println("you are in " + getLocationName() + " right now");
    }

    public String getLocationName() {
        return locationName;
    }

}
