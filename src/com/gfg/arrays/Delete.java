package com.gfg.arrays;

public class Delete {
	//Deleting an element and reducing the size of the array
private  static int deleteElement(int[] a,int current_size,int x) {
		int i;
		for(i=0;i<current_size;i++)
		{
			if(a[i]==x)
			{
				break;
			}
		}
		
		if(i<current_size) {
			current_size=current_size-1;
		for(int j=i;j<current_size;j++)
		{
			a[j]=a[j+1];
		}
		}
		return current_size;
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
		int current_size=a.length;
		
		
		System.out.println("Array before deletion");
		System.out.println("**********************************************");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		current_size=deleteElement(a,current_size,39);
		System.out.println("The current size of the array after deletion is:"+current_size);
		
		System.out.println("Array after deletion");
		System.out.println("**********************************************");
		for(int i=0;i<current_size;i++)
		{
			System.out.print(a[i]+" ");
		}

		

	}

}
