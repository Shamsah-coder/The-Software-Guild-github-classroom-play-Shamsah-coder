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
public class StayPositive {
    public static void main(String[] args) {
        
        int minNum = 0;
        int maxNum = 10;
        
        while (maxNum > minNum){
            System.out.println(maxNum);
            //count down, don't forget to open and close block with curly brackets {
            
            maxNum--;}
        
        
        System.out.println("Blast Off!");
    }
    
}
