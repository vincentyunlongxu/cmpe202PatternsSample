package Proxy;

/**
 * Created by yunlongxu on 12/10/15.
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

        // new Stuff

        GetATMData realATMMachine = new ATMMachine();
        GetATMData atmProxy = new ATMProxy();
        System.out.println("\nCurrent ATM State " + atmProxy.getAtmState());
        System.out.println("\nCash in ATM Machine $" + atmProxy.getCashInMachine());
    }
}
