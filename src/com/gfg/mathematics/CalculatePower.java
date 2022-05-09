package com.gfg.mathematics;

public class CalculatePower {
	
	private static int calculate_power(int x,int n) {
		if(n==0) {return 1;}
		int temp=calculate_power(x,n/2);
		temp=temp*temp;
		
		if(n%2==0) {return temp;}
		else {return (temp*x);}
	}
	
	private static int calculate_power_iterative(int x,int n) {

		if(n==0) {return 1;}
		if(n==1) {return x;}
		int temp=x;
		for(int i=2;i<=n/2;i++)
		{
			temp=temp*x;
		}
		temp=temp*temp;
		
		if(n%2==0) {return temp;}
		else {return (temp*x);}
	}
	public static void main(String[] args) {
		System.out.println(calculate_power_iterative(5,1));

	}

}
