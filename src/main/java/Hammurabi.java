import java.util.Random;
import java.util.Scanner;

public class Hammurabi {
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        new Hammurabi().playGame();
    }

    void playGame() {
        int population = 100;
        int grain = 2800; //bushels of grain in storage
        int land = 1000;
        int valueBushelsPerAcre = 19; // land value is 19 bushels/acre
        int years = 10;
    }

        public static int askHowManyAcresToBuy (int price, int bushels) {
            Scanner scan1 = new Scanner (System.in);
            System.out.println("How many acres would you like to buy?");
            //Buying =
            int numberOfAcresToBuy = scan1.nextInt();

        }


        //for (int i = 0; i < years ; i ++) {


//            System.out.println("O great Hammurabi!\n" +
//                    "You are in year 1 of your ten year rule.\n" +
//                    "In the previous year 0 people starved to death.\n" +
//                    "In the previous year 5 people entered the kingdom.\n" +
//                    "The population is now 100.\n" +
//                    "We harvested 3000 bushels at 3 bushels per acre.\n" +
//                    "Rats destroyed 200 bushels, leaving 2800 bushels in storage.\n" +
//                    "The city owns 1000 acres of land.\n" +
//                    "Land is currently worth 19 bushels per acre.");



        //Ask the questions in this order. No backing up. No changing answers.
        int askHowManyAcresToBuy(int price, int bushels)
        int askHowManyAcresToSell(int acresOwned)
        int askHowMuchGrainToFeedPeople(int bushels)

    public static int askHowManyAcresToPlant(int acresOwned, int population, int bushels) {
       int acresToPlant = 0;
        if(acresToPlant > acresOwned) {
        System.out.println(" O Hammurabi, but you only have" + acresOwned + " acres for which to plant!");
        } else if ((acresToPlant > 10*  population)) {
            System.out.println(" O Hammurabi, but you only have" + acresOwned + " acres for which to increase your grain!");
        } else if (acresToPlant < 2 * bushels)
    }

    public int plagueDeath (int population) {
        return randomChance(15) ? population/2 : 0;
    }

    public int newCostOfLand(){
        return rand.nextInt(7)+17; //bound is exclusive
    }

    public int harvest(int acresPlantedWithSeeds){
        return (rand.nextInt(6)+1)*acresPlantedWithSeeds;
    }

    public int grainEatenByRats(int bushels){
        return randomChance(40)
                ? (rand.nextInt(21)+10)*bushels / 100 //bound is exclusive
                :0;
    }

    public boolean randomChance(double chanceOfOccurrence){
        Random rand = new Random();
        return rand.nextDouble()<(chanceOfOccurrence/100);
    }
}
