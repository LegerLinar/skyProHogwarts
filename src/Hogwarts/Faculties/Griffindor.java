package Hogwarts.Faculties;

import Hogwarts.Hogwarts;

public class Griffindor extends Hogwarts {
    //Всем Гриффиндорцам присущи благородство, честь и храбрость.
//
    private int nobility;
    private int honor;
    private int courage;

    public Griffindor(String name, String surname, byte witchcraftPoints, byte transgressionDistance, int nobility, int honor, int courage) {
        super(name, surname, witchcraftPoints, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }
}
