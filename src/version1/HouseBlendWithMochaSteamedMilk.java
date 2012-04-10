package version1;

/**
 *
 * @author Head First Design Patterns
 */
public class HouseBlendWithMochaSteamedMilk extends Beverage {

    public HouseBlendWithMochaSteamedMilk() {
        this.setDescription("House Blend With Mocha and Steamed Milk");
    }

    @Override
    public double cost() {
        return 1.49;
    }

}
