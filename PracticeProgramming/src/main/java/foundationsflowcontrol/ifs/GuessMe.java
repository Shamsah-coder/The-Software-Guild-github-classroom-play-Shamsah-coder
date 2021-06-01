/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foundationsflowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class GuessMe {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        int operator = 750;
        int choice;
        
        System.out.println("Please choose a number between 1 and 1000 : ");
        choice = Integer.parseInt(userInput.nextLine());
        
       if (choice == operator) {
           System.out.println("Wow, nice guess " + choice + "" + " That was it!"); 
    
       }else if (choice < operator) {
           System.out.println("Ha, Ha, nice try " + choice + "" + " is too low, I chose " + operator +"");
       }else if  (choice > operator){
           System.out.println("Too bad " + choice +"" + " is way too high, I chose " + operator + "");
       }
       
    
    }
        
}



