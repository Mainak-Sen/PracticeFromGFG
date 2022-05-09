package com.gfg.arrays;

import java.util.ArrayList;

public class removeDuplicates {

	private static ArrayList<Integer> removeDuplicates(int[] array){
		ArrayList<Integer> al=new ArrayList<Integer>();
		//O(N) time complexity 
		//O(N) auxiliary space 
		for(int i: array)
		{
			if(!al.contains(i))
			{
				al.add(i);
			}
		}
		return al;
	}
	public static void main(String[] args) {
		int[] array= {4,0,3,3,56,9,3,4};
		System.out.println(removeDuplicates(array));
	}

}
