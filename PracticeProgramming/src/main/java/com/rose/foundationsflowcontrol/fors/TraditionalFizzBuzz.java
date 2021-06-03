/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rose.foundationsflowcontrol.fors;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TraditionalFizzBuzz {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner (System.in);
        
        String yourNumber, fizz, buzz;
       
        
        System.out.println("Please choose a number between 1 and 15");
        yourNumber = inputReader.nextLine();
        int num = 0;
      
        for (int i =0; i <= 2; i++) {
            System.out.println(i + "");
        }    
        for (int i =3; i ==3; i++){
             
            System.out.println("fizz");
        }
        for (int i =4; i==4; i++){
            System.out.println(i + "");
        }
        for (int i =5; i==5; i++)
            System.out.println("buzz");
        }
        
    
}
    