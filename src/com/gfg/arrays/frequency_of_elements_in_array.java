package com.gfg.arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class frequency_of_elements_in_array {

	private static void print_frequency(int[] input) {
		
		HashMap<Integer,Integer> hm=new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<input.length;i++)
		{
			hm.put(input[i],hm.getOrDefault(input[i],0)+1);
		}
		for(Map.Entry<Integer,Integer> entry:hm.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
	public static void main(String[] args) {
		int[] input= {19,23,6,5,4,5,19,21};
		print_frequency(input);

	}

}
