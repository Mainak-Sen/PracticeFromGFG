package com.gfg.recursion;

import java.util.ArrayList;

public class PowerSet {
	
	static ArrayList<String> powerSet(String s)
    {
        
         return  get_powerset(s,"",0);
    }
	
private static ArrayList<String> get_powerset(String input, String current,int index) {
		
	    ArrayList<String> al=new ArrayList<String>();
		if(index==input.length()) {
			al.add(current);
			return al;
		}
		
		al.addAll(get_powerset(input,current,index+1));
		al.addAll(get_powerset(input,current+input.charAt(index),index+1));
		
		return al;
		
	}
	
	

	public static void main(String[] args) {
		System.out.println(powerSet("123"));

	}

}
