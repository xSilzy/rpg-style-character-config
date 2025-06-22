package silzy;

public enum TypeProficiency {
    NOVICE("Novice", 0, 2),
    APPRENTICE("Apprentice", 4, 8),
    EXPERT("Expert", 16, 32),
    MASTER("Master", 64, 128);

    private final String proficiencyName;
    private final float proficiencyDmgAdd;
    private final float proficiencyHealthAdd;

    TypeProficiency(String name, float dmgAdd, int healthAdd) {
        this.proficiencyName = name;
        this.proficiencyDmgAdd = dmgAdd;
        this.proficiencyHealthAdd = healthAdd;
    }

    public String getProficiencyName() {
        return proficiencyName;
    }

    public float getProficiencyDmgAdd() {
        return proficiencyDmgAdd;
    }

    public float getProficiencyHealthAdd() {
        return proficiencyHealthAdd;
    }
}
