package ChainOfResponsibilityPattern;

/**
 * Created by yunlongxu on 12/11/15.
 */
public class AddAction implements Chain {

    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        nextInChain = nextChain;
    }

    @Override
    public void calculation(Numbers request) {
        if (request.getCalMethod() == "ADD") {
            System.out.println(request.getNumber1() + " + " + request.getNumber2() + " = " + (request.getNumber1() + request.getNumber2()));
        } else {
            nextInChain.calculation(request);
        }
    }
}
