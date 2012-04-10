package version2;

/**
 * 
 * @author Head First Design Patterns
 */
public abstract class Beverage {
    private String description;
    private boolean milk;
    private boolean soy;
    private boolean mocha;
    private boolean whip;

    // All these if statements create a maintenance nightmere!
    public double cost() {
        double cost = 0.00;

        if(hasMilk()) {
            cost += .10;
        }
        if(hasMocha()) {
            cost += .15;
        }
        if(hasSoy()) {
            cost += .20;
        }
        if(hasWhip()) {
            cost += .25;
        }

        return cost;
    }

    private boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    private boolean hasMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    private boolean hasSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    private boolean hasWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
