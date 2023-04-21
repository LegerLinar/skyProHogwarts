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
}
