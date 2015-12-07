package homework5;

import java.util.Scanner;

/*Да се състави програма, чрез която се въвеждат два низа съдържащи
до 40 главни и малки букви.
Като резултат на екрана да се извеждат низовете само с главни и само
с малки букви.
Пример: Abcd Efgh
Изход: ABCD abcd EFGH efgh*/
public class Task1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String stringA;
		String stringB;

		System.out.print("Enter the string containing "
				+ "no more than 40 characters:");
		stringA = sc.next();
		System.out.print("Enter the string containing "
				+ "no more than 40 characters:");
		stringB = sc.next();

		{
			System.out.println(stringA.toLowerCase());
			System.out.println(stringA.toUpperCase());
		}

		{
			System.out.println(stringB.toLowerCase());
			System.out.println(stringB.toUpperCase());
		}

		

	}
}