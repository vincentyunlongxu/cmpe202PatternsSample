package StrategyPattern;

/**
 * Created by yunlongxu on 12/9/15.
 */
public class Bird extends Animal {
    public Bird() {
        super();
        setSound("Tweet");
        flyingType = new ItFlys();
    }
}
