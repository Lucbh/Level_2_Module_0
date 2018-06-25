package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		
		int[] a = new int[5];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
	
		
	
		
		//2. print the third element in the array
		
		int i = a[2];
		System.out.println(i);
		
		
		//3. set the third element to a different value
		
		 a[2] = 100;
		 
		
		//4. print the third element again
		
		System.out.println(a[2]);
		
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		for(int x = 0; x < a.length; x++) {
			
			System.out.println(a[x]);
			
			
		}
		

		
		//6. make an array of 50 integers
		
		int[] q = new int[50];
		
		
		
		
		//7. use a for loop to make every value of the integer array a random number
		
		
		for (int b = 0; b < 50; b++) {
			
			Random r = new Random();
			int ran = r.nextInt(50);
			
			q[b]  = ran;  
			
			
			
		}
		
		//8. without printing the entire array, print only the smallest number in the array
		int min = q[0];
		
		for (int bob = 0; bob < 50; bob++) {
			
			if (q[bob] < min) {
				
				min = q[bob];
				
			}
			
		}
		

		
		System.out.println(min);
		System.out.println("NEW");
		
		//9 print the entire array to see if step 8 was correct
		
		for (int stacy = 0; stacy < 50; stacy++)
		
		System.out.println(q[stacy]);
		
		//10. print the largest number in the array.
		
		int max = q[0];
		
		for (int bob = 0; bob < 50; bob++) {
			
			if (q[bob] > max) {
				
				max = q[bob];
				
			}
			
		}
		
		System.out.println(max);
		
		
	}
}
