package com.gfg.arrays;

public class Array_Assignment04 {
	
//	Given an array arr[] of size N and two elements x and y, 
//	use counter variables to find which element appears most in the array,
//	x or y. If both elements have the same frequency, then return the smaller element.
//	Note:  We need to return the element, not its count.
	
	public static int majorityWins(int arr[],int n,int x,int y)
    {
       int count_x=0;
       int count_y=0;
       
       for(int no: arr)
       {
    	   if(no==x) {count_x++;}
    	   else if(no==y) {count_y++;}
       }
       
       if(count_x==count_y) {return x<y?x:y;}
       else {
    	   return count_x>count_y?x:y;
       }
    }

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8};
		int n= a.length;
		System.out.println(majorityWins(a,n,1,7));

	}

}
