package com.gfg.recursion;

public class digitsSum {
	
	private static int digitsSum(int number) {
		
		if(number<10) {return number;}//base case 
		return digitsSum(number/10)+(number%10);
	}

	public static void main(String[] args) {
		System.out.println(digitsSum(897654));

	}

}
