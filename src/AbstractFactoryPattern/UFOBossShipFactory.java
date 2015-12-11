package AbstractFactoryPattern;

/**
 * Created by yunlongxu on 12/11/15.
 */
public class UFOBossShipFactory implements EnemyShipFactory {
    @Override
    public ESWeapon addESGun() {
        return new ESUFOBossGun();
    }

    @Override
    public ESEngine addESEngine() {
        return new ESUFOBossEngine();
    }
}
