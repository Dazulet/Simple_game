package pj2;

import java.util.Random;
import java.util.Scanner;

public class Main { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random ran = new Random();
    System.out.println("Enter your name:");
    String name = sc.nextLine();
    System.out.println("you should choose 1 item: Armor or Weapon");
    String choice = sc.next();

    Characteristic playerStats = new BCharacteristic(choice);
    EnemyF enemyFactory = new RandomEnemy();

    Player player = new Player(name, playerStats, playerStats, playerStats, enemyFactory);
    System.out.println("Player: " + player.getName());
    System.out.println("Attack: " + playerStats.getAttack());
    System.out.println("Defence: " + playerStats.getDefence());
    System.out.println("HP: " + playerStats.getHP());

    Enemy enemy = enemyFactory.createEnemy(ran.nextInt(100));
    System.out.println("Spawned enemy: " + enemy.getType() + " (HP: " + enemy.getHP() + ")");

    player.fight(enemy);
    sc.close();
}
}