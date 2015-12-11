package SingletonPattern;

import java.util.LinkedList;

/**
 * Created by yunlongxu on 12/11/15.
 */
public class GetTheTiles implements Runnable {
    @Override
    public void run() {
        Singleton instance = Singleton.getInstance();
        System.out.println("1st Instance ID: " + System.identityHashCode(instance));
        System.out.println(instance.getLetterList());
        LinkedList<String> playerOneTiles = instance.getTiles(7);
        System.out.println("Player 1: " + playerOneTiles);
        System.out.println("Got Tiles");
    }
}
