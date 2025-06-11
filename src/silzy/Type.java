package silzy;

public enum Type {
    MAGE("Mage", 3, 10),
    TANK("Tank", 1, 80),
    ROGUE("Rogue", 5, 10),
    WARRIOR("Warrior", 7, 20),
    BRUTE("Brute", 9, 30),
    HEALER("Mage", 1, 10);

    private final String typeName;
    private final float typeBaseDmg;
    private final float typeBaseHealth;


    Type(String name, int dmgAdd, int healthAdd) {
        this.typeName = name;
        this.typeBaseDmg = dmgAdd;
        this.typeBaseHealth = healthAdd;
    }

    public String getTypeName() {
        return typeName;
    }

    public float getTypeBaseDmg() {
        return typeBaseDmg;
    }

    public float getTypeBaseHealth() {
        return typeBaseHealth;
    }
}
