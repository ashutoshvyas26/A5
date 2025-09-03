package assignment5_000944693;

/**
 * @author Ashutosh Vyas
 */
public abstract class Building {
    private String name;
    private String street;

    /**
     * @param name
     * @param street
     */
    public Building(String name, String street) {
        this.name = name;
        this.street = street;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @return street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @return string
     */
    public String toString() {
        return String.format("%nType...Building: Name: '%s' on Street: '%s'",name,street);
    }
}
