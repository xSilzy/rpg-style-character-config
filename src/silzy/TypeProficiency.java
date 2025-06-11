package silzy;

public enum TypeProficiency {
    NOVICE("Novice", 1),
    APPRENTICE("Apprentice", 2),
    EXPERT("Expert", 4),
    MASTER("Master", 6);

    private final String proficiencyName;
    private final float proficiencyDmgAdd;

    TypeProficiency(String name, int dmgAdd) {
        this.proficiencyName = name;
        this.proficiencyDmgAdd = dmgAdd;
    }

    public String getProficiencyName() {
        return proficiencyName;
    }

    public float getProficiencyDmgAdd() {
        return proficiencyDmgAdd;
    }
}
