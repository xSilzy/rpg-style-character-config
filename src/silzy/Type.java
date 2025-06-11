package silzy;

public enum Type {
    MAGE("Mage", 3, 100),
    TANK("Tank", 1, 100),
    ROGUE("Rogue", 5, 100),
    WARRIOR("Warrior", 7, 100),
    BRUTE("Brute", 9, 100),
    HEALER("Mage", 1, 100);

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
