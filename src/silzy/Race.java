package silzy;

public enum Race {
    HUMAN("Human", 3, 1.0, 100, 100.0),
    ELF("Elf",1, 1.3,120, 70.0),
    DARK_ELF("Dark Elf",1, 1.5,130, 80.0),
    ORK("Ork",7, 0.5,120, 120.0),
    DWARF("Dwarf",4, 1.1,105, 90.0);

    private final String raceName;
    private final float raceBaseDmg;
    private final double raceBaseAttackSpeed;
    private final float raceBaseHealth;
    private final double raceBaseExperienceCap;

    Race(String name, int baseDmg, double attackSpeed, int baseHealth, double baseExperienceCap) {
        this.raceName = name;
        this.raceBaseDmg = baseDmg;
        this.raceBaseAttackSpeed = attackSpeed;
        this.raceBaseHealth = baseHealth;
        this.raceBaseExperienceCap = baseExperienceCap;
    }

    public String getRaceName() {
        return raceName;
    }

    public float getRaceBaseDmg() {
        return raceBaseDmg;
    }

    public float getRaceBaseHealth() {
        return raceBaseHealth;
    }
    public double getBaseExperienceCap() {
        return raceBaseExperienceCap;
    }
    public double getRaceBaseAttackSpeed() {
        return raceBaseAttackSpeed;
    }

}
