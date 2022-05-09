package com.gfg.mathematics;

import java.util.Arrays;

public class Exactly3Divisors {
	
	private static int exactly3Divisors(int N)
	{
		if(N==1) {return 0;}
	    boolean isPrime[]=new boolean[(N+1)];
	    Arrays.fill(isPrime, true);
	    for(int i=2;i*i<=N;i++)
	    {
	    	if(isPrime[i])
	    	{
	    		for(int j=i*i;j<=N;j=j+i)
	    		{
	    			isPrime[j]=false;
	    		}
	    	}
	    }
	    int count=0;
	    for(int k=2;k*k<=N;k++)
	    {
	    	
	    	if(isPrime[k])
	    	{
	    		//System.out.print(k*k+" ");
	    		count++;
	    	}
	    }
	    
	    
	    return count;
	    
	}

	public static void main(String[] args) {
		System.out.println(exactly3Divisors(999999));

	}

}
