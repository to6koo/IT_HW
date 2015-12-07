package homework3;

import java.util.Scanner;

public class Task1 {
	/*
	 * ƒа се прочете масив и да се намери най-малкото число кратно на 3 от
	 * масива. 10, 3, 5, 8, 6, -3, 7 Ќай-малкото число кратно на 3 е -3
	 */
	public static void main(String[] args) {

		int[] array = new int[7];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int element = array[0];
		for (int i = 0; i < array.length; i++) {
			System.out.print(" ");
			array[i] = sc.nextInt();
		}
		
		  for (int i = 0; i < array.length; i++) {
		   System.out.print(array[i] + " "); }
		 
		for (int i = 0; i < array.length; i++) {
			if (array[i] < element && array[i] % 3 == 0) {
				element = array[i];
			}
		}
		System.out.println("The element is: " + element);
	}

}
