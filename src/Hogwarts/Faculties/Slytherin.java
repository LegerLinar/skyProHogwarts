package Hogwarts.Faculties;

import Hogwarts.Hogwarts;

public class Slytherin extends Hogwarts {
    //Всем ученикам Слизерина присущи хитрость, решительность, амбициозность, находчивость и жажда власти.
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int authority;

    public Slytherin(String name, String surname, byte witchcraftPoints, byte transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int authority) {
        super(name, surname, witchcraftPoints, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.authority = authority;
    }
}
