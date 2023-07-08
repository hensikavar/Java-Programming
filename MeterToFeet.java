import java.util.Scanner;

public class MeterToFeet
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length in metres : ");
		float m=sc.nextFloat();

		float f=m*3.33f;
		System.out.print("Length in feet will be "+f+"ft.");
	}
}