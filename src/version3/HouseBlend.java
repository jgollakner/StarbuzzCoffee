package version3;

/**
 * A Beverage implementation.
 * 
 * @author Head First Design Patterns
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend";
    }

    // provided implementation 
    public double cost () {
        return 0.99;
    }

}
