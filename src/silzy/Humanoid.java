package silzy;

public abstract class Humanoid implements IMovesets{
    private final String name;
    private Race race;
    private int age;
    private final Gender gender;
    private final Type type;
    private TypeProficiency proficiency;
    private int level;
    private float strength;
    private float health;

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
        this.strength = ((race.getRaceBaseDamage() + type.getTypeBaseDmg()) / 3) + proficiency.getProficiencyDmgAdd() + (float)level / 2  ; // level divided by two to 'diffuse' the damage
    }
    protected void setHealth(int level){
        this.health = ((race.getRaceBaseHealth() + type.getTypeBaseHealth()) / 2) + proficiency.getProficiencyHealthAdd() + level; // dividing the first set of numbers and not health by two for better health/ strength ratio
    }

    public void birthDay(){
        this.age++;
        System.out.println("Happy Birthday " + this.name + "! You are now " + this.age + ".");
    }

    public void levelUp(int levelUpFactor) {
        if(levelUpFactor > 1){
            this.level += levelUpFactor;
        } else {
            this.level++;
        }

        System.out.println(this.name + " is now level " + this.level + "!");

        // Update health and strength
        setStrength(this.level);
        setHealth(this.level);
    }

    public void proficiencyUp(){
        switch(this.proficiency){
            case NOVICE : this.proficiency = TypeProficiency.APPRENTICE; System.out.println("Proficiency upgraded to: " + this.proficiency); break;
            case APPRENTICE : this.proficiency = TypeProficiency.EXPERT; System.out.println("Proficiency upgraded to: " + this.proficiency); break;
            case EXPERT : this.proficiency = TypeProficiency.MASTER; System.out.println("Proficiency upgraded to: " + this.proficiency); break;
            case MASTER : System.out.println("Proficiency is already at it's highest."); break;
            default : System.out.println("Couldn't upgrade proficiency."); break;
        }

        // Update health and strength
        setStrength(this.level);
        setHealth(this.level);
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
        System.out.println(this.name + " has a Strength of: " + this.strength + " and " + this.health + " health.");
    }

}
