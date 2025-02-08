package pj2;

class RandomEnemy implements EnemyF {
    @Override
    public Enemy createEnemy(int value) {
        if (value <= 20) return new Enemy("Goblin", 20, 52, 13);
        if (value <= 40) return new Enemy("Orc", 40, 75, 21);
        if (value <= 60) return new Enemy("Poison Big Lizard", 60, 93, 20);
        return new Enemy("Dragon", 100, 150, 31);
    }
}