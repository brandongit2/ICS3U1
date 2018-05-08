import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class sort {
    static int[] arr = new int[1000];

    public static void main(String[] args) {
        // Get the console dimensions
        System.out.print("\u2588");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 501);
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (IOException | InterruptedException ex) {
        }
    }
}
