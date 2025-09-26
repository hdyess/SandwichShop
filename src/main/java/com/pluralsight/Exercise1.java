package com.pluralsight;
import java.util.*;

public class Exercise1 {
    public static void main(String[] args){

        // declare variables
        int sandSize;
        double sandBasePrice;
        int customerAge;
        //initializing so final calculation doesn't break if customer discount is 0
        double customerDiscount = .0;
        double sandFinalPrice;


        // construct new scanner
        Scanner getInput = new Scanner(System.in);

        // prompt and grab input for size and age
        System.out.println("Input 0 for a regular sandwich, and 1 for a large:");
        sandSize = getInput.nextInt();

        System.out.println("Input your age:");
        customerAge = getInput.nextInt();

        // set the price and discount
        if (sandSize == 0){
            sandBasePrice = 5.45;
        } else {
            sandBasePrice = 8.95;
        }

        if (customerAge <= 17){
            customerDiscount = .1;
        } else if (customerAge >= 65){
            customerDiscount = .2;
        }

        // calculate and tell user their finalPrice
        sandFinalPrice = sandBasePrice*(1-customerDiscount);
        System.out.printf("\nYour total is $%.2f.", sandFinalPrice);

    }
}
