package silzy;

public class DarkElf extends Humanoid {

    public DarkElf(String name, int age, Gender gender, Type type, TypeProficiency proficiency, int level) {
        super(name, age, gender, type, proficiency, level);
        this.setRace(Race.DARK_ELF);
        this.setExperienceCap(Race.DARK_ELF.getBaseExperienceCap());
        this.setBaseStrength(level);
        this.setBaseHealth(level);
    }



}
