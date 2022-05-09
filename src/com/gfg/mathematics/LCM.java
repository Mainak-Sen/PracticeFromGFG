package com.gfg.mathematics;

//HCF*LCM=Product of two numbers 
//we are using the above formula and the previous Euclidian procedure to find the HCG of two numbers to compute the LCM 
public class LCM {
	
	private static int findHCF(int a,int b) {
		
		if(b==0)
		{
			return a;
		}
		else
		{
			return findHCF(b,a%b);
		}
	}
	
	private static int findLCM(int a,int b) {
		
		return (a*b)/(findHCF(a,b));
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findLCM(12,14));

	}

}
