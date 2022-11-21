//Program Title: Fermat’s Last Near Misses Theorem

//File Name: NearMisses.java

//Developers: Sandeepreddysadhu, vimochanveronicaruthdubba

//Developer's Email address: sandeepreddysadhu = sandeepreddysadhu@lewisu.edu
//                Vimochanveronicaruthdubba = vimochanveronicaruthdubba@lewisu.edu

//Course Number: CPSC 60500

//Section Number: 005

//Date: 14/11/2022

//External files necessary to run this program: None

// Generated External files: None

// Resources: None


/*Explanation: The algorithm of Fermat's Last Near Miss Theorem is implemented to find the "near miss".
The theorem is used to calculate the miss and relative miss values.
and it is used to search for users.
The Java programming language is used to fully implement this program.
The function is defined to execute the formula as needed.           
*/

// import the required files
import java.util.Scanner;
import static java.lang.Math.*;
public class NearMisses {
	// declare variables 
	public static int n = 0, k = 0;
	public static int Miss = Integer.MAX_VALUE;
	public static double RelativeMiss = Integer.MAX_VALUE;
	public static int miss_diff;
	public static double rel_Diff;
	public static long lhours;
	public static int z;

	
	public static void main(String[] args) {
				
		Scanner value = new Scanner (System.in);
		// if check n value between 2 and  12	
		if( n >= 12 || n <= 2 ) {
			// n value get from the user
			System.out.print("Enter your positive interger value for n --> ");
			// received n value stored by n variable
			n = value.nextInt();
		}
		// if check condition for k value <= 10 
		if(k <= 10) {
			// input get from the user
			System.out.print("Enter the upper Limit value for K --> ");
			// received input stored by k variable 
			k = value.nextInt();
			System.out.println();
		}
		int x = 10;
		while( x <= k) {
			int y = 10;
			while( y <= k) {
				lhours = (int)(Math.pow(x, n) + Math.pow(y, n));
				//if check the n value < 0 then print the error message.
				while(lhours < 0) {
					System.out.print("Please enter your lowest value for n and k");
					return;
				}
				 z = (int)Math.pow(lhours, 1.0 / n);
				 miss_diff = (int)(lhours - Math.pow(z, n));
				 while( Math.pow(z + 1, n) - lhours < miss_diff) {
						miss_diff = (int)(Math.pow(z + 1, n) - lhours);
						z += 1;
				 }
				 
				// calculate the relative miss value 
				rel_Diff = (100. * miss_diff / lhours);
				while(rel_Diff < RelativeMiss) { 
					Miss = miss_diff;     
		            RelativeMiss = rel_Diff;
		            // print the x,y,z,miss and relative miss values 
		            System.out.printf("x = %d  " + "  " + "y = %d " + "  " + " z = %d " + " Miss = %d" + "  " + " Relative_Miss = %.6f%%\n", 
		            		x, y, z, miss_diff, rel_Diff); 
		            
				}
				y++;	
			}
			x++;
		}		
		
	}

}
		

		
		



