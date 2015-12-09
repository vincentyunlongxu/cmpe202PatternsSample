package ObserverPattern;

/**
 * Created by yunlongxu on 12/9/15.
 */
public class GrabStocks {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        ConcreteObserver concreteObserver = new ConcreteObserver(concreteSubject);

        concreteSubject.setIBMPrice(197);
        concreteSubject.setAAPLPrice(677.6);
        concreteSubject.setGOOGPrice(676.4);

    }
}
