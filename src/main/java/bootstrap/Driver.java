package bootstrap;

public class Driver {
    public static final String SEPARATOR =
            "==============================================================";

    public static void main(String[] args) {
        System.out.println(SEPARATOR);
        System.out.println("Hello and welcome to git training");
        int base = 2;
        int height = 4;
        System.out.println("Area of triangle with base and height = " + base + " " + height + " = " + getArea(base,height));
        System.out.println(SEPARATOR);
    }

    public static double getAreaTriangle(int base, int height){
    	return 0.5d * base * height;
    }
}
