package silzy;

public class Dwarf extends Humanoid {

    public Dwarf(String name, int age, Gender gender, Type type, TypeProficiency proficiency, int level) {
        super(name, age, gender, type, proficiency, level);
        this.setRace(Race.DWARF);
        this.setExperienceCap(Race.DWARF.getBaseExperienceCap());
        this.setBaseStrength(level);
        this.setBaseHealth(level);
        this.setBaseAttackSpeed(Race.DWARF.getRaceBaseAttackSpeed());


    }

}
