package homework3;

import java.util.Scanner;

public class Task1 {
	/*
	 * �� �� ������� ����� � �� �� ������ ���-������� ����� ������ �� 3 ��
	 * ������. 10, 3, 5, 8, 6, -3, 7 ���-������� ����� ������ �� 3 � -3
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
