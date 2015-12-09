package StatePattern;

/**
 * Created by yunlongxu on 12/9/15.
 */
public interface ATMState {
    public void insertCard();
    public void ejectCard();
    public void insertPin(int pinEnetered);
    public void requestCash(int cashToWithdraw);
}
