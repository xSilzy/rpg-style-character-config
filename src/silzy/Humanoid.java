package silzy;

import javax.swing.plaf.synth.SynthUI;

public abstract class Humanoid implements IMovesets{
    private final String name;
    private Race race;
    private int age;
    private Gender gender;
    private final Type type;
    private final TypeProficiency proficiency;
    private int level;
    private float strength;

    public Humanoid(String name, int age, Gender gender , Type type, TypeProficiency proficiency, int level) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.type = type;
        this.proficiency = proficiency;
        this.level = level;
    }
    protected void setRace(Race race){
        this.race = race;
    }

    protected void setStrength(int level){
        this.strength = ((race.getRaceBaseDamage() + type.getTypeBaseDmg() + proficiency.getProficiencyDmgAdd()) / 4) + (float)level / 2  ; // level divided by two to 'diffuse' the damage
    }


    @Override
    public void fastAttack() {
        float attkDMG = 5 + this.strength;
        System.out.println(this.name + " dealt " + attkDMG + " Damage with a fast attack.");
    }

    @Override
    public void strongAttack() {
        float attkDMG = 8 + this.strength;
        System.out.println(this.name + " dealt " + attkDMG + " Damage with a strong attack.");
    }

    @Override
    public void block() {

    }

    @Override
    public void dodge() {

    }

    @Override
    public void walk() {

    }

    @Override
    public void run() {

    }

    @Override
    public void sneak() {

    }

    @Override
    public void climb() {

    }


    // ** CHARACTER INFO DUMP SECTION ** //

    public void infoDump(){
        System.out.println("\n" + this.name + "'s Info dump: ");
        System.out.println(this.name + " is a " + this.gender.toString().toLowerCase() + " " + this.race.toString().toLowerCase() + ", "+ gender.getNominativePronoun().toLowerCase() + " "+ gender.getToBeForm().toLowerCase() + " " + this.age + " years old.");
        System.out.println(gender.getPossessivePronoun() + " class is a " + type.getTypeName() + " with the proficiency of a " + proficiency.getProficiencyName() + " at level " + this.level + ".");
        System.out.println(this.name + " has a Strength of: " + this.strength);

//        System.out.println("\nMisc: ");
//        float tempLevelDmg = (float)this.level/2;
//        System.out.println("Race base damage: " + race.getRaceBaseDamage() + "\nType base damage: " + + type.getTypeBaseDmg() + "\nProficiency base damage: " + + proficiency.getProficiencyDmgAdd() + "\n Level base damage:" + tempLevelDmg + "\n--- END OF INFO DUMP ---\n");

    }

}
