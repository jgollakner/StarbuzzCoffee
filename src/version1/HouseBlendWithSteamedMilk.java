package version1;

/**
 *
 * @author Head First Design Patterns
 */
public class HouseBlendWithSteamedMilk extends Beverage {

    public HouseBlendWithSteamedMilk() {
        this.setDescription("House Blend With Steamed Milk");
    }

    @Override
    public double cost() {
        return 1.25;
    }

}
