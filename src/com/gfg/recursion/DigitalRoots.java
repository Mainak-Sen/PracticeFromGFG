package com.gfg.recursion;

public class DigitalRoots {
	
	public static int digitalRoot(int n)
    {
        int sum=0;
        if(n<10) {return n;}
        else
        {sum+=digitalRoot(n/10)+n%10;
        if(sum<10) {return sum;}
        else
        {
        	return digitalRoot(sum);
        }
    
        }
        
    }

	public static void main(String[] args) {
		System.out.println(digitalRoot(78643));

	}

}
