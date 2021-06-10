/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rose.foundationsflowcontrol.methods;

import java.util.Random;

/**
 *
 * @author User
 */
public class BarelyControlledChaos {
    Random range = new Random();
 
    public static void main(String args[]) {
        String color = getColor();
        String animal = getAnimal();
        String colorAgain = getColor();
        int weight = getRandomInt(200, 5);
        int distance = getRandomInt(20, 10);
        int number = getRandomInt(20000, 10000);
        int time = getRandomInt(6, 2);
        System.out.println("Once, when I was very small...");
        System.out.println("I was chased by a " + color + ", " + weight + "lb" +
                " miniature " + animal + " for over " + distance + " miles!!");
        System.out.println("I had to hide in a field of over " + number + " " + 
                colorAgain + " poppies for nearly " + time + " hours until it "
                        + "left me alone!");
        System.out.println("\nIt was QUITE the experience, let me tell you!");
    }
    static String getColor() {
        Random randomChoice = new Random();
        String[] colorArray = {"burgundy", "teal", "violet", "seafoam", "indigo"};
        return colorArray[randomChoice.nextInt(colorArray.length)];
    }
    static String getAnimal() {
       
        Random randomChoice = new Random();
        String[] animalArray = {"zebra", "chimpanzee", "blowfish", "lemur", "hyena"};
        return animalArray[randomChoice.nextInt(animalArray.length)];
    }
    static int getRandomInt(int Max, int Min) {
        Random randomNumber = new Random();
        int num = randomNumber.nextInt(Max - Min) + Min;
        return num;
    }
}  

