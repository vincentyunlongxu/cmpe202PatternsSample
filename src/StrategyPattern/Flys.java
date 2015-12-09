package StrategyPattern;

/**
 * Created by yunlongxu on 12/9/15.
 */
public interface Flys {
    String fly();
}

class ItFlys implements Flys {
    @Override
    public String fly() {
        return "Flying High";
    }
}

class CantFly implements Flys {

    @Override
    public String fly() {
        return "I can't fly";
    }
}
