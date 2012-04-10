package version2;

/**
 *
 * @author Head First Design Patterns
 */
public class Espresso extends Beverage {

    public Espresso() {
        this.setDescription("Espresso");
    }

    @Override
    public double cost() {
        return .99 + super.cost();
    }

}
