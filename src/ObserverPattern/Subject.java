package ObserverPattern;

/**
 * Created by yunlongxu on 12/9/15.
 */
public interface Subject {
    public void register(Observer ob);
    public void unregister(Observer ob);
    public void notifyObserver();
}
