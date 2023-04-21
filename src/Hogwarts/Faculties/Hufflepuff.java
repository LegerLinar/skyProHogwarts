package Hogwarts.Faculties;

import Hogwarts.Hogwarts;

public class Hufflepuff extends Hogwarts {
    //Студенты Пуффендуя трудолюбивы, верны, честны.
//
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, String surname, int witchcraftPoints, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(name, surname, witchcraftPoints, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public Hufflepuff(String name, String surname, int witchcraftPoints, int transgressionDistance) {
        super(name, surname, witchcraftPoints, transgressionDistance);
        hardworking = (int) (Math.random()*100 + 1);
        loyal = (int) (Math.random()*100 + 1);
        honest = (int) (Math.random()*100 + 1);

    }

    @Override
    public void showCharacters() {
        super.showCharacters();
        System.out.println(" Hardworking - " + hardworking + "\n Loyal - " + loyal + " \n Honest - " + honest);
    }

    public void whoIsBetterHuff(Hufflepuff person2){
        if ((this.hardworking + this.loyal + this.honest) > (person2.hardworking + person2.loyal + person2.honest)) {
            System.out.println(this.getName() + " " + this.getSurname() + " is better Hufflepuffer than " + person2.getName());
        } else {
            System.out.println(person2.getName() + " " + person2.getSurname() + " is better Hufflepuffer than " + this.getName());
        }
    }
}
