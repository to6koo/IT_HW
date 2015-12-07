package homework5;

import java.util.Scanner;

public class Task4 {
	/*
	 * Задача 4: Да се състави програма, чрез която по въведени трите имена на
	 * двама човека разделени със запетая, се извежда чие име има по-голям сбор
	 * от ASCII кодовете на съставящите името букви. Пример: Anna Dosewa
	 * Asenowa, Iwo Peew Peew Изход: Anna Dosewa Asenowa
	 */
	public static void main(String[] args) {
		//@SuppressWarnings("resource")
		//Scanner sc = new Scanner(System.in);

		String stringA=new String("Todor Ivanov, Pavlina Atanasova");
		//String trimmedText = stringA.trim();

		//System.out.print("Insert first string:");
		//stringA = sc.next();
		

		boolean hasText = stringA.contains(",");
		System.out.println(hasText);
		int isPosition = stringA.indexOf(',');
		// System.out.println(isPosition);
		char[] name = stringA.toCharArray();
		int sum = 0;
		int sum1 = 0;

		{
			for (int i = 0; i < isPosition; i++) {

				sum = sum + name[i];
				// System.out.print(name[i]);

			}
			for (int i = name.length - 1; i > isPosition; i--) {

				sum1 = sum1 + name[i];
				// System.out.print(name[i]+" ");

			}
			/*System.out.println();
			System.out.println(sum);
			System.out.println(sum1);*/

			if (sum > sum1) {
				for (int index = 0; index < isPosition; index++) {
					System.out.print(name[index]);
					
				}

			} 
			if(sum1>sum)  {
				for (int i = isPosition+1; i <name.length; i++) {
					
					 System.out.print(name[i]);
				
				}
			}
			
		}

	}
}
