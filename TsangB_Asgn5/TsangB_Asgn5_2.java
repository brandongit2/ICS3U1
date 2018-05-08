/***
 * Brandon Tsang
 * February 21, 2018
 * Assignment 5.2: Scanner practice part 2
 * ICS3U1-07 | Ms. Strelkovska
 */

public class TsangB_Asgn5_2 extends Butils {
    public static void main(String[] args) {
        double amt   = inputDouble("How much do you want to invest?             ");
        double rate  = inputDouble("Enter an yearly interest rate (in percent): ") / 100;
        int    years = inputInt("How many years should the investment last?  ");
        String name  = input("What is your name?                          ");
        double investment = amt * Math.pow(1 + (rate / 12), years * 12);

        printf("Hi, %s. Your investment will be worth $%.2f.\n", name, Math.round(investment * 100) / 100.0);
    }
}
