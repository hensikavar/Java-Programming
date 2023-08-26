import java.util.Scanner;

public class SumOfSeries
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the value of n : ");
		int n=sc.nextInt();

		Sum_Of_Series ans=new Sum_Of_Series();
		int a,total=0;

		for(int i=1;i<=n;i++)
		{
			a=ans.sum(i);
			total+=a;
		}

		System.out.print("The answer will be "+total);
	}
}

class Sum_Of_Series
{
	int num;

	public int sum(int no)
	{
		int s=0;

		for(int i=1;i<=no;i++)
		{
			s+=i;
		}

		return s;
	}
}