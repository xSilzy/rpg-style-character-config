package silzy;

public enum Type {
    MAGE("Mage", 3, 10),
    TANK("Tank", 2, 80),
    ROGUE("Rogue", 5, 10),
    WARRIOR("Warrior", 7, 20),
    BRUTE("Brute", 9, 30),
    HEALER("Mage", 1, 10);

    private final String typeName;
    private final float typeDmgAdd;
    private final float typeHealthAdd;


    Type(String name, int dmgAdd, int healthAdd) {
        this.typeName = name;
        this.typeDmgAdd = dmgAdd;
        this.typeHealthAdd = healthAdd;
    }

    public String getTypeName() {
        return typeName;
    }

    public float getTypeDmgAdd() {
        return typeDmgAdd;
    }

    public float getTypeHealthAdd() {
        return typeHealthAdd;
    }
}
