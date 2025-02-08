package pj2;

public class Player {
    private String name;
    private Attack attackable;
    private Defens defensible;
    private HP HP;
    private EnemyF enemyFactory;
    private int score = 0;

    public Player(String name, Characteristic attackable, Characteristic defensible, Characteristic HP, EnemyF enemyFactory) {
        this.name = name;
        this.attackable = (Attack) attackable;
        this.defensible = (Defens) defensible;
        this.HP = (pj2.HP) HP;
        this.enemyFactory = enemyFactory;
    }

    public String getName() { return name; }

    public void fight(Enemy enemy) {
        System.out.println("oh my gad right now enemy attack you");
        System.out.println("you should fight");
        int playerHP = HP.getHP();
        int enemyHP = enemy.getHP();

        while (playerHP > 0 && enemyHP > 0) {
            enemyHP -= attackable.getAttack();
            System.out.println(name + " attacks " + enemy.getType() +" " +" Enemy HP: " + Math.max(0, enemyHP));

            if (enemyHP <= 0) {break;}

            playerHP -= Math.max(0, enemy.getAttack() - defensible.getDefence());
            System.out.println(enemy.getType() + " attacks back! Player HP: " + Math.max(0, playerHP));
        }

        if (playerHP > 0) {
            System.out.println(name + " you win.you get " + enemy.getPoints() + " points.");
            score += enemy.getPoints();
        }
        else {
            System.out.println(name + " The End.You lose(LOX)");
        }
    }
}