package com.gfg.arrays;

public class SlidingWindowTechnique4 {
	//print the first m n-bonacci numbers 
	
	private static void print_first_m_Nbonaccinumbers(int n,int m) {
		//assuming n<m
		int[] a=new int[m];
		for(int i=0;i<n-1;i++)
		{
			a[i]=0;
		}
		a[n-1]=1;
		a[n]=1;
		for(int j=n+1;j<m;j++)
		{
			a[j]=a[j-1]+(a[j-1]-a[j-n-1]);
		}
		
		//printing the array
		for(int i=0;i<m;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		print_first_m_Nbonaccinumbers(3,10);
	}

}
