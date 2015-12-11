package AdapterPattern;

/**
 * Created by yunlongxu on 12/10/15.
 */
public class EnemyRobotAdapter implements EnemyAttacker {

    EnemyRobot enemyRobot;

    public EnemyRobotAdapter(EnemyRobot newRobot) {
        enemyRobot = newRobot;
    }

    @Override
    public void fireWeapon() {
        enemyRobot.smashWithHands();
    }

    @Override
    public void driveForward() {
        enemyRobot.workForward();
    }

    @Override
    public void assignDriver(String driverName) {
        enemyRobot.reactToHuman(driverName);
    }
}
