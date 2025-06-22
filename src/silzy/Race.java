package silzy;

public enum Race {
    HUMAN("Human", 3, 100, 100.0),
    ELF("Elf",1, 120, 70.0),
    DARK_ELF("Dark Elf",1, 130, 80.0),
    ORK("Ork",7, 120, 120.0),
    DWARF("Dwarf",4, 105, 90.0);

    private final String raceName;
    private final float raceBaseDmg;
    private final float raceBaseHealth;
    private final double raceBaseExperienceCap;

    Race(String name, int baseDmg, int baseHealth, double baseExperienceCap) {
        this.raceName = name;
        this.raceBaseDmg = baseDmg;
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


}
