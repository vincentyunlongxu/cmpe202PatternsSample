package AdapterPattern;

import java.util.Random;

/**
 * Created by yunlongxu on 12/10/15.
 */

// Adaptee
public class EnemyRobot {
    Random generator = new Random();

    public void smashWithHands() {
        int attackDamage = generator.nextInt(10) + 1;
        System.out.println("Enemy Robot Causes " + attackDamage + " Damage with its hands");
    }

    public void workForward() {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy Robot Walks Forward " + movement + " spaces");
    }

    public void reactToHuman(String driverName) {
        System.out.println("Enemy Robot Tramps on " + driverName);
    }
}
