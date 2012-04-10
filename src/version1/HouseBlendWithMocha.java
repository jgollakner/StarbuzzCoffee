package version1;

/**
 *
 * @author Head First Design Patterns
 */
public class HouseBlendWithMocha extends Beverage {

    public HouseBlendWithMocha() {
        this.setDescription("House Blend With Mocha");
    }

    @Override
    public double cost() {
        return 1.30;
    }

}
