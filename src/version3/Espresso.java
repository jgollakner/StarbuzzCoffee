package version3;

/**
 * A Beverage implementation.
 * 
 * @author Head First Design Patterns
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }


    // provided implementation
    public double cost () {
        return 1.99;
    }

}
