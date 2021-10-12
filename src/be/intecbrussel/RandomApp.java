package be.intecbrussel;

import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {


        Random  myRandom = new Random();
        int randomNumber = myRandom.nextInt(6) +25;
        System.out.println(randomNumber);


    }


}
