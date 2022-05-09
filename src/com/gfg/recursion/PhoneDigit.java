package com.gfg.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneDigit {
	
	private static List <String> possibleWords(int a[], int N)
    {
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(1,"1");
        hm.put(2,"ABC");
        hm.put(3,"DEF");
        hm.put(4,"GHI");
        hm.put(5,"JKL");
        hm.put(6,"MNO");
        hm.put(7,"PQRS");
        hm.put(8,"TUV");
        hm.put(9,"WXYZ");
        hm.put(0,"0");
        
        StringBuilder str=new StringBuilder();
        List<String> output=new ArrayList<String>();
        return getStringArray(a,N,0,hm,str,output);
        
        
    }
	
	private static List <String> getStringArray(int a[],int length,int i,HashMap<Integer,String> hm,StringBuilder str,List<String> output)
    {
        
        if(str.length()==length)
        {
        	output.add(str.toString());
        }
        else
        {
        String s=hm.get(a[i]);
        for(int j=0;j<s.length();j++)
        {
        	str.append(s.charAt(j));
        	getStringArray(a,length,i+1,hm,str,output);
        	str.deleteCharAt(str.length()-1);
        }
        }
        
        return output;
    }

	public static void main(String[] args) {
		int a[]= {};
		System.out.println(possibleWords(a,a.length));

	}

}
