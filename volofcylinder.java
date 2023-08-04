import java.util.*;
import java.lang.Math;

public class volofcylinder
{
	public static void main(String[] args)
	{
		double r,h;
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the radius of the cylinder : ");
		r=sc.nextDouble();
		System.out.print("Enter the height of the cylinder : ");
		h=sc.nextDouble();

		System.out.print("Volume will be : "+(Math.PI*r*r*h));
	}
}