import java.util.*;

public class PerfectNo
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the number :  ");

		int n=sc.nextInt(),i,nn=0;

		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				nn=nn+i;
			}
		}

		if(nn==n)
		{
			System.out.print("Perfect Number");
		}
		else
		{
			System.out.print("Not Perfect Number");
		}
	}
}