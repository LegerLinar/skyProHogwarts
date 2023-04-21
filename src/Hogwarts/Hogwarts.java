package Hogwarts;

public class Hogwarts {
    private String name;
    private String surname;
    private String facultyName;
    private byte witchcraftPoints;
    private byte transgressionDistance;

    public Hogwarts(String name, String surname, String facultyName, byte witchcraftPoints, byte transgressionDistance) {
        this.name = name;
        this.surname = surname;
        this.facultyName = facultyName;
        this.witchcraftPoints = witchcraftPoints;
        this.transgressionDistance = transgressionDistance;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public byte getWitchcraftPoints() {
        return witchcraftPoints;
    }

    public byte getTransgressionDistance() {
        return transgressionDistance;
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
