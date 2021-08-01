/*Name: CRAIG CHRISTOPHER N. ABQUINA
  Sec&Sub: CC13.1 - A
  Task: Write a program that accepts an integer from the user, n. 
		Then generate 10,000 random numbers ranging from 1 to n. 
		Print the number or numbers that occured the most. 
  Date: June 3, 2021
*/

import java.util.*;
public class OccuringDigit {
	static int mostFrequent(int A[], int size) {
		Arrays.sort(A); // Sort the array first, then linearly traverse the array.
		
		// find the max frequency using linearly
		// traversal
		int max_count = 1, res = A[0];
		int curr_count = 1;
		
		for (int i=1; i<size; i++) {
			if (A[i] == A[i-1])
				curr_count++;
			else {
				if (curr_count > max_count) {
					max_count = curr_count;
					res = A[i - 1];
				}
				curr_count = 1;
			}
		}
		// if last element is most frequent
		if (curr_count > max_count) {
			max_count = curr_count;
			res = A[size - 1];
		}
		return res;
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner (System.in);
		Random rnd = new Random(); // random number generator
		
		int A[] = new int [10000]; 
		System.out.print("Please enter the range number: ");
		int n = input.nextInt();
		int size = A.length;
		
		for (int i=0; i<A.length; i++) {
			A[i] = rnd.nextInt(n) + 1; 	 // generate numbers ranging 1 to n 
			System.out.println("Generated number is: " + A[i]);
		}
		System.out.println("The number the occured the most is: " + mostFrequent(A, size));
	}
}