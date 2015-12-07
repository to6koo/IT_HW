package homework5;

import java.util.Arrays;
import java.util.Scanner;

/*�� �� ������� �����, ����� ������ �� ������ ����� ����� N �
����� ����� �� ����� � ������� N, ����� ������� ������ �����
�� 1 �� N.*/
public class Task12 {
	static int[] CreateArray(int num) {

		int[] array = new int[num];
		int increase = 1;
		for (int index = 0; index < array.length; index++) {
			array[index] = increase;
			increase++;
		}
		return array;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a number ");
		int number = sc.nextInt();

		System.out.println(Arrays.toString(CreateArray(number)));

	}

}
