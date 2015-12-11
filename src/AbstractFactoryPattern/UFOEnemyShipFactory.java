package AbstractFactoryPattern;

/**
 * Created by yunlongxu on 12/11/15.
 */
public class UFOEnemyShipFactory implements EnemyShipFactory {
    @Override
    public ESWeapon addESGun() {
        return new ESUFOGun();
    }

    @Override
    public ESEngine addESEngine() {
        return new ESUFOEngine();
    }
}
