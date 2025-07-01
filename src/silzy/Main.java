package silzy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /* --- RPG STYLE CHARACTER CREATOR ---
        * A little project I made to get more familiar with Java and its different features (Classes/ Subclasses, Enums, Interfaces etc.)
        *
        *
        * To Do List (□▣) :
        * □ Implement/ Finish Fighting system (take damage, deal damage, diff attacks, etc.)
        * □ Implement more stats (mana, stamina, Intelligence, defence, maybe more?)
        * □ Implement type specific skills (e.g. healing skill for healers)
        * □ Balancing
        * □ Allow character creation through the console (parsing in info to create new char.)
        * □ Make new Races/Species besides Humanoid
        * ▣ Maybe rework str and hp calculation (use less magic numbers)
        * ▣ Add leveling system (automated exp caps and automated level ups)
        * □ Add error handling
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
        *       ↳ addExperience(double experienceToAdd) // Adds a set amount of experience
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


        Humanoid john = new Human("John", 51,Gender.MALE, Type.BRUTE, TypeProficiency.MASTER, 1);
        allHumanoids.add(john);
        john.simpleInfoDump();

        Humanoid fred = new Human("Fred", 51,Gender.MALE, Type.BRUTE, TypeProficiency.MASTER, 1);
        allHumanoids.add(fred);
        fred.simpleInfoDump();


        john.strongAttack(fred);
        wait(3 - 1.0);
        john.fastAttack(fred);
        wait(3 - 1.0);
        john.fastAttack(fred);
        wait(3 - 1.0);
        john.fastAttack(fred);






    }

    public static void wait (double waitTime) throws InterruptedException {
        waitTime *= 1000;
        Thread.sleep((long) waitTime);
    }

}