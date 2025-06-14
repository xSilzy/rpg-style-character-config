package silzy;

public class Elf extends Humanoid {

    public Elf(String name, int age, Gender gender, Type type, TypeProficiency proficiency, int level) {
        super(name, age, gender, type, proficiency, level);
        this.setRace(Race.ELF);
        this.setStrength(level);
        this.setHealth(level);
    }

}
