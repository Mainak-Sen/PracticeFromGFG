package com.gfg.mathematics;

public class NthtermGP {
	
	static double termOfGP(int A,int B,int N)
	{
		double cr=(double)B/A;
		System.out.println(cr);
		return A*(Math.pow(cr,(N-1)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(termOfGP(73,37,2));

	}

}
