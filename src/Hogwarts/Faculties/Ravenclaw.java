package Hogwarts.Faculties;

import Hogwarts.Hogwarts;

public class Ravenclaw extends Hogwarts {

//Когтевранцы умны, мудры, остроумны и полны творчества.

    private int smart;
    private int wise;
    private int witty;
    private int creative;

    public Ravenclaw(String name, String surname, byte witchcraftPoints, byte transgressionDistance, int smart, int wise, int witty, int creative) {
        super(name, surname, witchcraftPoints, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }
}
