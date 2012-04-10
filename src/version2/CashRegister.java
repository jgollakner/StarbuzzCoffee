package version2;


/**
 *
 * @author jlombardo
 */
public class CashRegister {

    public void purchaseBeverage(Beverage bev) {
        double cost = bev.cost();
        String desc = bev.getDescription();
        System.out.println("The fee for your " + desc + " is: " + cost);
    }
}
