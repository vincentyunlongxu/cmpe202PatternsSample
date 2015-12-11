package FactoryPattern;

/**
 * Created by yunlongxu on 12/11/15.
 */
public abstract class EnemyShip {
    private String name;
    private double amtDamage;

    public String getName() {return name;}
    public void setName(String newName) {
        name = newName;
    }

    public double getAmtDamage() { return amtDamage;}
    public void setAmtDamage(double newDamage) {
        amtDamage = newDamage;
    }

    public void followHeroShip() {
        System.out.println(getName() + " is following the Hero");
    }

    public void displayEnemyShip() {
        System.out.println(getName() + " is on the screen");
    }

    public void enemyShipShoots() {
        System.out.println(getName() + " attacks and does " + amtDamage + " damage to hero");
    }
}
