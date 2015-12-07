package homework5;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {

		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
System.out.println("Insert first String: ");
		String stringA = sc.nextLine();
		
		char[] str = stringA.toCharArray();
		char space = ' ';
		for (int index = 0; index < str.length - 1; index++) {
			if (str[index] == space) {
				str[index + 1] = Character.toUpperCase(str[index + 1]);
			} else {
				str[index + 1] = Character.toLowerCase(str[index + 1]);
			}
		}
		str[0] = Character.toUpperCase(str[0]);

		for (int index = 0; index < str.length; index++) {
			System.out.print(str[index]);
		}
	}
}
