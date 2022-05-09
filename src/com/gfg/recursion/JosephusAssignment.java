package com.gfg.recursion;

public class JosephusAssignment {
	public static int josephus(int n, int k)
    {
        if(n==1) {return 1;}
        else return (josephus(n-1,k)+(k-1))%n+1;
    }

	public static void main(String[] args) {
		
		System.out.println(josephus(3,2));
	}

}
