package silzy;

public enum TypeProficiency {
    NOVICE("Novice", 1, 2),
    APPRENTICE("Apprentice", 2, 4),
    EXPERT("Expert", 4, 8),
    MASTER("Master", 6, 12);

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
