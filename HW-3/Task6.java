package homework3;

import java.util.Scanner;

public class Task6 {
	/*
	 * Напишете програма, която първо чете 2 масива и после извежда съобщение
	 * дали са еднакви, и дали са с еднакъв размер.
	 */

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of array: ");
		int numLengFirst = sc.nextInt();
		int[] array1 = new int[numLengFirst];

		System.out.println("Insert a numbers: ");
		for (int i = 0; i < numLengFirst; i++) {
			System.out.print(" ");
			array1[i] = sc.nextInt();
		}

		System.out.print("Size of second array: ");
		int numLengSecond = sc.nextInt();
		int[] array2 = new int[numLengSecond];

		System.out.println("Insert a numbers: ");
		for (int i = 0; i < numLengSecond; i++) {
			System.out.print(" ");
			array2[i] = sc.nextInt();
		}
		if (array1.length != array2.length) {
			System.out.println("Arrays is the same.");
		} else {
			int index = 0;
			for (index = 0; index < array1.length; index++) {

				if (array1[index] != array2[index]) {

					System.out.println("Arrays is different.");
					break;
				}
			}

			if (index >= array1.length) {
				System.out.println("Arrays is the same.");
			}
		}
	}

}
