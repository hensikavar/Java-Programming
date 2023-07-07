import java.util.Scanner;

public class LargestOfThree
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the first number : ");
		int a=sc.nextInt();

		System.out.print("Enter the second number : ");
		int b=sc.nextInt();

		System.out.print("Enter the third number : ");
		int c=sc.nextInt();

		if(a>b&&a>c)
		{
			System.out.print(a+" is the largest number.");
		}
		if(b>a&&b>c)
		{
			System.out.print(b+" is the largest number.");
		}
		else
		{
			System.out.print(c+" is the largest number.");
		}
	}
}