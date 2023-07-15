import java.util.Scanner;

public class Fibnacci
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		The_Series no=new The_Series();

		System.out.print("Enter the number : ");
		no.n=sc.nextInt();

		no.Print_Series();
	}
}

class The_Series
{
	int a=0,b=1,c,n;

	public void Print_Series()
	{
		int i;

		System.out.print(a+" ");
		System.out.print(b+" ");
		for(i=0;i<n-2;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
	}
}