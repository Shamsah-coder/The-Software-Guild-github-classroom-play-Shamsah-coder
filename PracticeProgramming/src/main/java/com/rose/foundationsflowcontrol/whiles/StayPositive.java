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
public class StayPositive {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        int minNum = 0;
        int maxNum;
        
        System.out.println("Choose a number from 1 to 30 to countdown from: ");
        maxNum = userInput.nextInt();
        System.out.println("Here goes...");
        
        while (maxNum > (minNum + 20) ){
            System.out.print(maxNum + ",");
        //count down, don't forget to open and close block with curly brackets {
        maxNum--;}
        //separate line
        System.out.println("");
        
        while ((maxNum) > (minNum + 10)) {
            System.out.print((maxNum) + ",");
            maxNum--;}
        System.out.println("");
        
        while (maxNum > minNum) {
            System.out.print( maxNum + ",");
            maxNum--;}
        System.out.println("");
        
     System.out.println(" Blast Off!");
    }
   
}
