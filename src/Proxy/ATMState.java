package Proxy;

/**
 * Created by yunlongxu on 12/10/15.
 */
public interface ATMState {
    void insertCard();
    void ejectCard();
    void insertPin(int pinEntered);
    void requestCash(int cashToWithdraw);
}
