package pj2;

class Enemy {
    private String type;
    private int points;
    private int hp;
    private double attack;

    public Enemy(String type, int points, int hp, double attack) {
        this.type = type;
        this.points = points;
        this.hp = hp;
        this.attack = attack;
    }

    public String getType() { return type; }
    public int getPoints() { return points; }
    public int getHP() { return hp; }
    public double getAttack() { return attack; }
}