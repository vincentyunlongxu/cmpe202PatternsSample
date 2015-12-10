package CommandPattern;

/**
 * Created by yunlongxu on 12/9/15.
 */
public class TurnTVOff implements Command {

    ElectronicDevice theDevice;

    public TurnTVOff(ElectronicDevice electronicDevice) {
        theDevice = electronicDevice;
    }

    @Override
    public void execute() {
        theDevice.off();
    }

    @Override
    public void undo() {
        theDevice.on();
    }
}
