package assignment5_000944693;

/**
 * @author Ashutosh Vyas
 */
public class GroceryStore extends Building implements Profitable{
        private double yearlyProfit;

    /**
     * @param name
     * @param street
     * @param yearlyProfit
     */
    public GroceryStore(String name, String street, double yearlyProfit) {
        super(name, street);
        this.yearlyProfit = yearlyProfit;
    }

    /**
     * @param GroceryStorename
     * @param GroceryStorestreet
     * @param yearlyProfit
     * @return
     */
    public static GroceryStore create(String GroceryStorename, String GroceryStorestreet, double yearlyProfit) {
            return new GroceryStore(GroceryStorename,GroceryStorestreet, yearlyProfit);
    }

    /**
     * @return String
     */
    public String toString() {
        return String.format("%nGrocery Store: Yearly profit = %.2f",yearlyProfit);
    }

    /**
     * @return yearly profit
     */
    @Override
    public double getYearlyProfit() {
        return yearlyProfit;
    }
}
