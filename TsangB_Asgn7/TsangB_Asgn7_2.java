/***
 * Brandon Tsang
 * February 23, 2018
 * Assignment 7.2: Scanner practice 2 part 2
 * ICS3U1-07 | Ms. Strelkovska
 */

import java.util.*;

public class TsangB_Asgn7_2 extends Butils {
    public static void main(String[] args) {
        try {
            ArrayList<Double> center = spaceSepNumInput("Enter space-separated coordinates for the center of a circle:                     ");
            ArrayList<Double> point  = spaceSepNumInput("Enter space-separated coordinates for a point on the circumference of the circle: ");

            double area = Math.PI * Math.pow(Math.hypot(Math.abs(point.get(0) - center.get(0)), point.get(1) - center.get(1)), 2);
            println("The area of the circle is " + area + ".");
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }
}
