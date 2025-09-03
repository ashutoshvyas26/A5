package assignment5_000944693;

/**
 * @author Ashutosh Vyas
 */
public class House extends Building implements Inhabitable{
    private int occupants;
    private int numberOfRooms;

    /**
     * @param name
     * @param street
     * @param occupants
     * @param numberOfRooms
     */
    public House(String name, String street, int occupants, int numberOfRooms) {
        super(name, street);
        this.occupants = occupants;
        this.numberOfRooms = numberOfRooms;
    }

    /**
     * @param HouseName
     * @param HouseStreet
     * @param HouseOccupants
     * @param HouseRooms
     * @return
     */
    public static House create(String HouseName, String HouseStreet, int HouseOccupants, int HouseRooms) {
        return new House(HouseName, HouseStreet, HouseOccupants, HouseRooms);
    }

    /**
     * @return String
     */
    public String toString() {
        return String.format("%nHouse: rooms = %d, Occupants = %d",numberOfRooms,occupants);
    }

    /**
     * @return number of occupants
     */
    @Override
    public int getNumberOfOccupants() {
        return occupants;
    }
}
