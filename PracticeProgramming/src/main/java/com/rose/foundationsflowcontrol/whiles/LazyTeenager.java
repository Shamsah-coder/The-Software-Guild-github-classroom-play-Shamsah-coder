/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rose.foundationsflowcontrol.whiles;

import java.util.Random;

/**
 *
 * @author User
 */
public class LazyTeenager {
    public static void main(String[] args) {
        
        //import randomizer and set max value to 7
        Random randomizer = new Random(7);
        int value = randomizer.nextInt(7);
        
        //Assuming he'll clean his room after telling him 4 times
        
       while (value >=4)
       {
        System.out.println("Clean your room!");
        value +=1;
            
        if (value ==7){
           System.out.println("FINE!  I'LL CLEAN MY ROOM! BUT I REFUSE TO EAT MY PEAS!!!");
        break; }
       }
   //Assuming you'll have to tell him more than 4 times
         
       
        while (value >=0)
       {
          System.out.println("Clean your room!!");
          value +=1;
          
        if  (value ==7){
              System.out.println("THAT'S IT! I'll do it! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX AWAY!");
         break;  }
         
    }
       }
}


        
          
    
    
    
