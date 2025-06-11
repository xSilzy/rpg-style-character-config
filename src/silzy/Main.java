package silzy;

public class Main {
    public static void main(String[] args) {
        /* --- RPG STYLE CHARACTER CREATOR ---
        * A little project I made to get more familiar with Java and its different features (Classes/ Subclasses, Enums, Interfaces etc.)
        *
        * These methods are callable (or at least the methods I intend to be callable):
        *  - Functional ones (methods that impact the character):
        *       ↳ birthDay() // Ages the character by one year
        *       ↳ proficiencyUp() // 'Upgrades' a characters type/class proficiency
        *       ↳ levelUp(int levelUpFactor) // level's up a character by a set amount if the factor is greater than one, else it'll level up by one level
        *       ↳ fastAttack() // Basic attack, deals less damage but is fast (attack speed is not implemented yet)
        *       ↳ strongAttack() // Basic attack, deals more damage but is slow (attack speed is not implemented yet)
        *       ↳ block() // NOT IMPLEMENTED YET
        *       ↳ dodge() // NOT IMPLEMENTED YET
        *       ↳ walk() // NOT IMPLEMENTED YET
        *       ↳ run() // NOT IMPLEMENTED YET
        *       ↳ sneak() // NOT IMPLEMENTED YET
        *       ↳ climb() // NOT IMPLEMENTED YET
        *
        *  - Informational ones (methods that don't impact the character but give information about them):
        *       ↳ infoDump() // Dumps a sort of character introduction into the console
        *
        *
        *  The following is an example on how to create a new Human:
        * */

        Humanoid gerald = new Human("Gerald", 51,Gender.MALE, Type.ROGUE, TypeProficiency.NOVICE, 5);
        Humanoid juliette = new Elf("juliette", 218,Gender.FEMALE, Type.MAGE, TypeProficiency.APPRENTICE, 21);

        gerald.infoDump();
        System.out.println("\n");
        gerald.proficiencyUp();
        gerald.levelUp(50);
        gerald.infoDump();








    }
}