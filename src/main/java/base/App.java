package base;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Scott Matson
 */
/*
Exercise 10 - Self-Checkout

Working with multiple inputs and currency can introduce some tricky precision issues.

Create a simple self-checkout system. Prompt for the prices and quantities of three items. Calculate the subtotal of the items.
Then calculate the tax using a tax rate of 5.5%. Print out the line items with the quantity and total, and then print out the subtotal, tax amount, and total.

Example Output

Enter the price of item 1: 25
Enter the quantity of item 1: 2
Enter the price of item 2: 10
Enter the quantity of item 2: 1
Enter the price of item 3: 4
Enter the quantity of item 3: 1
Subtotal: $64.00
Tax: $3.52
Total: $67.52

Constraints
-Keep the input, processing, and output parts of your program separate. Collect the input, then do the math operations and string building,
and then print out the output.
-Be sure you explicitly convert input to numerical data before doing any calculations.

Challenges
-Revise the program to ensure that prices and quantities are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
-Alter the program so that an indeterminate number of items can be entered. The tax and total are computed when there are no more items to be entered.

 */
public class App {
    private static final double tax = 0.055;

    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);

        System.out.print("Enter the price of item 1: ");
        double item1p = ui.nextFloat();
        System.out.print("Enter the quantity of item 1: ");
        double item1q = ui.nextFloat();

        System.out.print("Enter the price of item 2: ");
        double item2p = ui.nextFloat();
        System.out.print("Enter the quantity of item 2: ");
        double item2q = ui.nextFloat();

        System.out.print("Enter the price of item 3: ");
        double item3p = ui.nextFloat();
        System.out.print("Enter the quantity of item 3: ");
        double item3q = ui.nextFloat();

        double sum = ((item1p * item1q) + (item2p * item2q) + (item3p * item3q));
        double tax_amount = sum * tax;
        double total = sum + tax_amount;

        DecimalFormat df = new DecimalFormat("###.00");

        System.out.println("Subtotal: $" + df.format(sum));
        System.out.println("Tax: $" + df.format(tax_amount));
        System.out.println("Total: $" + df.format(total));
    }
}
