package silzy;


import java.util.List;

public abstract class Humanoid implements IMovesets{
    private final String name;
    private Race race;
    private int age;
    private final Gender gender;
    private final Type type;
    private TypeProficiency proficiency;
    private int level;
    private float baseStrength;
    private float baseHealth;
    private float health;
    private double experience;
    private double experienceCap;
    private double baseAttackSpeed;
    private int lastAttackTime = 0;
    private boolean isLiving = true;

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
    protected void setExperienceCap(double experienceCap){
        this.experienceCap = experienceCap;
    }
    protected void setBaseStrength(int level){
        final double BASE_STRENGTH_STARTING_MULTIPLIER = 1;
        final double STRENGTH_MULTIPLIER = 0.5;
        this.baseStrength = Math.round((race.getRaceBaseDmg() + type.getTypeDmgAdd() + proficiency.getProficiencyDmgAdd() * BASE_STRENGTH_STARTING_MULTIPLIER + (level * STRENGTH_MULTIPLIER)));
    }
    protected void setBaseHealth(int level){
        final double BASE_HEALTH_STARTING_MULTIPLIER = 1;
        final double HEALTH_MULTIPLIER = 1.5;
        this.baseHealth = Math.round((race.getRaceBaseHealth() + type.getTypeHealthAdd() + proficiency.getProficiencyHealthAdd() * BASE_HEALTH_STARTING_MULTIPLIER + (level * HEALTH_MULTIPLIER)));
        this.health = this.baseHealth;  //set health
    }
    public void setBaseAttackSpeed(double baseAttackSpeed) {
        this.baseAttackSpeed = baseAttackSpeed;
    }



    public void addLevels(int levelsToAdd) {
        this.level += levelsToAdd;

        System.out.println(this.name + " is now level " + this.level + "!");

        // Update health and strength
        setBaseStrength(this.level);
        setBaseHealth(this.level);
    }

    public void addExperience(int experienceToAdd){
        this.experience += experienceToAdd;
        System.out.println("Added " + experienceToAdd + " exp");
        checkIfLevelUp();
    }
    public void checkIfLevelUp() {
        while (this.experience >= experienceCap && this.level < 50) {
            this.level ++;
            this.experience -= experienceCap;
            this.experienceCap *= 1.2;
            this. experienceCap = Math.round(this.experienceCap);

//            System.out.println(this.name + " is now level " + this.level + "!");
//            System.out.println("New Experience cap " + experienceCap);

            // Update health and strength
            setBaseStrength(this.level);
            setBaseHealth(this.level);
        }
        if (this.level >= 50) {
            this.experienceCap =  Double.POSITIVE_INFINITY;
            System.out.println("Max level reached!!");
        }
    }

    public void levelUp() {
        this.level ++;
        System.out.println(this.name + " is now level " + this.level + "!");

        // Update health and strength
        setBaseStrength(this.level);
        setBaseHealth(this.level);
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
        setBaseStrength(this.level);
        setBaseHealth(this.level);
    }


    @Override
    public void fastAttack(Humanoid target) {
        float attkDMG = this.baseStrength;
        int cooldownTime = 2;

        if (isCooldownOver(cooldownTime, lastAttackTime)){
            dealDmg(target, attkDMG);

        } else {
            int currentTimeInSeconds = java.time.LocalTime.now().toSecondOfDay();
            int waitTime = cooldownTime - (currentTimeInSeconds -= lastAttackTime);
            System.out.println("Cooldown is not over yet! please wait " + waitTime + " seconds.");
        }

    }




    @Override
    public void strongAttack(Humanoid target) {
        double STRONG_ATTACK_DAMAGE_MULTIPLIER = 1.5;
        double STRONG_ATTACK_COOLDOWN_TIME = 5;

        float attkDMG = (float)(this.baseStrength * STRONG_ATTACK_DAMAGE_MULTIPLIER);
        double cooldownTime = STRONG_ATTACK_COOLDOWN_TIME - this.baseAttackSpeed;

        if (isCooldownOver(cooldownTime, lastAttackTime )){
            dealDmg(target, attkDMG);
        } else {
            int currentTimeInSeconds = java.time.LocalTime.now().toSecondOfDay();
            double waitTime = cooldownTime - (currentTimeInSeconds -= lastAttackTime);
            System.out.println("Cooldown is not over yet! please wait " + waitTime + " seconds.");
        }
    }


    private void dealDmg(Humanoid target, float attkDMG) {
        if (!checkIfDead((int) target.health, target)){
            target.health = takeDamage(target, attkDMG);
            System.out.println(this.name + " dealt " + attkDMG + " Damage to " + target.name + ".");
            System.out.println(target.name + " now has " + target.health + "/" + target.baseHealth + " health.");
            this.lastAttackTime = java.time.LocalTime.now().toSecondOfDay();

        }
    }


    public float takeDamage (Humanoid target, float damage){
        target.health = Math.round(target.health - damage);
        return target.health;
    }

    public boolean isCooldownOver (double cooldownTime, int prevTimeInSeconds) {
        int currentTimeInSeconds = java.time.LocalTime.now().toSecondOfDay();
        return Math.abs(currentTimeInSeconds - prevTimeInSeconds) >= cooldownTime;
    }

    public boolean checkIfDead(int health, Humanoid humanoid){
        if (health <= 0) {
            System.out.println(humanoid.name + " is Dead.");
            isLiving = false;
            return true;
        }
        return false;
    }

    // ** CHARACTER INFO DUMP SECTION ** //

    public void infoDump(){
        System.out.println("\n" + this.name + "'s Info dump: ");
        System.out.println(this.name + " is a " + this.gender.toString().toLowerCase() + " " + this.race.getRaceName() + ", "+ this.gender.getNominativePronoun().toLowerCase() + " "+ this.gender.getToBeForm().toLowerCase() + " " + this.age + " years old.");
        System.out.println(this.gender.getPossessivePronoun() + " class is a " + this.type.getTypeName() + " with the proficiency of a " + this.proficiency.getProficiencyName() + " at level " + this.level + " with " + this.experience + "/" + this.experienceCap + " Exp.");
        System.out.println(this.name + " has a Strength of: " + this.baseStrength + "an Attack Speed of " + this.baseAttackSpeed + " and " + this.health + "/" + this.baseHealth + " health.");
        System.out.println(this.name + " Living: " + this.isLiving +  ".");
    }

    public void simpleInfoDump() {
        System.out.println("\n");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender : " + this.gender);
        System.out.println("Race: " + this.race.getRaceName());
        System.out.println("Type: " + this.type.getTypeName());
        System.out.println("Proficiency: " + this.proficiency.getProficiencyName());
        System.out.println("Level: " + this.level);
        System.out.println("Experience: " + this.experience + "/" + this.experienceCap);
        System.out.println("Strength: " + this.baseStrength);
        System.out.println("Attack Speed: " + this.baseAttackSpeed);
        System.out.println("Health: " + this.health + "/" + this.baseHealth);
        System.out.println("Living: " + this.isLiving);
    }

}
