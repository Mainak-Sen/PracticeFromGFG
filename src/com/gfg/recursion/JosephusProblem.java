package com.gfg.recursion;

public class JosephusProblem {
	
	//problem where n members are standing in a circle and every 3rd member is going to be killed 
	//after each member getting killed,the pistol goes to the next member standing the circle 
	//in this way we should return who will survive the battle 
	
	private static int Josephus(int numberOfMembers,int killEvery) {
		
		if(numberOfMembers==1) {return 1;}
		else
		{
		return (Josephus(numberOfMembers-1,killEvery)+(killEvery-1))%numberOfMembers+1;
		}
	}

	public static void main(String[] args) {
		System.out.println(Josephus(8,3));

	}

}
