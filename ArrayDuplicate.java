/*Name: CRAIG CHRISTOPHER N. ABQUINA
  Sec&Sub: CC13.1 - A
  Task: Write a program in java that reads 20 integers, and store them in an array. 
        The program should be able to identify how many numbers have duplicates. 
		Output the number with duplicates and the number of times it appears on the array.
			Example:
				(input)
				40, 50, 60, 50, 40, 40, 10, 10, 5, 50, 19, 10, 5, 3, 4, 1, 8, 9, 0, 100

				(output)    
				40 = 3
				50 = 3 
				10 = 3
				5  = 2
  Date: June 3, 2021
*/ 

import java.util.*; 
public class ArrayDuplicate { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 					// Take input from the user
        int Array[] = new int[20];     							// Declare the Array
        System.out.println("Please enter the array elements:");
        for(int i=0; i<Array.length ;i++) {
            Array [i] = input.nextInt();     						// Initialize Array elements
        }
        
        int max = Integer.MIN_VALUE; 							// Integer.MIN_VALUE = -2147483648
        for (int i = 0; i < Array.length; i++) { 
            if (Array[i] > max) 
                max = Array[i]; 
        } 
  
        int Frequency[] = new int[max + 1];     					// Declare another Array to store the frequency
        for (int i = 0; i < Array.length; i++) { 
            Frequency[Array[i]]++; 							// Increment in Frequency[] for every integer in Array[]. 
        } 
        
        System.out.println("Output:");
        for (int i = 0; i < max; i++) {  
            if (Frequency[i] > 1) 							// output only if element is more than 1 time in Array[].
                System.out.println(i + " = " + Frequency[i]); 
        } 
    } 
}
