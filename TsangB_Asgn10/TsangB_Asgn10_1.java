/***
 * Brandon Tsang
 * February 28, 2018
 * Assignment 8.1: If Excercises 2 part 1
 * ICS3U1-07 | Ms. Strelkovska
 */

import java.util.*;

public class TsangB_Asgn10_1 extends Butils {
    public static void main(String[] args) {
        try {
            double[] radii = new double[2];
            radii[0] = numInput("Enter radius 1:                                ");
            radii[1] = numInput("Enter radius 2:                                ");
            Arrays.sort(radii);

            ArrayList<Double> point         = spaceSepNumInput("Enter space-separated coordinates for a point: ", 2);
            double            pointToOrigin = Math.abs(Math.hypot(point.get(0), point.get(1)));
            boolean           pointInRadii  = pointToOrigin >= radii[0] && pointToOrigin <= radii[1];

            println("Your point " + (pointInRadii ? "lies" : "does not lie") + " in the region.");
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }
}
