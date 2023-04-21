package Hogwarts;

public class Hogwarts {
    private String name;
    private String surname;
    private int witchcraftPoints;
    private int transgressionDistance;

    public Hogwarts(String name, String surname, int witchcraftPoints, int transgressionDistance) {
        this.name = name;
        this.surname = surname;
        this.witchcraftPoints = witchcraftPoints;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getWitchcraftPoints() {
        return witchcraftPoints;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setWitchcraftPoints(byte witchcraftPoints) {
        this.witchcraftPoints = witchcraftPoints;
    }

    public void setTransgressionDistance(byte transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }


//    Сделайте метод, который выводит на экран описание студента.
//    В описание надо включать качества, которые присущи всем студентам,
//    плюс качества, которые присущи студенту, потому что он учится на конкретном факультете.


    public void showCharacters(){
        System.out.println(this.name + " " + this.surname + " Witchcraft power - " + this.witchcraftPoints + " Transgression distance - " + this.transgressionDistance);
    }

//    Студентам каждого из этих факультетов присущи свои свойства характера. Эти свойства оцениваются в целочисленном эквиваленте от 0 до 100. +++
//
//Всем Гриффиндорцам присущи благородство, честь и храбрость.
//
//Студенты Пуффендуя трудолюбивы, верны, честны.
//
//Когтевранцы умны, мудры, остроумны и полны творчества.
//
//Всем ученикам Слизерина присущи хитрость, решительность, амбициозность, находчивость и жажда власти.
//
//Абсолютно все ученики школы Хогвартс умеют колдовать с ++++
// мощностью в сколько-то баллов и могут трансгрессировать на какое-то расстояние. ++++
// Сила магии и расстояние трансгресии у каждого ученика своё и выражается в целочисленном эквиваленте. ++++
}
