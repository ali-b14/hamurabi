//package hammurabi.docs.matuszek;
//
//public class Hammurabi {
//}
package hammurabi.src.main;               // package declaration
import java.util.Random;         // imports go here
import java.util.Scanner;
import java.util.InputMismatchException;

public class Hammurabi {
             // must save in a file named Hammurabi.java
    Random rand = new Random();  // this is an instance variable
    Scanner scanner = new Scanner(System.in);
    int year = 1;
    int population = 100;
    int acresOwned = 1000;
    int bushels = 2800;
    int landValue = 19;
    int deaths = 0;
    int yield;

    public Hammurabi(){

    }


    public static void main(String[] args) { // required in every Java program
        new Hammurabi().playGame();
    }

    void playGame() {
        // declare local variables here: grain, population, etc.
        // statements go after the declarations
        for (int i = 1; i <= 3 ; i++) {
            startGameMessage();
            askHowManyAcresToBuy();

//            System.out.println(endOfYearSummary());
        }


    }

    //other methods go here

    public int askHowManyAcresToBuy(){
            int acresToBuy = 0;
            while (true) {
                System.out.print("How many acres would you like to buy? ");
                try {
                    acresToBuy = scanner.nextInt();
                    int bushelsSpentBuyingLand = landValue * acresToBuy;
//                    acresToBuy = 1;
                    if(bushelsSpentBuyingLand > bushels){
                        System.out.println("O Great Hamurabi, surely you jest!\\nYou must have enough bushels to pay for this land.");
                    } else if (bushelsSpentBuyingLand <= bushels && bushelsSpentBuyingLand > 0) {
                        bushels -= bushelsSpentBuyingLand;
                        acresOwned += acresToBuy;
                    }
                    return acresOwned;
                }
                catch (InputMismatchException e) {
                    System.out.println("\"" + scanner.next() + "\" isn't a  valid input!");
                    scanner.nextInt();
                }
                return acresOwned;
            }
    }
    public void startGameMessage(){
        System.out.println("O great Hammurabi!\n" +
                "    You are in year 1 of your ten year rule.\n" +
                "    In the previous year 0 people starved to death.\n" +
                "    In the previous year 5 people entered the kingdom.\n" +
                "    The population is now 100.\n" +
                "    We harvested 3000 bushels at 3 bushels per acre.\n" +
                "    Rats destroyed 200 bushels, leaving 2800 bushels in storage.\n" +
                "    The city owns 1000 acres of land.\n" +
                "    Land is currently worth 19 bushels per acre. \n    bushels remaining: " + bushels + "\n    acresOwned: " + acresOwned);

    }
    public String endOfYearSummary(){
        String answer = "\nHAMURABI:  I BEG TO REPORT TO YOU,\n" +
                "IN YEAR " + year + ", " + deaths + " PEOPLE STARVED, " + population + " CAME TO THE CITY.\n";
//        if (plague) {
//            population = population / 2;
//            answer += "A HORRIBLE PLAGUE STRUCK!  HALF THE PEOPLE DIED.\n";
//        }
        answer += "POPULATION IS NOW " + population + ".\n" +
                "THE CITY NOW OWNS " + acresOwned + " ACRES.\n" +
                "YOU HARVESTED " + yield + " BUSHELS PER ACRE.\n" +
//                "RATS ATE " + eaten + " BUSHELS.\n" +
                "YOU NOW HAVE " + bushels + " BUSHELS IN STORE\n\n" +
                "LAND IS TRADING AT " + landValue + " BUSHELS PER ACRE.";
        return answer;
    }

}
