package homework3;

import java.util.Scanner;

public class Task2 {
	/*
	 * ���� �� ������� ����� �� �� ���������� ���, ���� ���������� �� ��������
	 * �� ����� ���� �� �����������, � ������� �� �� ���� ��������, �� � �������
	 * ���. ��������, �� �� ������ ����� ����� �� ������.
	 */

	public static void main(String[] args) {
		int[] array = new int[8];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		// int element = array[0];
		for (int i = 0; i < array.length; i++) {
			System.out.print(" ");
			array[i] = sc.nextInt();
		}
		int newArray[] = new int[array.length];
		int length = newArray.length -1;

		for (int i = 0; i < array.length / 2; i++) {
			
			newArray[i] = array[i];
			newArray[length] = array[i];
			length--;

		}
		for (int index = 0; index < newArray.length; index++) {
			System.out.print(newArray[index] + " ");
		}
	}
}
