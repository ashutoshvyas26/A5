package assignment5_000944693;

import java.util.Scanner;

/**
 * @author Ashutosh Vyas
 */
public class Village {
    private String name;
    private int size;
    private Building[] buildings;

    /**
     * @param name
     * @param size
     * @param numberOfBuildings
     */
    private Village(String name, int size, int numberOfBuildings) {
        this.name = name;
        this.size = size;
        this.buildings = new Building[numberOfBuildings];
    }


    /**
     * @return Village
     */
    public static Village create() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter village name: ");
        String name = scanner.nextLine();

        System.out.print("Enter village size: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        System.out.print("How many buildings do you want to add? ");
        int numBuildings = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        Village village = new Village(name, size, numBuildings);

        for (int i = 0; i < numBuildings; i++) {
            System.out.println("\nBuilding " + (i + 1) + ":");
            System.out.println("What type of building do you want to add?");
            System.out.println("1. House");
            System.out.println("2. HighRise");
            System.out.println("3. GroceryStore");
            System.out.println("4. ApartmentBuilding");
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Name of building: ");
                    String HouseName = scanner.nextLine();
                    System.out.println("Street name: ");
                    String HouseStreet = scanner.nextLine();
                    System.out.println("Number of occupants: ");
                    int HouseOccupants = scanner.nextInt();
                    System.out.println("Number of rooms: ");
                    int HouseRooms = scanner.nextInt();
                    village.buildings[i] = House.create(HouseName, HouseStreet, HouseOccupants, HouseRooms);
                    break;
                case 2:
                    System.out.println("Name of high rise: ");
                    String HighRiseName = scanner.nextLine();
                    System.out.println("Street name: ");
                    String HighRiseStreet = scanner.nextLine();
                    System.out.println("Number of floors: ");
                    int HighRiseFloors = scanner.nextInt();
                    System.out.println("Occupants per unit: ");
                    int HighRiseOccupantsPerUnit = scanner.nextInt();
                    System.out.println("Buildings per floor: ");
                    int HighRiseUnitsPerFloor = scanner.nextInt();
                    village.buildings[i] = new ApartmentBuilding(HighRiseName, HighRiseStreet, HighRiseFloors,HighRiseOccupantsPerUnit, HighRiseUnitsPerFloor);
                    break;
                case 3:
                    System.out.println("Store name: ");
                    String GroceryStoreName= scanner.nextLine();
                    System.out.println("Street name: ");
                    String GroceryStoreStreet = scanner.nextLine();
                    System.out.println("Yearly profit: ");
                    double yearlyProfit = scanner.nextDouble();
                    village.buildings[i] = GroceryStore.create(GroceryStoreName, GroceryStoreStreet,yearlyProfit);
                    break;
                case 4:
                    System.out.println("Building name: ");
                    String ApartmentBuildingName = scanner.nextLine();
                    System.out.println("Street name: ");
                    String ApartmentBuildingStreet= scanner.nextLine();
                    System.out.println("Number of floors: ");
                    int ApartmentBuildingNumberOfFloors = scanner.nextInt();
                    System.out.println("Occupants per unit: ");
                    int ApartmentBuildingOccupantsPerUnit = scanner.nextInt();
                    System.out.println("Buildings per floor: ");
                    int ApartmentBuildingUnitsPerFloor = scanner.nextInt();
                    village.buildings[i] = ApartmentBuilding.create(ApartmentBuildingName,ApartmentBuildingStreet, ApartmentBuildingNumberOfFloors,ApartmentBuildingOccupantsPerUnit,ApartmentBuildingUnitsPerFloor);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        return village;
    }

    /**
     * @return population
     */
    public int getPopulation() {
        int totalPopulation = 0;

        for (Building building : buildings) {
            if (building instanceof Inhabitable inhabitableBuilding) {
                totalPopulation += inhabitableBuilding.getNumberOfOccupants();
            }
        }

        return totalPopulation;
    }

    /**
     * @return profit
     */
    public double getProfit() {
        double totalProfit = 0.0;

        for (Building building : buildings) {
            if (building instanceof Profitable profitableBuilding) {
                totalProfit += profitableBuilding.getYearlyProfit();
            }
        }

        return totalProfit;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Village Name: ").append(name);
        System.out.println();

        for (Building building : buildings) {
            if (building != null) {
                sb.append(building.toString()).append("\n");
            }
        }
        return sb.toString();
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
        Village v = Village.create();
        System.out.println(v);
        System.out.println("Total Population: " + v.getPopulation());
        System.out.println("Total Profit: " + v.getProfit());
    }
}
