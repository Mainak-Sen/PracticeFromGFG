package com.gfg.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Getcommonelements {
	//write a program to return common elements between two arrays.
	private static List<Integer> getCommonElements(int[] array1,int[] array2) {
		
		List<Integer> list1 =Arrays.stream(array1).boxed().collect(Collectors.toList());
		List<Integer> list2 =Arrays.stream(array2).boxed().collect(Collectors.toList());
		List<Integer> list3=new ArrayList<Integer>();
		for(int i=0;i<list1.size();i++)
		{
			if(list2.contains(list1.get(i)))
			{
				if(!list3.contains(list1.get(i)))
				{
					list3.add(list1.get(i));
				}
			}
		}
		
		return list3;
	}
	public static void main(String[] args) {
		int[] array1= {1,2,0,98,23,2,7};
		int[] array2= {1,7,0,98,45,2,23,78,7};
		System.out.println(getCommonElements(array1,array2) );

	}

}
