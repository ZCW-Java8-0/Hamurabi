package hammurabi.src.main.java;

import java.util.Random;
import java.util.Scanner;

public class Hammurabi {
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);

    public int plagueDeath (int population) {
        return randomChance(15) ? population/2 : population;
    }

    public int grainEatenByRats(int bushels){
        return randomChance(40)
                ? (100-(rand.nextInt(20)+10))*bushels / 100
                :bushels;
    }

    public boolean randomChance(double chanceOfOccurrence){
        Random rand = new Random();
        return rand.nextDouble()>(chanceOfOccurrence/100);
    }
}
