package homework3;

import java.util.Scanner;

public class Task4 {
	/*
	 * Задача 4: Да се прочете масив и да се отпечата дали е огледален. Следните
	 * масиви са огледални: [3 7 7 3] [4] [1 55 1] [6 27 -1 5 7 7 5 -1 27 6]
	 */
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of array: ");
		int numLeng = sc.nextInt();
		int[] array = new int[numLeng];

		System.out.println("Insert a numbers: ");
		for (int i = 0; i < numLeng; i++) {
			System.out.print(" ");
			array[i] = sc.nextInt();
		}

		// int sum = 0;
		int last = array.length;
		boolean isMirrored = false;
		for (int index = 0; index < array.length / 2; index++) {
			// System.out.print(arr[index]+" ");
			/// System.out.println();
			// System.out.print( arr[indexReverse]+ " ");
			if (array[index] == array[last - 1]) {
				last--;
				isMirrored = true;
			} else {
				System.out.println("The array isn't mirrored! ");
				break;
			}

		}
		if (isMirrored == true) {

			System.out.println("The array is mirrored! ");

		}
		// System.out.println(sum);

	}

}
