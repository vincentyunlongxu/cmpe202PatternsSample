package Proxy;

/**
 * Created by yunlongxu on 12/9/15.
 */
public class NoCard implements ATMState {
    ATMMachine atmMachine;

    public NoCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Please Enter Your Pin");
        atmMachine.setAtmState(atmMachine.getYesCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("Please Insert a card!");
    }

    @Override
    public void insertPin(int pinEnetered) {
        System.out.println("Please Insert a card!");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("Please Insert a card!");
    }
}
