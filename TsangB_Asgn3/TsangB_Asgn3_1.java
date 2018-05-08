/***
 * Brandon Tsang
 * February 9, 2018
 * Assignment 3: Variables - Part 1
 * ICS3U6-07 | Ms. Strelkovska
 */

public class TsangB_Asgn3_1 {
    public static void main(String[] args) {
        // NO NEED TO CHANGE SECONDS; IT IS ALREADY RANDOM
        int seconds = (int) (Math.random() * 9000) + 999;                           // Assign random number from 999 to 9999 to seconds
        System.out.println("Number of seconds is " + seconds);
        int hours = (int) seconds / 3600;
        int minutes = (int) seconds / 60 - hours * 60;
        seconds -= hours * 3600 + minutes * 60;
        System.out.printf("The time is: %d:%02d:%02d\n", hours, minutes, seconds);
    }
}
