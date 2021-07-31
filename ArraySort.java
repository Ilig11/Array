/*Name: CRAIG CHRISTOPHER N. ABQUINA
  Sec&Sub: CC13.1 - A
  Task: Write a program in java that accepts 20 integers, and sort the contents of the array in ascending order, then output the result.
		note: implement / write your own code in sorting the array.
  Date: June 3, 2021
*/

import java.util.Scanner;
public class ArraySort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int temp;
        int Array[] = new int[20];
        
		System.out.println("Please enter all the elements:");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = input.nextInt();
        }
        
		for (int i = 0; i < Array.length; i++) {
            for (int j = i + 1; j < Array.length; j++) {
                if (Array[i] > Array[j]) {
                    temp = Array[i];
                    Array[i] = Array[j];
                    Array[j] = temp;
                }
            }
        }
        
		System.out.print("Ascending Order: ");
        for (int i = 0; i < Array.length - 1; i++) {
            System.out.print(Array[i] + "->");
        }
        System.out.print(Array[Array.length - 1]);
    }
}