package com.gfg.arrays;

public class PrefixSumTechnique3 {
	
	//write a program to find the max occuring element in a given set of ranges 
	
	private static int find_max_ocurence(int[] larr,int[] rarr) {
		int numberOfranges=larr.length;
		int[] array=new int[1000];
		for (int i = 0; i <numberOfranges; i++) {
			
			array[larr[i]]++;
			array[rarr[i]+1]--;
		}
		int maxOccuring=array[0];
		int res=0;
		
		//creating the prefix sum array
		for(int i=1;i<1000;i++)
		{
			array[i]+=array[i-1];
			if(maxOccuring<array[i])
			{
				maxOccuring=array[i];
				res=i;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] larr= {1,1,3};
		int[] rarr= {3,2,7};
		System.out.println(find_max_ocurence(larr,rarr));
		

	}

}
