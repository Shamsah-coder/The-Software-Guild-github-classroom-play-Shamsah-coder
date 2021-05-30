/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rose.foundationsscanner;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class MiniMadLibs {
    public static void main(String[] args) {
        int number;
        String noun, secondNoun, adjective, secondAdjective, pluralNoun, secondPlural;
        String thirdPlural, verb, pastParticiple;
        
        Scanner inputReader = new Scanner (System.in);
        
        System.out.println("I need a noun: ");
        noun = inputReader.nextLine();
        
        System.out.println("Now an adjective: ");
        adjective = inputReader.nextLine();
        
        System.out.println("Another noun: ");
        secondNoun = inputReader.nextLine();
        
        System.out.println("Add a number: ");
        number = Integer.parseInt(inputReader.nextLine());
        
        System.out.println("Another adjective: ");
        secondAdjective = inputReader.nextLine();
        
        System.out.println("A plural noun: ");
        pluralNoun = inputReader.nextLine();
        
        System.out.println("Another one: ");
        secondPlural = inputReader.nextLine();
        
        System.out.println("One more: ");
        thirdPlural = inputReader.nextLine();
        
        System.out.println("I need a verb in the infinitive form: ");
        verb = inputReader.nextLine();
        
        System.out.println("I need the same verb in the past participle: ");
        pastParticiple = inputReader.nextLine();
        
        System.out.println("*****Now Let's Get Mad (libs)*****");
        
        System.out.println("");
        
        System.out.println(noun + "" + ": The " + adjective + "" + ". These are the vogages" );
        System.out.println("of the starship " + secondNoun + "" + " Its " + number + "" + " - year mission: to  ");
        System.out.println("explore strange " + secondAdjective + " " + pluralNoun + " " + ", to seek out " + secondAdjective + " " + secondPlural + "");
        System.out.println("and " + secondAdjective + " " + thirdPlural + "" + ", to boldly " + verb + "" + " where no one has");
        System.out.println(pastParticiple + "" + " before.");
        
        
       
    }
}
