package version1;

/**
 * 
 * @author Head First Design Patterns
 */
public abstract class Beverage {
    private String description;


    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
