package homework3;

import java.util.Scanner;

public class Task3 {
	/*
	 * Да се въведе число, след което да се създаде масив с 10 елемента по
	 * следния начин: Първите 2 елемента на масива са въведеното число. Всеки
	 * следващ елемент на масива е равен на сбора от предишните 2 елемента в
	 * масива. След това изведете масива .
	 */
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a number: ");
		int num = sc.nextInt();

		int[] array = new int[10];
		array[0] = num;
		array[1] = num;
		/*array[2] = array[0] + array[1];
		array[3] = array[1] + array[2];
		array[4] = array[2] + array[3];
		array[5] = array[3] + array[4];
		array[6] = array[4] + array[5];
		array[7] = array[5] + array[6];
		array[8] = array[6] + array[7];
		array[9] = array[7] + array[8];*/

		for (int index = 2; index < array.length; index++) {
			array[index] = array[index-1]+array[index-2];
			//System.out.print(array[index] + " ");
		}
		for(int i=0; i<array.length; i++){
			System.out.print(array[i]+" ");
		}

	}

}
