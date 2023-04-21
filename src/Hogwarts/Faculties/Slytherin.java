package Hogwarts.Faculties;

import Hogwarts.Hogwarts;

public class Slytherin extends Hogwarts {
    //Всем ученикам Слизерина присущи хитрость, решительность, амбициозность, находчивость и жажда власти.
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int authority;

    public Slytherin(String name, String surname, int witchcraftPoints, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int authority) {
        super(name, surname, witchcraftPoints, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.authority = authority;
    }

    public Slytherin(String name, String surname, int witchcraftPoints, int transgressionDistance) {
        super(name, surname, witchcraftPoints, transgressionDistance);
        cunning = (int) (Math.random()*100 + 1);
        determination = (int) (Math.random()*100 + 1);
        ambition = (int) (Math.random()*100 + 1);
        resourcefulness = (int) (Math.random()*100 + 1);
        authority = (int) (Math.random()*100 + 1);
    }

    @Override
    public void showCharacters() {
        super.showCharacters();
        System.out.println("Cunning - " + cunning + "\n Determination - " + determination + "\n Ambition - " + ambition + "\n Resourcefulness - " + resourcefulness + "\n Authority - " + authority);
    }

    public void whoIsBetterSlyth(Slytherin person2){
        if ((this.cunning + this.determination + this.ambition + this.resourcefulness + this.authority) > (person2.cunning + person2.determination + person2.ambition + person2.resourcefulness + person2.authority)) {
            System.out.println(this.getName() + " " + this.getSurname() + " is better Slytheriner than  " + person2.getName());
        } else {
            System.out.println(person2.getName() + " " + person2.getSurname() + " is better Slytheriner than  " + this.getName());
        }
    }
}
