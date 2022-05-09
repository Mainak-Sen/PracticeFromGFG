package com.gfg.recursion;

public class PowerOfNumbers {
	
	static long  power(int N,int R)
	{
	   if(R==0) {return 1;}
	   long temp=power(N,R/2);
	   
	   if(R%2==0)
	   {
		   return ((temp%1000000007)*(temp%1000000007))%1000000007;
	   }
	   else
	   {
		   return ((N%1000000007)*((power(N,R-1))%1000000007))%1000000007;
	   }
	   
	    
	}

	public static void main(String[] args) {
		System.out.println(power(12,21));
		

	}

}
