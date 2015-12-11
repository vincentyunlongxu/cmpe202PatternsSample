package Proxy;

/**
 * Created by yunlongxu on 12/10/15.
 */
public class ATMProxy implements GetATMData {

    @Override
    public ATMState getAtmState() {
        ATMMachine realATMMachine = new ATMMachine();
        return realATMMachine.getAtmState();
    }

    @Override
    public int getCashInMachine() {
        ATMMachine realATMMachine = new ATMMachine();
        return realATMMachine.getCashInMachine();
    }
}
