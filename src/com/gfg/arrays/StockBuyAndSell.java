package com.gfg.arrays;

public class StockBuyAndSell {
	
	private static int max_profit(int[] price,int startIndex,int endIndex) {
		
		if(startIndex>=endIndex) {
			return 0;
		}
		int profit=0;
		for(int i=startIndex;i<endIndex;i++)
		{
			for(int j=i+1;j<=endIndex;j++)
			{
				if(price[j]>price[i])
				{
					int current_profit=(price[j]-price[i])+max_profit(price,startIndex,i-1)+max_profit(price,j+1,endIndex);
					profit=Math.max(profit, current_profit);
					
				}
			}
		}
		
		return profit;
	}

	public static void main(String[] args) {
		int[] price= {1,5,3,8,12};
		int startIndex=0;
		int endIndex=price.length-1;
		System.out.println("The max profit which one can get is: "+max_profit(price,startIndex,endIndex));

	}

}
