package CommandPattern;

/**
 * Created by yunlongxu on 12/9/15.
 */
public class TurnTVUp implements Command {

    ElectronicDevice theDevice;

    public TurnTVUp(ElectronicDevice electronicDevice) {
        theDevice = electronicDevice;
    }

    @Override
    public void execute() {
        theDevice.volumeUp();
    }

    @Override
    public void undo() {
        theDevice.volumeDown();
    }
}
