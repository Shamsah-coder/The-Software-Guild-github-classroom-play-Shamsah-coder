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
    public class TraditionalFizzBuzzRami {
        
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many units of fizzing and buzzing do you need in your life?");
        int userNum = userInput.nextInt();
        int count = 0;
        System.out.println("");
        for (int i = 0; count < userNum; i++) {
            if (i==0) {
                System.out.println(i);
            } else if (i%3 == 0 && i%5 == 0) {
                System.out.println("fizz buzz");
                count++;
            } else if (i%3 == 0){
                System.out.println("fizz");
                count++;
            } else if (i%5 == 0){
                System.out.println("buzz");
                count++;
            } else {
                System.out.println("" + i); 
            }
        }
        System.out.println("Tradition!!!!!");
    }
}

