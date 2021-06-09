/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rose.foundationsflowcontrol.methods;

import java.util.Random;

/**
 *
 * @author User
 */
public class RandomRockPaperScissors {
    public static void main(String[] args) {
      Random range = new Random();
     
        String choices [] = {"Rock", "Paper", "Scissors"};
        System.out.println(("My choice is: ")+ choices[new Random().nextInt(choices.length)]);        
   
}
} 


