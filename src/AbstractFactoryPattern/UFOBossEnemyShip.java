package AbstractFactoryPattern;

/**
 * Created by yunlongxu on 12/11/15.
 */
public class UFOBossEnemyShip extends EnemyShip {
    EnemyShipFactory shipFactory;
    public UFOBossEnemyShip(EnemyShipFactory shipFactory) {
        this.shipFactory = shipFactory;
    }

    @Override
    void makeShip() {
        System.out.println("Making enemy ship " + getName());
        weapon = shipFactory.addESGun();
        engine = shipFactory.addESEngine();
    }
}
