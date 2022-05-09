package com.gfg.arrays;

public class StockBuyandSellEffSol {
	
	private static int max_profit(int[] price) {
		
		int profit=0;
		for(int i=1;i<price.length;i++)
		{
			if(price[i]>price[i-1])
			{
				profit+=(price[i]-price[i-1]);
			}
		}
		return profit;
	}

	public static void main(String[] args) {
		int[] price= {1, 7, 2, 3, 6, 7, 6, 7};
		System.out.println("The maximum possible profit is : "+max_profit(price));
	}

}
