import java.util.*;

public class Butils {
    public static void print(Object str) {
        System.out.print(str);
    }

    public static void println(Object str) {
        System.out.println(str);
    }

    public static void printf(String str, Object... args) {
        System.out.printf(str, args);
    }

    /***
     * Prints a given string, then immediately requests input from the user.
     * Identical to input() in Python.
     *
     * @param str The string to be printed.
     * @return One line of user input.
    */
    public static String input(String str) {
        print(str);
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    /***
     * Prints a given string, then immediately requests input from the user.
     * Gets first integer entered.
     *
     * @param str The string to be printed.
     * @return The first integer entered.
    */
    public static int inputInt(String str) {
        print(str);
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    /***
     * Prints a given string, then immediately requests input from the user.
     * Gets first double entered.
     *
     * @param str The string to be printed.
     * @return The first double entered.
    */
    public static double inputDouble(String str) {
        print(str);
        Scanner s = new Scanner(System.in);
        return s.nextDouble();
    }
}
