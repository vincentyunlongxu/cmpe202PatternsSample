package AbstractFactoryPattern;

/**
 * Created by yunlongxu on 12/11/15.
 */
public class UFOEnemeyShipBuilidng extends EnemyShipBuilding {
    @Override
    protected EnemyShip makeEnemyShip(String typeOfShip) {
        EnemyShip theEnemyShip = null;
        if (typeOfShip.equals("UFO")) {
            EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();
            theEnemyShip = new UFOEnemyShip(shipPartsFactory);
            theEnemyShip.setName("UFO Grunt Ship");
        } else {
            if (typeOfShip.equals("UFO BOSS")) {
                EnemyShipFactory shipPartsFactory = new UFOBossShipFactory();
                theEnemyShip = new UFOBossEnemyShip(shipPartsFactory);
                theEnemyShip.setName("UFO Boss Ship");
            }
        }
        return theEnemyShip;
    }
}
