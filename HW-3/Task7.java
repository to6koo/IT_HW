package homework3;

import java.util.Scanner;

public class Task7 {
	/*
	 * Напишете програма, която първо чете масив и после създава нов масив със
	 * същия размер по следния начин: стойността на всеки елемент от втория
	 * масив да е равна на сбора от предходния и следващият елемент на
	 * съответния елемент от първия масив. Да се изведе получения масив.
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
		int[] newArray = new int[numLengFirst];
		newArray[0] = array1[1];
		newArray[newArray.length - 1] = array1[array1.length - 2];
		for (int index = 1; index < array1.length -1; index++) {
			newArray[index] = array1[index - 1] + array1[index + 1];
		}
	System.out.println();
		for (int index = 0; index < newArray.length; index++) {
			System.out.print(newArray[index]+" ");
		}

	}

}
