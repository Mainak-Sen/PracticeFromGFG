package com.gfg.mathematics;

public class ModularmultiplicativeInverse {
	
	private static int modInverse(int a,int m) {
		
		for(int x=1;x<m;x++)
		{
			if((a*x)%m==1)
			{
				return x;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(modInverse(3,11));

	}

}
