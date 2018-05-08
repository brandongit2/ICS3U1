/***
 * Brandon Tsang
 * March 28, 2018
 * Classwork 1: Roulette Payouts
 * ICS3U1-07 | Ms. Strelkovska
 */

public class TsangB_Classwork1 {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 38);
        System.out.println("The spin resulted in " + (x == 37 ? "00" : x) + ".");

        int[] red = {1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};

        switch (x) {
            case 0:
                System.out.println("Pay 0");
                break;
            case 37: // 00
                System.out.println("Pay 00");
                break;
            default:
                System.out.println("Pay " + x);
                boolean found = false; // For checking if x is in red
                for (int n : red) {
                    if (x == n) {
                        found = true;
                    }
                }
                System.out.println("Pay " + (found ? "red" : "black"));

                if (x % 2 == 0) {
                    System.out.println("Pay even");
                } else if (x % 2 != 0) {
                    System.out.println("Pay odd");
                }

                System.out.println("Pay " + (x <= 18 ? "1 to 18" : "19 to 36"));
                break;
        }
    }
}
