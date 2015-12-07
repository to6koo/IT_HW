package homework4;

import java.util.Scanner;

public class Task3 {
	/*
	 * Имате двумерен масив от числа, чийто стойности са въведени предварително.
	 * Да се отпечатат сумата на елементите на масива, както и
	 * средноаритметичното на тези числа.
	 */

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("rows of array: ");
		int rows = sc.nextInt();
		System.out.print("rows of array: ");
		int cols = sc.nextInt();
		int[][] array1 = new int[rows][cols];
		System.out.println("Insert a numbers: ");
		int sum = 0;
		double avr = 0;
		for (int row = 0; row < array1.length; row++) {
			for (int col = 0; col < array1[row].length; col++) {
				System.out.print(" ");
				array1[row][col] = sc.nextInt();
			}
		}
		for (int row = 0; row < array1.length; row++) {

			for (int col = 0; col < array1[row].length; col++) {
				System.out.print(array1[row][col]);

			}
			System.out.println();
		}
		for (int row = 0; row < array1.length; row++) {

			for (int col = 0; col < array1[row].length; col++) {
				sum += array1[row][col];

			}

		}
		avr = (double)sum/ (double)(rows*cols);
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+avr);
	}

}
