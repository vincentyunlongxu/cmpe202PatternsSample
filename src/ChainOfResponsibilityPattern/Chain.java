package ChainOfResponsibilityPattern;

/**
 * Created by yunlongxu on 12/11/15.
 */
public interface Chain {
    public void setNextChain(Chain nextChain);
    public void calculation(Numbers request);
}
