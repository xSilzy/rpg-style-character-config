package silzy;

public enum Race {
    HUMAN("Human", 3, 100),
    ELF("Elf",1, 120),
    DARK_ELF("Dark Elf",1, 130),
    ORK("Ork",4, 150),
    DWARF("Dwarf",2, 110);

    private final String raceName;
    private final float raceBaseDamage;
    private final float raceBaseHealth;

    Race(String name, int baseDamage, int baseHealth) {
        this.raceName = name;
        this.raceBaseDamage = baseDamage;
        this.raceBaseHealth = baseHealth;
    }

    public String getRaceName() {
        return raceName;
    }

    public float getRaceBaseDamage() {
        return raceBaseDamage;
    }

    public float getRaceBaseHealth() {
        return raceBaseHealth;
    }


}
