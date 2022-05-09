package com.gfg.recursion;

public class LuckyNumber {
	
    static int counter = 2;
    
    // Return True if the given number is a lucky number else return False
    public static boolean isLucky(int n)
    {
    	int next_position=n;
        if(counter>next_position) {return true;}//if counter itself is greater than the position of the given number in that iteration
                                                //the number is definitely lucky 
        if(next_position%counter==0) {return false;}
        
        next_position=next_position-(next_position/counter);//calculating the next position after every iteration
        counter++;
        return isLucky(next_position);
    
        
    }

	public static void main(String[] args) {
		System.out.println(isLucky(2));
	}

}
