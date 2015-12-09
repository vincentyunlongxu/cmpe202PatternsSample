package StrategyPattern;

/**
 * Created by yunlongxu on 12/9/15.
 */
public class Dog extends Animal {
    public void digHole() {
        System.out.println("Dug a hole");
    }

    public Dog() {
        super();
        setSound("Bark");
        flyingType = new CantFly();
    }
}
