package CommandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yunlongxu on 12/9/15.
 */
public class PlayWithRemote {
    public static void main(String[] args) {
        ElectronicDevice electronicDevice = TVRemote.getDevice();
        TurnTVOn onCommand = new TurnTVOn(electronicDevice);
        DeviceButton onPressed = new DeviceButton(onCommand);
        onPressed.press();

        TurnTVOff offCommand = new TurnTVOff(electronicDevice);
        onPressed = new DeviceButton(offCommand);
        onPressed.press();

        TurnTVUp upCommand = new TurnTVUp(electronicDevice);
        onPressed = new DeviceButton(upCommand);
        onPressed.press();

        onPressed.press();
        onPressed.press();
        onPressed.press();

        // Creating a TV and Radio to turn off with 1 press
        Television tv = new Television();
        Radio radio = new Radio();

        List<ElectronicDevice> allDevices = new ArrayList<ElectronicDevice>();
        allDevices.add(tv);
        allDevices.add(radio);

        TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);
        DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
        turnThemOff.press();
        turnThemOff.pressUndo();
    }
}
