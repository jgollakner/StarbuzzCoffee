package version2;

/**
 * This version represents the second attempt by Starbuzz Coffee to
 * handle beverage sales with varying beverages and condiments. Although
 * this version improves on the first by reducing the total number of classes,
 * it is still very rigid and brittle because the condiments are all stored
 * in the Beverage super class and any changes will require a revision of
 * this class. And some condiments may not be appropriate for new beverages
 * added in the future, such as iced tea.
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

        HouseBlend hb = new HouseBlend();
        hb.setMocha(true);
        hb.setWhip(true);
        cr.purchaseBeverage(hb);

        Espresso esp = new Espresso();
        esp.setMilk(true);
        cr.purchaseBeverage(esp);

    }

}
