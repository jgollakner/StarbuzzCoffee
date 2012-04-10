package version1;

/**
 * This version represents the first attempt by Starbuzz Coffee to
 * handle beverage sales with varying beverages and condiments. The big
 * problem with this version is the explosion in the number of classes
 * needed to handle every possible combination. Worse yet, many of those
 * classes will require edits if base costs or condiment costs change.
 *
 * This version is rigid, brittle and not portable.
 *
 * @author Head First Design Patterns
 */
public class Startup {

    /**
     * @param args the command line arguments - not used
     */
    public static void main(String[] args) {
        CashRegister cr = new CashRegister();

        cr.purchaseBeverage(new HouseBlend());
        cr.purchaseBeverage(new HouseBlendWithMocha());
        cr.purchaseBeverage(new HouseBlendWithSteamedMilk());
        cr.purchaseBeverage(new HouseBlendWithMochaSteamedMilk());
    }

}
