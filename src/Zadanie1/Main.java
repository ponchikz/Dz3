package Zadanie1;

import java.util.Arrays;

public class Main {

    static String[] arrayString = new String[]{"5", "6", "7", "9"};

    public Main() {
    }
        public static void main(String[] args) {
            SwapMain<Object> swapMain = new SwapMain<>();

            try {
                System.out.println(Arrays.toString(swapMain.swapElements(arrayString, 0, 3)));
            } catch (ArrayIndexOutOfBoundsException var) {
                var.printStackTrace();
            }
    }
}

