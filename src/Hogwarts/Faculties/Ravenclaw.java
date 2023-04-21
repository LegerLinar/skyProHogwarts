package Hogwarts.Faculties;

import Hogwarts.Hogwarts;

public class Ravenclaw extends Hogwarts {

//Когтевранцы умны, мудры, остроумны и полны творчества.

    private int smart;
    private int wise;
    private int witty;
    private int creative;

    public Ravenclaw(String name, String surname, int witchcraftPoints, int transgressionDistance, int smart, int wise, int witty, int creative) {
        super(name, surname, witchcraftPoints, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public Ravenclaw(String name, String surname, int witchcraftPoints, int transgressionDistance) {
        super(name, surname, witchcraftPoints, transgressionDistance);
        smart = (int) (Math.random()*100 + 1);
        wise = (int) (Math.random()*100 + 1);
        witty = (int) (Math.random()*100 + 1);
        creative = (int) (Math.random()*100 + 1);
    }

    @Override
    public void showCharacters() {
        super.showCharacters();
        System.out.println(" Smart - " + smart + "\n Wise - " + wise + "\n Witty - " + witty + "\n Creative - " + creative);
    }
}
