package DecoratPattern;

/**
 * Created by yunlongxu on 12/9/15.
 */
public class TamatoSouce extends ToppingDecorator {
    public TamatoSouce(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Sauce");
    }

    public String getDescription() {
        return tempPizza.getDescription() + ", tamato sauce";
    }

    public double getCost() {
        System.out.println("Cost of sauce: " + 0.35);
        return tempPizza.getCost() + 0.35;
    }
}
