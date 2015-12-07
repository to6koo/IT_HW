import java.util.Scanner;

public class Task5 {
	/* Да се въведат от потребителя 2 числа. И да се
	 изведат на екрана всички числа от по-малкото до по-голямото.
*/
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert first  number: ");
		int a = sc.nextInt();
		System.out.print("Insert second  number: ");
		int b = sc.nextInt();
		for(int i=a, j=b; i<=j; i++){
			System.out.print(i+" ");
		}
		
	}

}
