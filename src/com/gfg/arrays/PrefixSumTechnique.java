package com.gfg.arrays;

public class PrefixSumTechnique {
	
	//write a program to return the sum of array elements given the beginning and endindex
	//the returned sum should include both begin and end indexes .
	
	private static int printSum(int[] array,int start,int end) throws Exception 
	{
		if((start>array.length-1) || (end>array.length-1)||(start>end))
		{
			throw new Exception("Sorry!! input is not valid");
		}
		int[] sumArray=new int[array.length];
		int sum=0;
		//creating an array which will have the sum of all the elements until that point
		for(int i=0;i<array.length;i++)
		{
			sum+=array[i];
			sumArray[i]=sum;
		}
		if(start==0) {return sumArray[end];}
		else {
		return sumArray[end]-sumArray[start-1];
		}
		
	}

	public static void main(String[] args){
		int[] array= {2,5,6,7,4,3,2};
		try {
			System.out.println(printSum(array,4,6));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
