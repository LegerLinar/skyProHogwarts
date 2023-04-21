public class Hogwarts {
    private byte characterPoints;
    private byte witchcraftPoints;

    private byte transgressionDistance;

    Hogwarts(byte characterPoints, byte witchcraftPoints, byte transgressionDistance) {

        if(characterPoints <= 100 && characterPoints >= 0) {
            this.characterPoints = characterPoints;
        } else {
            this.characterPoints = 0;
        }
        this.witchcraftPoints = witchcraftPoints;
        this.transgressionDistance = transgressionDistance;
    }

    public byte getCharacterPoints() {
        return characterPoints;
    }

    public void setCharacterPoints(byte characterPoints) {
        this.characterPoints = characterPoints;
    }

    public byte getWitchcraftPoints() {
        return witchcraftPoints;
    }

    public void setWitchcraftPoints(byte witchcraftPoints) {
        this.witchcraftPoints = witchcraftPoints;
    }

    public byte getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(byte transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
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
