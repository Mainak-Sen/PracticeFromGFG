package com.gfg.mathematics;

public class HCF {
	
	private static int find_HCF(int a,int b) {
		if(b==0) {return a;}
		else
		{
			return find_HCF(b,a%b);
		}	
	}
	public static void main(String[] args) {
		System.out.println(find_HCF(40,25));

	}

}
