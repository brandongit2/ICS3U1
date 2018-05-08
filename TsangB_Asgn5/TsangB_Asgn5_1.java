/***
 * Brandon Tsang
 * February 21, 2018
 * Assignment 5.1: Scanner practice part 1
 * ICS3U1-07 | Ms. Strelkovska
 */

public class TsangB_Asgn5_1 extends Butils {
    public static void main(String[] args) {
        String price = input("Enter a price less than $1.00 (in cents): ");
        int cents    = Integer.parseInt(price);
        int quarters = cents / 25;
        cents       -= quarters * 25;
        int dimes    = cents / 10;
        cents       -= dimes * 10;
        int nickels  = cents / 5;
        cents       -= nickels * 5;
        int pennies  = cents;
        printf("%-10s%-10s%-10s%-10s%-10s\n", "Cents", "Quarters", "Dimes", "Nickels", "Pennies");
        printf("%-10d%-10d%-10d%-10d%-10d\n", Integer.parseInt(price), quarters, dimes, nickels, pennies);
    }
}
