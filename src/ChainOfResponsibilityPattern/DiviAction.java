package ChainOfResponsibilityPattern;

/**
 * Created by yunlongxu on 12/11/15.
 */
public class DiviAction implements Chain {

    Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        nextInChain = nextChain;
    }

    @Override
    public void calculation(Numbers request) {
        if (request.getCalMethod() == "DIV") {
            System.out.println(request.getNumber1() + " / " + request.getNumber2() + " = " + (request.getNumber1() / request.getNumber2()));
        } else {
            System.out.println("ONLY ADD / SUB / MULTI / DIV methods are available!");
        }
    }
}
