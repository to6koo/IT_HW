package homework5;

import java.util.Scanner;

public class Task8 {
	/*�� �� ������� ��������, ���� ����� �� ������� ��� �� �������
	(������, ���).
	���������� �� ������ �� ������ ���� ��������� ������ � ���������,
	�.�. ���� ����� ������-������� � �������-������ � ���� � ���.
	����: �����
	�����: ��.
	����: ��������
	�����: ��.*/
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
System.out.println("Insert first String: ");
		String stringA = sc.nextLine();
		char[] str = stringA.toCharArray();
		int length = str.length;
		boolean isPalindrome = true;

		for (int index = 0; index < str.length/2; index++) {
			if (str[index] == str[length - 1]) {
				length--;
			} else {
				isPalindrome = false;
				System.out.println("The string is not a palindrome!");
				break;
			}
		}
		if (isPalindrome == true) {
			System.out.println("The string is a palindrome!");
		}
	}
}
