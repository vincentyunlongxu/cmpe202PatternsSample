package CommandPattern;

import java.util.List;

/**
 * Created by yunlongxu on 12/9/15.
 */
public class TurnItAllOff implements Command {

    List<ElectronicDevice> theDevices;

    public TurnItAllOff(List<ElectronicDevice> newDevices) {
        theDevices = newDevices;
    }

    @Override
    public void execute() {
        for (ElectronicDevice device : theDevices) {
            device.off();
        }
    }

    @Override
    public void undo() {
        for (ElectronicDevice device : theDevices) {
            device.on();
        }
    }
}
