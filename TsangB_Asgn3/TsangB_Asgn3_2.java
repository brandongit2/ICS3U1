/***
 * Brandon Tsang
 * February 9, 2018
 * Assignment 3: Variables - Part 2
 * ICS3U6-07 | Ms. Strelkovska
 */

public class TsangB_Asgn3_2 {
    static final double TICKET_COST = 83.99;

    public static void main(String[] args) {
        double money = (float) Math.round((Math.random() * 985 + 15) * 100) / 100.0;
        System.out.println("With " + money + " dollars you can buy " + (int) (money / TICKET_COST) + " tickets.");
        double change = Math.floor(money % TICKET_COST * 100) / 100;
        System.out.printf("The change is %d dollars and %d cents.\n", (int) change, Math.round((change - Math.floor(change)) * 100));
    }
}
