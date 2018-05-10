import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import jcurses.system.CharColor;
import jcurses.system.Toolkit;
import jcurses.widgets.BorderLayoutManager;
import jcurses.widgets.List;
import jcurses.widgets.Panel;
import jcurses.widgets.TextField;
import jcurses.widgets.WidgetsConstants;
import jcurses.widgets.Window;

public class sort {
    static int[] arr = new int[1000];

    public static void main(String[] args) {
        //Console console = new Console(0, 0, 30, 20, "hey");
        Window window = new Window(Toolkit.getScreenWidth(), Toolkit.getScreenHeight(), true, "Array sorter");
        window.setBorderColors(new CharColor(CharColor.BLACK, CharColor.WHITE));

        Panel panel = new Panel();
        BorderLayoutManager layoutManager = new BorderLayoutManager();
        List sortingAlgorithmList = new List();
        sortingAlgorithmList.add(0, "Item #1");
        sortingAlgorithmList.add(1, "Item #2");
        layoutManager.bindToContainer(panel);
        layoutManager.addWidget(sortingAlgorithmList, BorderLayoutManager.WEST, WidgetsConstants.ALIGNMENT_TOP, WidgetsConstants.ALIGNMENT_LEFT);
        window.setRootPanel(panel);
        window.setVisible(true);

        // Fill the array with random integers from 0 to 500
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 501);
        }
    }

    /**
     * Prints the contents of arrays.
     * @param array The array to br printed.
     */
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    /**
     * Clears the console.
     */
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
