public class Console {
    int width  = 0;
    int height = 0;
    int charsPrinted = 0;

    public Console(int width, int height) {
        this.width  = width;
        this.height = height;
    }

    public void print(String str) {
        System.out.print(str);
        charsPrinted += str.length();
    }

    public void println(String str) {
        print(str + "\n");
    }

    public void clear() {
        String erase = "";
        for (int i = 0; i < charsPrinted; i++) {
            erase += "\b";
        }
        System.out.print(erase);
        System.out.println(charsPrinted);
        charsPrinted = 0;
    }
}
