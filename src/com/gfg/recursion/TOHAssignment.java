package com.gfg.recursion;

public class TOHAssignment {
	
	public static long toh(int N, int from, int to, int aux) {
	long moves=0;
        if(N==1)
        {
        	System.out.println("move disc "+1+" from rod "+from+" to rod "+to);
        	moves++;
        	return moves;
        }
		moves=toh(N-1,from,aux,to);
		System.out.println("move disc "+N+" from rod "+from+" to rod "+to);
		moves++;
		moves+=toh(N-1,aux,to,from);
		return moves;
       
    }

	public static void main(String[] args) {
		System.out.println(toh(1,1,3,2));

	}

}
