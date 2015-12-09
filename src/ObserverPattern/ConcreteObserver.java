package ObserverPattern;

/**
 * Created by yunlongxu on 12/9/15.
 */
public class ConcreteObserver implements Observer {
    private double aaplPrice;
    private double ibmPrice;
    private double googPrice;
    private Subject concreteSubject;

    public ConcreteObserver(Subject concreteSubject) {
        this.concreteSubject = concreteSubject;
        concreteSubject.register(this);
    }

    @Override
    public void update(double imbPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = imbPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;
        printPrice();
    }

    public void printPrice() {
        System.out.println("IBM: " + ibmPrice + "\n AAPL: " + aaplPrice + "\n GOOG: " + googPrice + "\n");
    }
}
