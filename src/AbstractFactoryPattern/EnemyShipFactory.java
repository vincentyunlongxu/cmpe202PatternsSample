package AbstractFactoryPattern;

/**
 * Created by yunlongxu on 12/11/15.
 */
public interface EnemyShipFactory {
    public ESWeapon addESGun();
    public ESEngine addESEngine();
}
