import java.util.Scanner;

public class XPowerY
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Power n=new Power();

		System.out.print("Enter the base value : ");
		n.x=sc.nextInt();

		System.out.print("Enter the power value : ");
		n.y=sc.nextInt();

		n.Calc_Power(n.x,n.y);
	}
}

class Power
{
	int x,y;

	public void Calc_Power(int x,int y)
	{
		int ans=1;

		for(int i=1;i<=y;i++)
		{
			ans=ans*x;
		}

		System.out.print("The answer is "+ans);
	}
}