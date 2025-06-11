package silzy;

public class Main {
    public static void main(String[] args) {

        Humanoid gerald = new Human("Gerald", 51,Gender.MALE, Type.ROGUE, TypeProficiency.MASTER, 43);
        Humanoid miata = new Human("Miata", 23,Gender.FEMALE, Type.HEALER, TypeProficiency.APPRENTICE, 12);
        Humanoid jean = new Human("Jean", 219, Gender.FEMALE, Type.MAGE, TypeProficiency.EXPERT, 21);
        Humanoid johnson = new Human("johnson", 110, Gender.MALE, Type.WARRIOR, TypeProficiency.MASTER, 51);



        gerald.infoDump();
        gerald.fastAttack();
        gerald.strongAttack();


        miata.infoDump();
        miata.fastAttack();
        miata.strongAttack();


        jean.infoDump();
        jean.fastAttack();
        jean.strongAttack();


        johnson.infoDump();
        johnson.fastAttack();
        johnson.strongAttack();


    }
}