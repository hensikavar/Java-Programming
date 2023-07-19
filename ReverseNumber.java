import java.util.Scanner;

public class ReverseNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the number : ");
		int n=sc.nextInt();

		int r;
		do
		{
			r=n%10;
			System.out.print(r);
			n=n/10;
		}
		while(n!=0);
	}
}