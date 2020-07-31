package bootstrap;

public class Driver {
    public static final String SEPARATOR =
            "==============================================================";

    public static void main(String[] args) {
        System.out.println(SEPARATOR);
        System.out.println("Hello and welcome to git training");
        int side = 2;
        System.out.println(" Area of square with side = " + side + " = " + getArea(side));
        System.out.println(SEPARATOR);
    }

    public static double getAreaSquare(int side){
        // Sanket is calculating area of rectangle
        return 3.14d * side * side;
    }
}
