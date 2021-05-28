/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rose.foundationsscanner;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PassingTheTuringTest {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner (System.in);
        
        String yourName;
        String favouriteColour;
        String favouriteFood;
        int favouriteNumber;
        
        System.out.println("What is your name?");
        inputReader.nextLine();
        System.out.println("My name is Rose.");
        System.out.println("What is your favourite colour?");
        inputReader.nextLine();
        System.out.println("Really.  " + "Mine is green.");
        System.out.println("What is your favourite number?");
        Integer.parseInt (inputReader.nextLine());
        System.out.println("That's a cool number, mine is 7");
        System.out.println("Talk to you later");
        
    }
    
}
