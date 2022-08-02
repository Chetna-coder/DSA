package week_4;

import java.util.Scanner;

class UnboundedKnapsack {

	
	static int max(int a, int b) { return (a > b) ? a : b; }

	static int unboundedKnapsack(int W, int wt[], int val[],
								int idx)
	{
		
		if (idx == 0) {
			return (W / wt[0]) * val[0];
		}
		
		int notTake= 0 + unboundedKnapsack(W, wt, val, idx - 1);
		
		int take = Integer.MIN_VALUE;
		if (wt[idx] <= W) {
			take = val[idx] + unboundedKnapsack(W - wt[idx], wt, val,
									idx);
		}
		return max(take, notTake);
	}


	public static void main(String args[])
	{

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no. of elements");
		int n= sc.nextInt();
		System.out.println("Enter Values");
		int val[]= new int[n];
		for(int i=0;i<n;i++)
		{
			val[i]=sc.nextInt();
		}
		int wt[]=new int[n];
		System.out.println("Enter Weights");
		for(int i=0;i<n;i++)
		{
			wt[i]=sc.nextInt();
		}
		System.out.println("Enter Weight limit");
		int W = sc.nextInt();
		System.out.println(unboundedKnapsack(W, wt, val, n - 1));
	}
}

