package com.gfg.mathematics;

public class QuadraticRoots {
	
	public static void findRoots(int a, int b, int c) 
    { 
     // If a is 0, then equation is not      
     //quadratic, but linear 
     
     if (a == 0) 
     { 
        System.out.println("Invalid"); 
        return; 
     } 
   
     int d  = b*b - 4*a*c; 
     double sqrt_val = Math.sqrt((Math.abs(d))); 
   
     if (d >= 0) 
     { 
        System.out.println("Roots are real and different \n"); 
  
        System.out.println(Math.floor((double)(-b + sqrt_val) / (2 * a)) + "\n" 
                            + Math.floor((double)(-b - sqrt_val) / (2 * a))); 
     } 
     else // d < 0 
     { 
        System.out.println("Roots are complex \n"); 
  
        System.out.println( Math.floor(-(double)b / ( 2 * a )) + " + i" 
                          + Math.floor(sqrt_val) + "\n"  + Math.floor(-(double)b / ( 2 * a )) 
                          + " - i" + Math.floor(sqrt_val)); 
     } 
  
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findRoots(1,-2,1);
	}

}
