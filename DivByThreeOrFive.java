import java.util.Scanner;

public class DivByThreeOrFive
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the number of elements in an array : ");
		int n=sc.nextInt();

		int arr[]=new int[n];
		int sum=0,i=0;

		do
		{
			System.out.print("Enter the "+(i+1)+" element of the array : ");
			arr[i]=sc.nextInt();

			if(arr[i]%3==0 || arr[i]%5==0)
			{
				sum+=arr[i];
			}
			i+=1;
		}
		while(i!=n);

		System.out.print("Sum will be "+sum+".");
	}
}