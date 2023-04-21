package Hogwarts.Faculties;

import Hogwarts.Hogwarts;

public class Gryffindor extends Hogwarts {
    //Всем Гриффиндорцам присущи благородство, честь и храбрость.
//
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, String surname, int witchcraftPoints, int transgressionDistance, int nobility, int honor, int courage) {
        super(name, surname, witchcraftPoints, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public Gryffindor(String name, String surname, int witchcraftPoints, int transgressionDistance) {
        super(name, surname, witchcraftPoints, transgressionDistance);
        nobility = (int) (Math.random()*100 + 1);
        honor = (int) (Math.random()*100 + 1);
        courage = (int) (Math.random()*100 + 1);

    }
//    Сделайте метод, который выводит на экран описание студента.
//    В описание надо включать качества, которые присущи всем студентам,
//    плюс качества, которые присущи студенту, потому что он учится на конкретном факультете.


    @Override
    public void showCharacters() {
        super.showCharacters();
        System.out.println("Gryffindor");
        System.out.println(" Nobility - " + nobility + "\n Honor - " + honor + "\n Courage - " + courage);
    }

    public void whoIsBetterGrif(Gryffindor person2){
        if ((this.courage + this.honor + this.nobility) > (person2.courage + person2.honor + person2.nobility)) {
            System.out.println(this.getName() + " " + this.getSurname() + " is better Gryffindorist than " + person2.getName());
        } else {
            System.out.println(person2.getName() + " " + person2.getSurname() + " is better Gryffindorist than " + this.getName());
        }

    }
}
