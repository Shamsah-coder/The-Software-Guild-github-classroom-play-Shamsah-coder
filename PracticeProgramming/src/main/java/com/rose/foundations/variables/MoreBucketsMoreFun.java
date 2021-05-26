/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rose.foundations.variables;

/**
 *
 * @author User
 */
public class MoreBucketsMoreFun {
    public static void main(String[] args) {
        // Declare ALL THE THINGS at beginning of program, int for integers
        int butterflies, beetles, bugs;

        // Now give a couple of them some values
        butterflies = 5;
        beetles = 9;

        bugs = butterflies + beetles;
        System.out.println("There are only " + butterflies + " butterflies,");
        System.out.println("but there are " + bugs + " bugs in all.");

        System.out.println("Uh oh, my dog ate one.");
        
        // The use of the operator -- is a shortcut to say -1 of the int.
        butterflies--;
       
        System.out.println("Now there are only " + butterflies + " butterflies left.");
        
        /* The value of bugs was predefined at the beginning of the program, that won't change
         although the the value of butterflies changed, unless the value of bugs is defined
         again as being butterflies plus bugs; however, if we write butterflies -- plus bugs
        then the value of bugs will be the original value of beetles plus butterflies minus 2.
         */
        System.out.println("But there are still " + bugs + " bugs left...");
        System.out.println("Wait a minute!");
        System.out.println("... maybe my computer can't do math, after all!");
    }
   
            
    
}
