package version3;

/**
 * The super class of all beverage implementations.
 * 
 * @author Head First Design Patterns
 */
public abstract class Beverage {
    String description = "Unknown";

    public String getDescription() {
        return description;
    }

    // beverages and decorators will implement this differently
    public abstract double cost ();
}
