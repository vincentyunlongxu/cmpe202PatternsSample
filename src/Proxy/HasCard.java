package Proxy;


/**
 * Created by yunlongxu on 12/9/15.
 */
public class HasCard implements ATMState {
    ATMMachine atmMachine;
    public HasCard(ATMMachine newAtmMachine) {
        this.atmMachine = newAtmMachine;
    }



    @Override
    public void insertCard() {
        System.out.println("You cannot insert more than one card");
    }

    @Override
    public void ejectCard() {
        System.out.println("Eject Card");
        atmMachine.setAtmState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pinEntered) {
        if (pinEntered == 1234) {
            System.out.println("Correct Pin");
            atmMachine.correctPinEntered = true;
            atmMachine.setAtmState(atmMachine.getHasPinState());
        } else {
            atmMachine.correctPinEntered = false;
            atmMachine.setAtmState(atmMachine.getNoCashState());
        }
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("Enter PIN First");
    }
}
