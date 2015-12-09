package StatePattern;

/**
 * Created by yunlongxu on 12/9/15.
 */
public class TestATMMachine {
    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine();
        atmMachine.insertCard();
        atmMachine.ejectCard();
        atmMachine.insertCard();
        atmMachine.insertPin(1234);
        atmMachine.requestCash(2000);
        atmMachine.insertCard();
        atmMachine.insertPin(1234);
    }
}
