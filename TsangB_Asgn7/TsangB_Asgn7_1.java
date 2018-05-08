/***
 * Brandon Tsang
 * February 22, 2018
 * Assignment 7.1: Scanner practice 2 part 1
 * ICS3U1-07 | Ms. Strelkovska
 */

public class TsangB_Asgn7_1 extends Butils {
    public static void main(String[] args) {
        try {
            String in = validateInput("Enter three space-separated marks: ", "^(-?[0-9]{1,2}|-?100) (-?[0-9]{1,2}|-?100) (-?[0-9]{1,2}|-?100)$");
            String[] marks_s = in.split(" ");
            int sum = 0;
            for (String i : marks_s) {
                int j = Integer.parseInt(i);
                if (j < 0 || j > 100) {
                    throw new InvalidInputException("One or more marks are out of bounds.");
                }
                sum += j;
            }
            String courseName = input("Enter the course name:             ");
            printf("Your average for %s is %s.\n", courseName, sum / 3.0);
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }
}
