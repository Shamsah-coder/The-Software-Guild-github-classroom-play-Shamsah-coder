/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rose.foundationsflowcontrol.fors;

/**
 *
 * @author User
 */
public class SpringForwardFallBack {
    public static void main(String[] args) {
//This loop stops at 9
        System.out.println("It's Spring...!");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");
        }
//This loop stops at 1, as i is defined at 10, loop will execute 10 times
        System.out.println("Oh no, it's fall...");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + ", ");
        }
}
}