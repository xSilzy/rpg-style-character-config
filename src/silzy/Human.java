package silzy;

public class Human extends Humanoid {

    public Human(String name, int age, Gender gender, Type type, TypeProficiency proficiency, int level) {
        super(name, age, gender, type, proficiency, level);
        this.setRace(Race.HUMAN);
        this.setStrength(level);
        this.setHealth(level);
    }

}
