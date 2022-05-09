package com.gfg.recursion;

public class One2NWithoutLoop {
	
	private static void  print1toN(int N) {
		
		if(N>0) {print1toN(N-1);
		System.out.print(N+" ");
		}return;
	}

	public static void main(String[] args) {
		print1toN(10);
		

	}

}
