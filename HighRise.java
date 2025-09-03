package assignment5_000944693;

/**
 * @author Ashutosh Vyas
 */
public abstract class HighRise extends Building{
    private int numberOfFloors;

    /**
     * @param name
     * @param street
     * @param numberOfFloors
     */
    public HighRise(String name, String street, int numberOfFloors) {
        super(name, street);
        this.numberOfFloors = numberOfFloors;
    }

    /**
     * @return
     */
    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    /**
     * @return String
     */
    public String toString() {
        return String.format("%nType... HighRise: numberOfFloors = %d",numberOfFloors);
    }
}

