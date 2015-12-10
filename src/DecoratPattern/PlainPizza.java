package DecoratPattern;

/**
 * Created by yunlongxu on 12/9/15.
 */
public class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Thin dough";
    }

    @Override
    public double getCost() {
        System.out.println("Cost of Dough: " + 4.00);
        return 4.00;
    }
}
