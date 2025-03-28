package number_patterns;

import java.util.Scanner;

/*
	1
   1 1
  1   1
 1     1
1       1
 1     1
  1   1
   1 1
	1
*/
public class Number_Hallow_Diamond 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		for(int i=0;i<=n;i++)
		{
			int num = 1;
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<i;j++)
			{
				if(j==1)
					System.out.print(num);
				else
					System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==i)
					System.out.print(num);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=0;i<=n;i++)
		{
			int num = 1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<n;j++)
			{
				if(j==i)
					System.out.print(num);
				else
					System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				if(j==n)
					System.out.print(num);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
