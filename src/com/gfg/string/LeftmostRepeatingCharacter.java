package com.gfg.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class LeftmostRepeatingCharacter {

	private static int get_leftmost_IndexOf_repeatingCharacter(String str) {
		
		LinkedHashMap<Character,Integer> hm=new LinkedHashMap<Character,Integer>();
		char req = 0;
		int  reqIndex = 0;
		//storing frequency of each character of the string into a hashMap
		for(int i=0;i<str.length();i++)
		{
				hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i),0)+1);
		}
		//retrieving the first occuring repeated character in hashmap
		for(Map.Entry<Character,Integer> each: hm.entrySet())
		{
			if(each.getValue()>1)
			{
				req=each.getKey();
				break;
			}
		}
		//retrieving the index of leftmost repeating character
		for(char c: str.toCharArray())
		{
			if(c==req)
			{
				reqIndex=str.indexOf(c);
				break;
			}
		}
		
		return reqIndex;
		
	}
	public static void main(String[] args) {
		
		System.out.println(get_leftmost_IndexOf_repeatingCharacter("xieksforgeeks"));
	}

}
