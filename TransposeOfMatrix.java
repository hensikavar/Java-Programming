import java.util.Scanner;

public class TransposeOfMatrix
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the size of row of matrix : ");
		int r=sc.nextInt();
		System.out.print("Enter the size of column of matrix : ");
		int c=sc.nextInt();

		int mat[][]= new int[r][c];
		int tmat[][]=new int[c][r];

		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat[i][j]=sc.nextInt();
				tmat[j][i]=mat[i][j];
			}
		}

		System.out.println("Entered Matrix - ");

		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println("");
		}

		System.out.println("\n\nTransposed Matrix - ");

		for(int i=0;i<c;i++)
		{
			for(int j=0;j<r;j++)
			{
				System.out.print(tmat[i][j]+" ");
			}
			System.out.println("");
		}
	}
}