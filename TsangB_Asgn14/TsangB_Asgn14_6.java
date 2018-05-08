/***
 * Brandon Tsang
 * March 28, 2018
 * Assignment 14.6: Loop exercises part 6
 * ICS3U1-07 | Ms. Strelkovska
 */

public class TsangB_Asgn14_6 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%3s ", (int) (Math.random() * 100) + 1);
            }
            System.out.println("");
        }
    }
}
