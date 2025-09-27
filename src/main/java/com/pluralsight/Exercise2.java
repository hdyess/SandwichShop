package com.pluralsight;
import java.util.*;

public class Exercise2 {
    public static void runShop(){

        // declare variables
        // initializing these in case they conflict with exercise 1
        int sandSize = 0;
        int customerAge = 0;
        double customerDiscount = 0.;
        double sandPriceTracker = 0.;
        int sandIsLoaded;
        double loadedPriceTracker = 0;




        // construct new scanner
        Scanner getInput = new Scanner(System.in);

        // prompt and grab input for size and age
        System.out.println("Input 0 for a regular sandwich, and 1 for a large:");
        sandSize = getInput.nextInt();

        System.out.println("Input your age:");
        customerAge = getInput.nextInt();

        System.out.println("Input 0 for a regular sandwich, and 1 for a loaded sandwich.");
        sandIsLoaded = getInput.nextInt();

        /*
        set the price and discount
        changed this to add to a variable that tracks price instead of
        declaring in the if statement this lets you handle loaded price without nesting
        */

        if (sandSize == 0){
            sandPriceTracker += 5.45;
            loadedPriceTracker += 1.;
        } else {
            sandPriceTracker += 8.95;
            loadedPriceTracker += 1.75;
        }

        if (sandIsLoaded == 1) {
            sandPriceTracker += loadedPriceTracker;
        }

        if (customerAge <= 17){
            customerDiscount = .1;
        } else if (customerAge >= 65){
            customerDiscount = .2;
        }

        // calculate and tell user their finalPrice
        sandPriceTracker = sandPriceTracker*(1-customerDiscount);
        System.out.printf("\nYour total is $%.2f.\n", sandPriceTracker);

    }
}
