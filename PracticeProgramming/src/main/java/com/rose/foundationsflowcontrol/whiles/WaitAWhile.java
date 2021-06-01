/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rose.foundationsflowcontrol.whiles;

/**
 *
 * @author User
 */
public class WaitAWhile {
    public static void main(String[] args) {
        
        int timeNow = 5;
        int bedTime = 10;

        while (timeNow <bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            // Time passes
            timeNow++; 
        
        }
        //End first block of code, when time now reaches 10 'o' clock, end loop
        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");
    }
}
