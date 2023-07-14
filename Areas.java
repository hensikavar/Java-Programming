import java.util.Scanner;

public class Areas
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Calc_Area x=new Calc_Area();

		System.out.print("Enter the base length of the triangle : ");
		x.b=sc.nextDouble();

	
		System.out.print("Enter the height of the triangle : ");
		x.h=sc.nextDouble();

		System.out.print("Enter the side length of the sqaure : ");
		x.s=sc.nextDouble();

		double AOS=x.Area(x.s);
		double AOT=x.Area(x.b,x.h);

		x.Area();
		System.out.println("Area of the triangle is "+AOT);
		System.out.println("Area of the square is "+AOS);
	}
}

class Calc_Area
{
	double r,b,h,s;

	public void Area()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius of the circle : ");
		r=sc.nextDouble();

		System.out.println("Area of the circle is "+(3.14*r*r));
	}

	public double Area(double s)
	{
		return (s*s);
	}

	public double Area(double b, double h)
	{
		return (0.5*b*h);
	}
}