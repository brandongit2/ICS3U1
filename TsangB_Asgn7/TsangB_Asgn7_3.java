/***
 * Brandon Tsang
 * February 28, 2018
 * Assignment 7.3: Scanner Excercises 2 part 3 (Bonus)
 * ICS3U1-07 | Ms. Strelkovska
 */

public class TsangB_Asgn7_3 extends Butils {
    public static void main(String[] args) {
        try {
            double height = numInput("Enter height of cone:         ");
            double radius = numInput("Enter radius of cone:         ");
            double volume = numInput("Enter volume of water poured: ");

            double bigConeVolume = Math.PI * Math.pow(radius, 2) * (height / 3);
            double heightRatio   = Math.pow(volume / bigConeVolume, 1 / 3.0);
            double newHeight     = heightRatio * height;
            println(newHeight);
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }
}
