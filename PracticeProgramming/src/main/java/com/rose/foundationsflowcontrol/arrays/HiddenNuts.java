/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rose.foundationsflowcontrol.arrays;

import java.util.Random;

/**
 *
 * @author User
 */
public class HiddenNuts {
  
        public static void main(String[] args) {
        
    
        String[] hidingSpots = new String [100];
        Random squirrel = new Random();
                
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "nut";
        System.out.println("The nut has been hidden ...");

        // Nut finding code 
     
       // int hidingSpots = {1, 3, 55, 42, 66, 25, 99,48};
              
        System.out.println (("Found it, it's in spot # ") + hidingSpots[squirrel.nextInt(hidingSpots.length)]);
      
            }
    



}
 
       


      
