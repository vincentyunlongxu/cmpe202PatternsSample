package DecoratPattern;

/**
 * Created by yunlongxu on 12/9/15.
 */
public class ThreeCheesePizza implements Pizza {
    String description = "Mozzarella, Fontina, Parmesan Cheese Pizza";
    private double cost = 10.5;

    public void setDescription(String newDescription) {
        description = newDescription;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setCost(double newCost) {
        cost = newCost;
    }

    @Override
    public double getCost() {
        return cost;
    }
}
