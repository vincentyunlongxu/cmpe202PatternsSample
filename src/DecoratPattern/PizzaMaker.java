package DecoratPattern;

/**
 * Created by yunlongxu on 12/9/15.
 */
public class PizzaMaker {
    public static void main(String[] args) {
        Pizza basicPizza = new TamatoSouce(new Mozzarella(new PlainPizza()));
        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Price: " + basicPizza.getCost());
    }
}
