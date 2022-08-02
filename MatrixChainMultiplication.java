package week_4;

import java.util.Scanner;

class MatrixChainMultiplication {
	
	static int MatrixChainOrder(int p[], int i, int j)
	{
		if (i == j)
			return 0;

		int min = Integer.MAX_VALUE;

		
		for (int k = i; k < j; k++)
		{
			int count = MatrixChainOrder(p, i, k)
						+ MatrixChainOrder(p, k + 1, j)
						+ p[i - 1] * p[k] * p[j];

			if (count < min)
				min = count;
		}

		
		return min;
	}

	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int n= sc.nextInt();
		System.out.println("Enter elements");
		int ar[]= new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		

		System.out.println(
			"Minimum number of multiplications is "
			+ MatrixChainOrder(ar, 1, n - 1));
	}
}

