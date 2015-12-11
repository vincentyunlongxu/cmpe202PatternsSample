package FactoryPattern;

import java.util.Scanner;

/**
 * Created by yunlongxu on 12/11/15.
 */
public class EnemyShipTesting {
    public static void main(String[] args) {
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip enemyShip = null;
        Scanner userInput = new Scanner(System.in);
        System.out.println("What type of ship? (U / R / B)");
        if (userInput.hasNextLine()) {
            String typeOfShip = userInput.nextLine();
            enemyShip = shipFactory.makeEnemyShip(typeOfShip);
            if (enemyShip != null) {
                doStuffEnemy(enemyShip);
            } else {
                System.out.println("Please enter U, R, or B next time");
            }
        }
    }

    public static void doStuffEnemy(EnemyShip enemyShip) {
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }
}
