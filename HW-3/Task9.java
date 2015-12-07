package homework3;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		int[] array=new int[7];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		//int element = array[0];
		int[] array1 = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			System.out.print(" ");
			array[i] = sc.nextInt();
		}
		
		
		
		for (int i = array.length-1; i >= 0; i--) {
			array1[i] =  array[i];
			//System.out.print(array1[i]+" ");
		}
		for (int index=0; index < array1.length; index++ ) {
			System.out.print(array1[index] + " ");
		}
	}
}
