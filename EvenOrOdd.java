import java.util.*;

public class EvenOrOdd
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the number :  ");

		int n=sc.nextInt();

		if(n%2==0)
		{
			System.out.print("Number is even.");
		}

		else
		{
			System.out.print("Number is odd.");
		}
	}
}