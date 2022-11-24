/*
 * Assignment 1: Fermat's Last Theorem - Near Miss
 * File Holding the Program: NearMiss
 * 
 * Programmers Names: 
 * 1. Vimochana Veronica Ruth Dubba(VimochanaVeronicaR@lewisu.edu)
 * 2. Sandeep Reddy Sadhu (sandeepreddysadhu@lewisu.edu)
 * 
 * Course: FA22-CPSC-60500-005
 * 
 * November 23, 2022
 * 
 * Explanation: The values for x and y are derived from the value of k in accordance with the limit range that was established in the beginning of the process. A number chosen at random from the range of 2 to n times 12 will be selected. After that, we carried out the steps required by the method for locating the nearest miss, which included solving the equation, establishing the value of the near miss, and finally obtaining the value of the nearest miss.
 */
import java.util.Scanner;
import java.lang.Math;

public class NearMiss {
	
	public int getLowerLimit(int lowerlimit) {
		Scanner input = new Scanner(System.in);
		int lowlimit;
		System.out.print("Please Enter the Lower Limit = ");
		lowlimit = input.nextInt();
	    while(lowlimit < 10)
	    {
	    	System.out.print("Lower limit for K; must be greater than 10 = ");
		    lowlimit = input.nextInt();
	    }
		return lowlimit;
		
	}
	public int getUpperLimit(int upperlimit) {
		int lowerlimit = 0;
		Scanner input = new Scanner(System.in);
		
		return upperlimit;
		
	}
	public static void main(String[] args) 
	{ 
		int x = 0;
	    int y = 0;
	    int z = 0;
	    int lowerlimit = 0;
	    int upperlimit = 0;
	    int n;
	    System.out.print("***************************************\n");
	    Scanner input = new Scanner(System.in);
	    NearMiss nm = new NearMiss();
	    lowerlimit = nm.getLowerLimit(lowerlimit);
	    
	    System.out.print("Upper limit for K = ");
	    upperlimit = input.nextInt();
	    while(upperlimit <= lowerlimit)
	    {
	    	System.out.print("Upper limit must be greater than Lower limit: Enter Upper Limit again = ");
		    upperlimit = input.nextInt();
	    }
	    
	    System.out.print("Value for n; must be greater than 2 = ");
	    n = input.nextInt();
	    while(n < 2)
	    {
	    	System.out.print("Enter value for n; must be greater than 2 = ");
	    	n = input.nextInt();
	    }
	    System.out.print("\nEnter the value of num for num times iteration = ");
	    int itr = input.nextInt();
	    double smallestmiss = 99999999.99; 
	    System.out.print("\n***************************************");
	    
	    for (int i =0; i<itr; i++) 
	    {
	        	
	        	x =  (int) ((Math.random() * (upperlimit - lowerlimit)) + lowerlimit);
	        	y =  (int) ((Math.random() * (upperlimit - lowerlimit)) + lowerlimit);
	        	n =  (int) ((Math.random() * (11 - 3)) + 3);
	        	
	        	System.out.print("\n***************************************");
	        	System.out.print("\nx's value = " + x);
	        	System.out.print("\ny's value = " + y);
	        	System.out.print("\nn's value = " + n + "\n");
	        	System.out.print("\n***************************************");
	     	        	
	       
	        int x_power_n = (int)(Math.pow (x, n));
	        int y_power_n = (int)(Math.pow (y, n));
	        int xn_sum_yn = (int)(x_power_n + y_power_n);
	        
	        
	        z = (int) Math.pow (xn_sum_yn, 1.0/n);
	        
	        
	        int nearmiss = (int)(xn_sum_yn - Math.pow (z, n));
	        
	        
	        
	        double relativemiss = 100. * nearmiss / xn_sum_yn;
	        System.out.println("\n\nVAlue of Near Miss =  "+nearmiss+" \nValue of Relative Miss = "+relativemiss);
	        
	        
	        
	        if(relativemiss<smallestmiss)
	        {
	        	smallestmiss=relativemiss;
	        }
	        System.out.println("Value of Smallest Possible Miss = "+smallestmiss);
	           
	    }
	}
}



