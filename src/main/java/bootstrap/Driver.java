package bootstrap;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Driver {
    public static final String SEPARATOR =
            "==============================================================";

    public static void main(String[] args) {
        System.out.println(SEPARATOR);
        System.out.println("Hello and welcome to git training");
        processSquareArea();
        System.out.println(SEPARATOR);
    }

    static void processSquareArea() {
        System.out.println("This utility helps you calculate the area of a square.");
        System.out.println("Please enter length of side::");
        int     side    = 0;
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        side = scanner.nextInt();
        long area = side * side;
        System.out.println("The area of the square for side = " + side + " is " + area);
    }
}
