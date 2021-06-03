/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rose.foundationsflowcontrol.whiles;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class GuessPassword {
    public static void main(String[] args) {
        /* while loop and do while loop by Caleb Curry
        acronym: i.c.u
        *i is initialization
        *c is condition or comparison such as true or false or some value
        *u is update such as i++
        */
        // name variables and import scanner
        
        
        String password = "let me in";
        Scanner inputReader = new Scanner(System.in);
       String yourGuess;
       
        
        System.out.println("Guess the password: ");
        yourGuess = inputReader.nextLine();
        
        //you can put any condition in the while loop, true or false, the ! negates
        //don't forget the open curly brackets
        while(!yourGuess.equals(password))
        {  
            System.out.println("Guess the password: ");
            yourGuess = inputReader.nextLine ();
        }
        
        System.out.println("Contragulations");
        
        
        /* The same code using a "do while" loop, it keeps executing, you don't need to ask again
        *String password = "let me in"
        Scanner inputReader = newScanner (system.in);
        String yourGuess;  (make sure this is defined outside the loop so it can be used again
        do
        {
        System.out.println (Guess the password);
        yourGuess = inputReader.nextLine();
        }while(!yourGuess.equals (password));      ** this time you need semicolon after "while"
        System.out.println("Congratulations);
        
        */
        
    
    }
}

