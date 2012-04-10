package version3;

/**
 * A Decorator implementation. Notice that a decorator has a Beverage 
 * component -- that's the secret to how a decorator works -- it combines 
 * data from the component with data from itself. In this example it gets
 * the cost by adding its own, plus that of the beverage. And it gets its
 * description by combining its own with that of the beverage.
 * 
 * @author Head First Design Patterns
 */
public class Whip extends CondimentDecorator {
    // component to decorate
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // combined descrition
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost () {
        // combined cost
        return 0.2 + beverage.cost();
    }

}
