package hammurabi;

import java.util.Random;
import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class Hammurabi {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Hammurabi().playGame(); // new Hammurabi object that calls the playGame method
    }

    // public static String getStringInput(String prompt) {
        // Scanner scanner = new Scanner(System.in);
        // println(prompt);
        // String userInputString = scanner.nextLine();
        // return userInputString;
    // }

    void playGame() {
        int population = 100;
        int bushelsGrain = 2800;
        int acresLand = 1000;
        int landValueBushelsPerAcre = 19;
        int year = 0;
        int numberOfAcresToBuy = 0;
        int numberOfAcresToSell = 0;
        // "statements go after declarations" --- maybe the ones that reference other methods?

        // numberOfAcresToBuy
        numberOfAcresToBuy = askHowManyAcresToBuy(landValueBushelsPerAcre, bushelsGrain, acresLand);
        acresLand += numberOfAcresToBuy;
        bushelsGrain -= landValueBushelsPerAcre * numberOfAcresToBuy;

        // numberOfAcresToSell
        if(numberOfAcresToBuy == 0) {
            numberOfAcresToSell = askHowManyAcresToSell(acresLand);
            acresLand -= numberOfAcresToSell;
            bushelsGrain += landValueBushelsPerAcre * numberOfAcresToSell;
        }

        // reset temporary variables
        numberOfAcresToBuy = 0;
        numberOfAcresToSell = 0;

        System.out.println(acresLand); // just for testing
        System.out.println(bushelsGrain); // just for testing
    }

    public int askHowManyAcresToBuy(int price, int bushelsGrain, int acresLand) {
        System.out.println("How many acres would you like to buy?");
        // Scanner scanner1 = new Scanner(System.in);
        int numberOfAcresToBuy = Integer.parseInt(scanner.nextLine());
        if(numberOfAcresToBuy >= 0 && price * numberOfAcresToBuy <= bushelsGrain) {
            System.out.println("You bought " + numberOfAcresToBuy + " acres.");
        } else if(numberOfAcresToBuy < 0 && price * numberOfAcresToBuy <= bushelsGrain) {
            System.out.println("Invalid Entry: Negative Number");
            askHowManyAcresToBuy(price, bushelsGrain, acresLand);
        } else if (numberOfAcresToBuy >= 0 && price * numberOfAcresToBuy > bushelsGrain) {
            System.out.println("Invalid Entry: Price Exceeds Bushels In Storage");
            askHowManyAcresToBuy(price, bushelsGrain, acresLand);
        }
        // scanner1.close();
        return numberOfAcresToBuy;
    }

    public int askHowManyAcresToSell(int acresLand) {
        System.out.println("How many acres would you like to sell?");
        // Scanner scanner2 = new Scanner(System.in);
        int numberOfAcresToSell = Integer.parseInt(scanner.nextLine());
        if(numberOfAcresToSell >= 0 && numberOfAcresToSell <= acresLand) {
            System.out.println("You sold " + numberOfAcresToSell + " acres.");
        } else if(numberOfAcresToSell < 0) {
            System.out.println("Invalid Entry: Negative Number");
            askHowManyAcresToSell(acresLand);
        } else if (numberOfAcresToSell > acresLand) {
            System.out.println("Invalid Entry: Input Exceeds Acres Owned");
            askHowManyAcresToSell(acresLand);
        }
        // scanner2.close();
        return numberOfAcresToSell;
    }

    // other methods go here
    // ask, update variables
}
