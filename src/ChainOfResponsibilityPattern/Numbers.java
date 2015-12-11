package ChainOfResponsibilityPattern;

/**
 * Created by yunlongxu on 12/11/15.
 */
public class Numbers {
    private int number1;
    private int number2;
    private String calMethod;

    public Numbers(int number1, int number2, String calMethod) {
        this.number1 = number1;
        this.number2 = number2;
        this.calMethod = calMethod;
    }

    public int getNumber1() {return number1;}
    public int getNumber2() {return number2;}
    public String getCalMethod() {return calMethod;}
}
