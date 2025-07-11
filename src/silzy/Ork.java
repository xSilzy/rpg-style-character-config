package silzy;

public class Ork extends Humanoid {

    public Ork(String name, int age, Gender gender, Type type, TypeProficiency proficiency, int level) {
        super(name, age, gender, type, proficiency, level);
        this.setRace(Race.ORK);
        this.setExperienceCap(Race.ORK.getBaseExperienceCap());
        this.setBaseStrength(level);
        this.setBaseHealth(level);
        this.setBaseAttackSpeed(Race.ORK.getRaceBaseAttackSpeed());
    }


}
