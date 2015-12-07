import java.util.Scanner;

public class Task6 {
	//Да се прочете число от екрана(конзолата) и да се
	//изведе сбора на всички числа между 1 и въведеното число.
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert а number: ");
		int a = sc.nextInt();
		int sum=0;
		for(int i=1, j=a; i<=j; i++){
			sum = sum +i;
			
		}
		System.out.println("Result is: "+sum);
	}

}
