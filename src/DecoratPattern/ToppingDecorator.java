package DecoratPattern;

/**
 * Created by yunlongxu on 12/9/15.
 */
public class ToppingDecorator implements Pizza {
    protected Pizza tempPizza;

    public ToppingDecorator(Pizza newPizza) {
        tempPizza = newPizza;
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }

    @Override
    public double getCost() {
        return tempPizza.getCost();
    }
}
