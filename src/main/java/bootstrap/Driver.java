package bootstrap;

public class Driver {
    public static final String SEPARATOR =
            "==============================================================";

    public static void main(String[] args) 
    {
    	int r;
    	double area;
        System.out.println(SEPARATOR);
        System.out.println("Hello and welcome to git training");
        System.out.println(SEPARATOR);
        Scanner s=new Scanner(System.in);
        System.out.println("Enter radius");
    }
}


public static double getAreaCircle(int r)
{
	r=s.nextInt();
	area=3.14d*r*r;
	System.out.println("Area is:" + area);
}