package ChainOfResponsibilityPattern;

/**
 * Created by yunlongxu on 12/11/15.
 */
public class ChainTestClass {
    public static void main(String[] args) {
        Chain chainCalc1 = new AddAction();
        Chain chainCalc2 = new SubAction();
        Chain chainCalc3 = new MultAction();
        Chain chainCalc4 = new DiviAction();

        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);

        Numbers request = new Numbers(4, 2, "ADD");
        chainCalc1.calculation(request);

        request = new Numbers(4, 2, "ADDITION");
        chainCalc1.calculation(request);
    }
}
