import Hogwarts.Faculties.Gryffindor;
import Hogwarts.Faculties.Hufflepuff;
import Hogwarts.Faculties.Ravenclaw;
import Hogwarts.Faculties.Slytherin;
import Hogwarts.Hogwarts;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        hermioneGranger and ronWeasley are in Gryffindor House. Гриффиндор.
//
// dracoMalfoy, grahamMontague, gregoryGoyle учатся на Слизерине.
//
//На факультет Пуффендуй учатся zachariasSmith, cedricDiggory, justinFinchFletchley.
//
//На факультете Когтевран учится zhouChang, padmaPatil and marcusBelby.

        int randomValue =(int) (Math.random()*100 + 1);

        Gryffindor harryPotter = new Gryffindor("Harry", "Potter", randomValue, randomValue);
        Hogwarts hermioneGranger = new Gryffindor("Hermione", "Granger", randomValue, randomValue);
        Gryffindor ronWeasley = new Gryffindor("Ron", "Weasley", randomValue, randomValue);

        Hogwarts dracoMalfoy = new Slytherin("Draco", "Malfoy", randomValue, randomValue);
        Hogwarts grahamMontague = new Slytherin("Gragam", "Montague", randomValue, randomValue);
        Hogwarts gregoryGoyle = new Slytherin("Gregory", "Goyle", randomValue, randomValue);

        Hogwarts zachariasSmith = new Hufflepuff("Zacharia", "Smith", randomValue, randomValue);
        Hogwarts cedricDiggory = new Hufflepuff("Cedric", "Diggory", randomValue, randomValue);
        Hogwarts justinFinchFletchley = new Hufflepuff("Justin", "Finch-Fletchley", randomValue, randomValue);

        Hogwarts zhouChang = new Ravenclaw("Zhou", "Chang", randomValue, randomValue);
        Hogwarts padmaPatil = new Ravenclaw("Padma", "Patil", randomValue, randomValue);
        Hogwarts marcusBelby = new Ravenclaw("Marcus", "Belby", randomValue, randomValue);

//        harryPotter.showCharacters();
//        dracoMalfoy.showCharacters();
//        zachariasSmith.showCharacters();
//        zhouChang.showCharacters();

        harryPotter.whoIsBetterGrif(ronWeasley);



    }
}