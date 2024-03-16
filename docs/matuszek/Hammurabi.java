package hammurabi.docs.matuszek;

import java.util.Random;
import java.util.Scanner;

public class Hammurabi {
    Random rand = new Random();  // this is an instance variable
    Scanner scanner = new Scanner(System.in);
    static int totalDeaths = 0, percentDied = 0, year = 0, population = 95, bushels = 2800, immigrants = 5, deaths, harvest = 3000, yeild = 3, acres = harvest / yeild, eaten = harvest - bushels, price, fullPeople, temp;

    public static void main(String[] args) { // required in every Java program
        new Hammurabi().playGame();

    }

    void playGame() {
        // declare local variables here: grain, population, etc.
        int population = 100;
        int bushels = 2800;
        int acresOwned = 1000;
        int price = 19;

        for (int year = 1; year <= 10; year++) {
            // statements go after the declarations
            System.out.println(printSummary());
        askHowManyAcresToBuy(price, bushels);


            // Your game logic for each year will go here
        }
    }

    int askHowManyAcresToBuy(int price, int bushels) {
        System.out.println("How many acres would you like to buy? ");
        int acresBought = scanner.nextInt();
        if( acresBought < 0) {
            System.out.println("Not a valid choice");
        } else if(acresBought * price > bushels){
            System.out.println("Not enough stores");
        } else if( acresBought * price < bushels){
            this.acres += acresBought;
            this.bushels -= acresBought * price;
        }
        return acres += acresBought;
    }

    int askHowManyAcresToSell(int acresOwned) {
        System.out.println("How many acres would you like to sell? ");
        int acresSold = scanner.nextInt();
        if(acresSold < 0){
            System.out.println("Not a valid choice");
        } else if (acresSold > acres) {
            System.out.println("You do not own that many acres! ");
        } else if (acresSold <= acres) {
            this.acres -= acresSold;
            this.bushels += acresSold * price;

        }

        return this.acres -= acresSold;
    }

    int askHowMuchGrainToFeedPeople(int bushels) {
        
        return 0;
    }

    int askHowManyAcresToPlant(int acresOwned, int population, int bushels) {
        return 0;
    }
    public String printSummary(){
        String answer = "\nHAMURABI:  I BEG TO REPORT TO YOU,\n" +
                "IN YEAR " + year + ", " + deaths + " PEOPLE STARVED, " + immigrants + " CAME TO THE CITY.\n";

        answer += "POPULATION IS NOW " + population + ".\n" +
                "THE CITY NOW OWNS " + acres + " ACRES.\n" +
                "YOU HARVESTED " + yeild + " BUSHELS PER ACRE.\n" +
                "RATS ATE " + eaten + " BUSHELS.\n" +
                "YOU NOW HAVE " + bushels + " BUSHELS IN STORE\n\n" +
                "LAND IS TRADING AT " + price + " BUSHELS PER ACRE.";
        return answer;
    }


//    public int plagueDeaths(int i) {
//        return 0;
//    }


    public int starvationDeaths(int population, int bushelsFedToPeople) {
        int requiredGrain = population * 20;
        if (bushelsFedToPeople < requiredGrain) {
            return(requiredGrain - bushelsFedToPeople + 19) / 20;
        }
        return 0;
    }

    public boolean uprising(int i, int i1) {
        return false;
    }

//    public int immigrants(int i, int i1, int i2) {
//        return 0;
//    }

    public int harvest(int i) {
        return 0;
    }

//    public int grainEatenByRats(int i) {
//        return 0;
//    }

    public int newCostOfLand() {
        return 0;
    }


    //other methods go here
}
