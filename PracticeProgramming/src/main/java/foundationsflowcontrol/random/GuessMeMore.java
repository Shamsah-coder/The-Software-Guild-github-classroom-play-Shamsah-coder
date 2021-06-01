/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foundationsflowcontrol.random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class GuessMeMore {
    public static void main(String[] args) {
        
        Random rng = new Random();
        
        int operator = 75;
        int choice = -100+rng.nextInt(100- (-100));
        
        System.out.println("I've chosen a number between -100 and 100. Betcha can't guess it! Guess:" + choice);
        
       if (choice == operator) {
           System.out.println("Wow, nice guess " + choice + "" + " That was it!"); 
    
       }else if (choice < operator) {
           System.out.println("Ha, Ha, nice try " + choice + "" + " is too low, I chose " + operator +"");
       }else if  (choice > operator){
           System.out.println("Too bad " + choice +"" + " is way too high, I chose " + operator + "");
       }
       
    
    }
        
}



