package homework5;

import java.util.Scanner;

public class Task7 {
	/*
	 * �� �� ������� ��������, ����� ���� ����� �� ���� ��������� � ��������.
	 * ���� �������� �� �� �������� ���� �� ���������� ����, ����� � ���� �����
	 * � ���-������� ����. ������: asd fg hjkl �����: 3 ����, ���-������� � � 4
	 * �������.
	 */
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
System.out.println("Insert first String: ");
		String stringA = sc.nextLine();
		char[] str = stringA.toCharArray();

		int maxCount = 0;
		int max = 0;
		int wordCount = 1;

		for (int index = 0; index < stringA.length(); index++) {

			if (stringA.charAt(index) == ' ') {
				for (int i = 0; i < stringA.length(); i++) {

				}

				wordCount++;
			}
		}
		System.out.println("����� ���� �: " + wordCount);
		for (int index = 0; index < str.length; index++) {
			if (str[index] == ' ') {

				if (max < maxCount) {
					max = maxCount;
				}
				maxCount = 0;
				continue;
			}
			maxCount++;

		}

		System.out.println("������ � ���-����� ������� �: "+max);
	}
}
