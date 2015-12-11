package Proxy;

/**
 * Created by yunlongxu on 12/9/15.
 */
public class NoCash implements ATMState {

    ATMMachine atmMachine;

    public NoCash(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("We do not have enough money");
        System.out.println("Your card has been ejected");
    }

    @Override
    public void ejectCard() {
        System.out.println("We do not have enough money");
        System.out.println("Your card has been ejected");
    }

    @Override
    public void insertPin(int pinEnetered) {
        System.out.println("We do not have enough money");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("We do not have enough money");
    }
}
