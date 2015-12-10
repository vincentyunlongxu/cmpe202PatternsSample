package CommandPattern;

/**
 * Created by yunlongxu on 12/9/15.
 */
public class TVRemote {
    public static ElectronicDevice getDevice() {
        return new Television();
    }
}
