/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rose.foundationsvariables;

/**
 *
 * @author User
 */
public class TheOrderOfThings {
    public static void main(String[] args) {
        double number;
        String opinion, size, age, shape, color, origin, material, purpose;
        String noun;

        number = 5.0;
        opinion = "VERY WEALTHY";
        size = "tall";
        age = "young";
        shape = "muscular";
        color = "medium beige";
        origin = "Canadian";
        material = "naked";
        purpose = "good";

        noun = "men";

        // Using the + with strings doesn't add -- it concatenates! (sticks them together)
        // If you leave out the " ", there will be no space between the words
        System.out.println(number  + " " + opinion + " " + size + " " + age + " " + shape
                 + " " + color + " " + origin + " " + material + " " + purpose + " " + noun);
        System.out.println("JUST WHAT I WANTED");
    }
}
