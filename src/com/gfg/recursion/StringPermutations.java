package com.gfg.recursion;

public class StringPermutations {
	
	private static String swap(String a,int i,int j) {
		
		char[] aChar=a.toCharArray();
		char temp=aChar[i];
		aChar[i]=aChar[j];
		aChar[j]=temp;
		
		return String.valueOf(aChar);
		
	}
	
	private static void permute(String input,int start,int end) {
		
		if(start==end) {System.out.print(input+" ");}
		for(int i=start;i<=end;i++)
		{
			input=swap(input,start,i);
			permute(input,start+1,end);
			input=swap(input,start,i);
		}
	}

	
	public static void main(String[] args) {
		String input="AAC";
		permute(input,0,input.length()-1);

	}

}
