package assignment5_000944693;

/**
 * @author Ashutosh Vyas
 */
public class ApartmentBuilding extends HighRise implements Inhabitable{
    private int occupantsPerUnit;
    private int unitsPerFloor;

    /**
     * @param name
     * @param street
     * @param numberOfFloors
     * @param occupantsPerUnit
     * @param unitsPerFloor
     */
    public ApartmentBuilding(String name, String street, int numberOfFloors, int occupantsPerUnit, int unitsPerFloor) {
        super(name, street, numberOfFloors);
        this.occupantsPerUnit = occupantsPerUnit;
        this.unitsPerFloor = unitsPerFloor;
    }

    /**
     * @param ApartmentBuildingName
     * @param ApartmentBuildingStreet
     * @param ApartmentBuildingNumberOfFloors
     * @param ApartmentBuildingOccupantsPerUnit
     * @param ApartmentBuildingUnitsPerFloor
     * @return
     */
    public static ApartmentBuilding create(String ApartmentBuildingName, String ApartmentBuildingStreet, int ApartmentBuildingNumberOfFloors, int ApartmentBuildingOccupantsPerUnit, int ApartmentBuildingUnitsPerFloor) {
        return new ApartmentBuilding(ApartmentBuildingName,ApartmentBuildingStreet, ApartmentBuildingNumberOfFloors,ApartmentBuildingOccupantsPerUnit,ApartmentBuildingUnitsPerFloor);
    }

    /**
     * @return string
     */
    public String toString() {
        return String.format("%nApartment Building: Occupants per unit: %d, Units per floor: %d",occupantsPerUnit, unitsPerFloor)+super.toString();
    }

    /**
     * @return number of occupants
     */
    @Override
    public int getNumberOfOccupants() {
        return occupantsPerUnit*unitsPerFloor;
    }
}
