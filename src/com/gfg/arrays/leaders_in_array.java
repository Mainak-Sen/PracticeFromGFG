package com.gfg.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class leaders_in_array {
	
	//an element is a leader in an array if it has no elements equal or greater to the right side of it 
	private static ArrayList<Integer> print_leaders_in_array(int[] arr) {
		
		int curr_leader=arr[arr.length-1];
		ArrayList<Integer> leader_array=new ArrayList<Integer>();
		leader_array.add(curr_leader);
		for(int i=arr.length-2;i>=0;i--)
		{
			if(arr[i]>=curr_leader)
			{
				curr_leader=arr[i];
				leader_array.add(curr_leader);
			}
			
		}
		
		Collections.reverse(leader_array);
		return leader_array;
	}

	public static void main(String[] args) {
		int[] input_array= {7,10,4,10,6,5,2};
		System.out.println(print_leaders_in_array(input_array));

	}

}
