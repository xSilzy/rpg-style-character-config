package silzy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* --- RPG STYLE CHARACTER CREATOR ---
        * A little project I made to get more familiar with Java and its different features (Classes/ Subclasses, Enums, Interfaces etc.)
        *
        *
        * To Do List (□▣) :
        * □ Implement/ Finish Fighting system (take damage, deal damage, diff attacks, etc.)
        * □ Allow character creation through the console (parsing in info to create new char.)
        * □ Make new Races/Species besides Humanoid
        * ▣ Maybe rework str and hp calculation (use less magic numbers)
        * ▣ Add leveling system (automated exp caps and automated level ups)
        * □
        * □
        * □
        * □
        * □ implement full rpg system???
        *
        *
        *
        *
        * These methods are callable (or at least the methods I intend to be callable):
        *  - Functional ones (methods that impact the character):
        *       ↳ birthDay() // Ages the character by one year
        *       ↳ proficiencyUp() // 'Upgrades' a characters type/class proficiency
        *       ↳ addLevels(int levelsToAdd) // Level's up a character by a set amount if the factor is greater than one, else it'll level up by one level // doesn't change the exp cap or value
        *       ↳ addExperience(double experienceToAdd) // Adds a set amount of experience (736797 is needed for the max level)
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
        *       ↳ simpleInfoDump() // Dumps all the info in a simple list
        *
        *
        *  The following is an example on how to create a new Human:
        * */
        List<Humanoid> allHumanoids = new ArrayList<>();


        Humanoid theHuman = new Human("theHuman", 18,Gender.MALE, Type.WARRIOR, TypeProficiency.NOVICE, 10);
        allHumanoids.add(theHuman);

        Humanoid theElf = new Elf("theElf", 18,Gender.MALE, Type.WARRIOR, TypeProficiency.NOVICE, 10);
        allHumanoids.add(theElf);

        Humanoid theDarkElf = new DarkElf("theDarkElf", 18,Gender.MALE, Type.WARRIOR, TypeProficiency.NOVICE, 10);
        allHumanoids.add(theDarkElf);

        Humanoid theOrk = new Ork("theOrk", 18,Gender.MALE, Type.WARRIOR, TypeProficiency.NOVICE, 10);
        allHumanoids.add(theOrk);

        Humanoid theDwarf = new Dwarf("theDwarf", 18,Gender.MALE, Type.WARRIOR, TypeProficiency.NOVICE, 10);
        allHumanoids.add(theDwarf);




        for (Humanoid currentHumanoid : allHumanoids) {
            System.out.println("\n---\n");
            currentHumanoid.addExperience(736807);
            currentHumanoid.simpleInfoDump();

        }







    }
}