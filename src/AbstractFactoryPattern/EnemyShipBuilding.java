package AbstractFactoryPattern;

/**
 * Created by yunlongxu on 12/11/15.
 */
public abstract class EnemyShipBuilding {
    protected abstract EnemyShip makeEnemyShip(String typeOfShip);
    public EnemyShip orderTHeShip(String typeOfShip) {
        EnemyShip theEnemyShip = makeEnemyShip(typeOfShip);
        theEnemyShip.makeShip();
        theEnemyShip.displayEnemyShip();
        theEnemyShip.enemyShipShoots();
        return theEnemyShip;
    }
}
