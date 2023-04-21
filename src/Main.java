import Hogwarts.Faculties.Gryffindor;
import Hogwarts.Faculties.Hufflepuff;
import Hogwarts.Faculties.Ravenclaw;
import Hogwarts.Faculties.Slytherin;
import Hogwarts.Hogwarts;

public class Main {
    public static void main(String[] args) {
//        hermioneGranger and ronWeasley are in Gryffindor House. Гриффиндор.
//
// dracoMalfoy, grahamMontague, gregoryGoyle учатся на Слизерине.
//
//На факультет Пуффендуй учатся zachariasSmith, cedricDiggory, justinFinchFletchley.
//
//На факультете Когтевран учится zhouChang, padmaPatil and marcusBelby.

        int randomValue =(int) (Math.random()*100 + 1);

        Gryffindor harryPotter = new Gryffindor("Harry", "Potter", randomValue, randomValue);
        Gryffindor hermioneGranger = new Gryffindor("Hermione", "Granger", randomValue, randomValue);
        Gryffindor ronWeasley = new Gryffindor("Ron", "Weasley", randomValue, randomValue);

        Slytherin dracoMalfoy = new Slytherin("Draco", "Malfoy", randomValue, randomValue);
        Slytherin grahamMontague = new Slytherin("Gragam", "Montague", randomValue, randomValue);
        Slytherin gregoryGoyle = new Slytherin("Gregory", "Goyle", randomValue, randomValue);

        Hufflepuff zachariasSmith = new Hufflepuff("Zacharia", "Smith", randomValue, randomValue);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric", "Diggory", randomValue, randomValue);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin", "Finch-Fletchley", randomValue, randomValue);

        Ravenclaw zhouChang = new Ravenclaw("Zhou", "Chang", randomValue, randomValue);
        Ravenclaw padmaPatil = new Ravenclaw("Padma", "Patil", randomValue, randomValue);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus", "Belby", randomValue, randomValue);

//        harryPotter.showCharacters();
//        dracoMalfoy.showCharacters();
//        zachariasSmith.showCharacters();
//        zhouChang.showCharacters();

        harryPotter.whoIsBetterGrif(ronWeasley);
        dracoMalfoy.whoIsBetterSlyth(grahamMontague);
        zachariasSmith.whoIsBetterHuff(cedricDiggory);
        zhouChang.whoIsBetterRaven(padmaPatil);

        hermioneGranger.whoIsStrongerWitch(harryPotter);
        zachariasSmith.whoTravelBetter(harryPotter);



    }
}