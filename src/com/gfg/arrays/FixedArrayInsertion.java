package com.gfg.arrays;

public class FixedArrayInsertion {
	
	//we are going to write a function which is going to insert an element 
	//at a given position in the array and return the currentsize of it .
	
	private  static int insert(int[] a,int current_size,int x,int position,int capacity) {
		
		if(current_size==capacity) {
			System.out.println("Sorry!! Array is already full.cannot insert");
			return current_size;}
		else {
		int insertindex=position-1;
		for(int i=current_size-1;i>=insertindex;i--)
		{
			a[i+1]=a[i];
		}
		a[insertindex]=x;
		return current_size+1;
		}
	}

	public static void main(String[] args) {
		int a[]=new int[8];
		a[0]=3;
		a[1]=8;
		a[2]=78;
		a[3]=44;
		a[4]=39;
		a[5]=81;
		a[6]=782;
		a[7]=4;
		int capacity=a.length;
		
		
		System.out.println("Array before insertion");
		System.out.println("**********************************************");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("The current size of the array after insertion is:"+insert(a,8,32,3,capacity));
		
		System.out.println("Array after insertion");
		System.out.println("**********************************************");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		
		

	}

}
