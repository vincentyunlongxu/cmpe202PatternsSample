package CommandPattern;

/**
 * Created by yunlongxu on 12/9/15.
 */
public class TurnTVOn implements Command {

    ElectronicDevice theDevice;

    public TurnTVOn(ElectronicDevice electronicDevice) {
        theDevice = electronicDevice;
    }

    @Override
    public void execute() {
        theDevice.on();
    }

    @Override
    public void undo() {
        theDevice.off();
    }
}
