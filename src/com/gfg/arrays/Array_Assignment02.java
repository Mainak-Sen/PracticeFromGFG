package com.gfg.arrays;

public class Array_Assignment02 {
	
	// You need to insert the given element at the given index. 
    // After inserting the elements at index, elements
    // from index onward should be shifted one position ahead
    // You may assume that the array already has sizeOfArray - 1
    // elements.
    public static void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
    {
       if(index == sizeOfArray-1)
       {
    	   arr[index]=element;
       }
       else
       {
       for(int j=sizeOfArray-2;j>=index;j--)
       {
           arr[j+1]=arr[j];
       }
       arr[index]=element;
       }
       
       for(int ele: arr)
       {
           System.out.print(ele+" ");
       }
           
    }

	public static void main(String[] args) {
	
		int[] result = new int[6];
		result[0]=4;
		result[1]=6;
		result[2]=8;
		result[3]=10;
		result[4]=12;
		
		insertAtIndex(result,result.length,0,14);

	}

}
