package version3;

/**
 * A decorator IS A Beverage. But it needs a beverage component to "decorate".
 * Note that this abstract class doesn't provide that, although it could.
 * 
 * @author Head First Design Patterns
 */
public abstract class CondimentDecorator extends Beverage {
    
    /*
     * Even though we are inheriting an implementation from
     * Beverage, we need to MANDATE that this method gets overridden
     * by the decorator implementations so that the decorator adds to the 
     * description of the beverage. Without this declaration, the sub classes
     * would not be required to do this.
     */
    public abstract String getDescription();
}
