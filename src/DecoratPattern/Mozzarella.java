package DecoratPattern;

/**
 * Created by yunlongxu on 12/9/15.
 */
public class Mozzarella extends ToppingDecorator {
    public Mozzarella(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Dough");
        System.out.println("Adding Moz");
    }

    public String getDescription() {
        return tempPizza.getDescription() + ", mozzarella";
    }

    public double getCost() {
        System.out.println("Cost of Moz: " + 0.50);
        return tempPizza.getCost() + 0.50;
    }
}
