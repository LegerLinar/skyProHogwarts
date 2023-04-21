package Hogwarts.Faculties;

import Hogwarts.Hogwarts;

public class Hufflepuff extends Hogwarts {
    //Студенты Пуффендуя трудолюбивы, верны, честны.
//
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, String surname, byte witchcraftPoints, byte transgressionDistance, int hardworking, int loyal, int honest) {
        super(name, surname, witchcraftPoints, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }
}
