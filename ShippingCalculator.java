import java.util.Scanner;

/*
The cost to ship a package is a flat fee of 75 cents plus 25 cents per pound.
1. Declare a constant named CENTS_PER_POUND and initialize with 25.
2. Get the shipping weight from user input storing the weight into shipWeightPounds.
3. Using FLAT_FEE_CENTS and CENTS_PER_POUND constants, assign shipCostCents with the cost of shipping a package weighing shipWeightPounds.
 */

public class ShippingCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int shipWeightPounds;
        int shipCostCents = 0;
        final int FLAT_FEE_CENTS = 75;

        final int CENTS_PER_POUND = 25;

        System.out.println("What is the shipping weight? ");
        shipWeightPounds = scnr.nextInt();

        shipCostCents = (CENTS_PER_POUND * shipWeightPounds) + FLAT_FEE_CENTS;




        System.out.println("Weight(lb): " + shipWeightPounds);
        System.out.println("Flat fee(cents): " + FLAT_FEE_CENTS);
        System.out.println("Cents per pound: " + CENTS_PER_POUND);
        System.out.println("Shipping cost(cents): " + shipCostCents);
    }
}