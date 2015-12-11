package SingletonPattern;

import java.util.LinkedList;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by yunlongxu on 12/11/15.
 */
public class ScrabbleTest {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println("1st Instance ID: " + System.identityHashCode(instance));
        System.out.println(instance.getLetterList());
        LinkedList<String> playerOneTiles = instance.getTiles(7);
        System.out.println("Player 1: " + playerOneTiles);
        System.out.println(instance.getLetterList());
        Singleton instance2 = Singleton.getInstance();
        System.out.println("2nd Instance ID: " + System.identityHashCode(instance2));
        System.out.println(instance2.getLetterList());
        LinkedList<String> playerTwoTiles = instance2.getTiles(7);
        System.out.println("Player 2: " + playerTwoTiles);
    }
}
