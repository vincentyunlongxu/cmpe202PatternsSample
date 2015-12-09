package ObserverPattern;

import java.util.ArrayList;

/**
 * Created by yunlongxu on 12/9/15.
 */
public class ConcreteSubject implements Subject {
    private ArrayList<Observer> observer;
    private double aaplPrice;
    private double ibmPrice;
    private double googPrice;

    ConcreteSubject() {
        observer = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer newObserver) {
        observer.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        int index = observer.indexOf(deleteObserver);
        observer.remove(index);
    }

    @Override
    public void notifyObserver() {
        for (Observer observers : observer) {
            observers.update(ibmPrice, aaplPrice, googPrice);
        }
    }

    public void setIBMPrice(double newIBMPrice) {
        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }

    public void setAAPLPrice(double newAAPLPrice) {
        this.aaplPrice = newAAPLPrice;
        notifyObserver();
    }

    public void setGOOGPrice(double newGOOGPrice) {
        this.googPrice = newGOOGPrice;
        notifyObserver();
    }
}
