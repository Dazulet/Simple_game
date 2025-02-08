package pj2;

public class BCharacteristic implements Characteristic {
    private double baseAttack = 20;
    private double baseDefence = 20;
    private int baseHP = 20;

    public BCharacteristic(String item) {
        if (item.equalsIgnoreCase("Armor")) {
            this.baseAttack += 11.7;
        } else if (item.equalsIgnoreCase("Weapon")) {
            this.baseDefence += 10.5;
            this.baseHP += 5;
        }
    }

    @Override
    public double getAttack() { return baseAttack; }

    @Override
    public double getDefence() { return baseDefence; }

    @Override
    public int getHP() { return baseHP; }
}