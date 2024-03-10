import java.util.Scanner;

/**
 * this class creates game
 */
public class Game {
    Scanner in = new Scanner(System.in);

    /**
     * gets inputs from user and calls other methods to play the game
     */
    public void play(){
        PlayerInventory inventory = new PlayerInventory();
        while (!inventory.isTrophy()){
            System.out.println("Choose a place to go :");
            System.out.println("1 -------> Battle Zones");
            System.out.println("1 -------> Safe Places");
            int decision = in.nextInt();
            switch (decision){
                case 1:
                    BattleLocation locationunsafe;
                    System.out.println("choose a place to go :");
                    System.out.println("1 -------> Forest");
                    int battleZoneDesicion = in.nextInt();
                    switch (battleZoneDesicion){
                        case 1:
                            locationunsafe = new Forest("Forest");
                            locationunsafe.attack();
                            break;
                        default:
                           // locationunsafe = new Forest("Forest");
                           // locationunsafe.attack();
                            break;
                    }
                    break;
                case 2:
                    SafeLocation locationsafe;
                    System.out.println("choose a place to go :");
                    System.out.println("1 -------> Safe House");
                    int safeZoneDesicion = in.nextInt();
                    switch (safeZoneDesicion){
                        case 1:
                            locationsafe = new SafeHouse("Safe House");
                            break;
                        default:
                            locationsafe = new SafeHouse("Safe House");
                            break;
                    }
                    break;
                default:
                    break;
            }
        }

    }
}
