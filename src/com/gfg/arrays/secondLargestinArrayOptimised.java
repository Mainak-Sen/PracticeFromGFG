package com.gfg.arrays;

public class secondLargestinArrayOptimised {
	
	
	private static int get_secondLargest_element_idx(int[] array) {
		
		int largest=0;
		int sec_largest=-1;
		if(array.length==0 || array.length==1)
		{
			System.out.println("Sorry!!! No second largest element found");
		}
		else
		{
			for(int i=1;i<array.length;i++)
			{
				if(array[i]>array[largest])
				{
					sec_largest=largest;
					largest=i;	
				}
				else if(array[i]<array[largest])
				{
					if(sec_largest==-1 || array[i]>array[sec_largest])
					{
						sec_largest=i;
					}
				}
			}
		}
		if(sec_largest==-1)
		{
			System.out.println("Sorry!! No second largest element found");
		}
		
		return sec_largest;
	}
	

	public static void main(String[] args) {
		int[] array= {5,20,12,20,8};
		System.out.println(get_secondLargest_element_idx(array));

	}

}
