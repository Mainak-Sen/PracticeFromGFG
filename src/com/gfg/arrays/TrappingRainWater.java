package com.gfg.arrays;

public class TrappingRainWater {
	
	private static int rain_water_trapped_qty(int[] bars) {
		
		int n=bars.length;
		int[] lmax=new int[n];
		int[] rmax=new int[n];
		int qty=0;
		
		//computing the lmax array
		lmax[0]=bars[0];
		for(int i=1;i<n;i++)
		{
			lmax[i]=Math.max(lmax[i-1],bars[i]);
		}
		
		//computing the rmax array
		rmax[n-1]=bars[n-1];
		for(int i=n-2;i>=0;i--)
		{
			rmax[i]=Math.max(rmax[i+1],bars[i]);
		}
		
		//computing the amount of water
		for(int i=1;i<n-1;i++)
		{
			qty+=(Math.min(lmax[i],rmax[i])-bars[i]);
		}
		return qty;
	}

	public static void main(String[] args) {
		int[] bars= {5,0,6,2,3};
		System.out.println(rain_water_trapped_qty(bars));

	}

}
