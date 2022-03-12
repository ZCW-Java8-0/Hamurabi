package hammurabi.src.main.java;

import java.util.Random;
import java.util.Scanner;

public class Hammurabi {
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int people = 100;
        int bushels = 2800; //grain in storage
        int land = 1000;  //land value is 19 bushels/acre
        new Hammurabi().playGame();
    }

    void playGame() {

    }
}
