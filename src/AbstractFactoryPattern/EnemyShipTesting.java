package AbstractFactoryPattern;

/**
 * Created by yunlongxu on 12/11/15.
 */
public class EnemyShipTesting {
    public static void main(String[] args) {
        EnemyShipBuilding makeUFOs = new UFOEnemeyShipBuilidng();
        EnemyShip theGrunt = makeUFOs.orderTHeShip("UFO");
        System.out.println(theGrunt + "\n");

        EnemyShip theBoss = makeUFOs.orderTHeShip("UFO BOSS");
        System.out.println(theBoss + "\n");
    }
}
