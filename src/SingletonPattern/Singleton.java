package SingletonPattern;

import sun.awt.image.ImageWatched;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by yunlongxu on 12/11/15.
 */
public class Singleton {
    private static Singleton instance = null;
    String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
            "b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
            "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
            "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l",
            "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
            "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
            "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
            "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z", };
    private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters));
    static boolean firstThread = true;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            if (firstThread) {
                firstThread = false;
                try {
                    Thread.currentThread();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                    Collections.shuffle(instance.letterList);
                }
            }
        }
        return instance;
    }

    public LinkedList<String> getLetterList() {
        return instance.letterList;
    }

    public LinkedList<String> getTiles(int howManyTiles) {
        LinkedList<String> tilesToSend = new LinkedList<String>();
        for (int i = 0; i <= howManyTiles; i++) {
            tilesToSend.add(instance.letterList.remove(0));
        }
        return tilesToSend;
    }
}
