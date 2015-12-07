import java.util.Scanner;

public class Task1 {

//	Да се изведат съобщения към потребителя и да се прочетат 2 числа от
//	клавиатурата A и B (може да са с плаваща запетая – double).
//	После да се прочете 3-то число C и да се провери дали то е м/у A и B.
//	Да се изведе подходящо съобщение за това дали C е между A и B.
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert first (A) number: ");
		int a = sc.nextInt();
		System.out.print("Insert second (B) number: ");
		int b = sc.nextInt();
		System.out.print("Insert third (C) number: ");
		int c = sc.nextInt();
		if (c>a && c<b) {
			System.out.println("The third (C) numbers is between A and B");
		}else{
			System.out.println("The third (C) number isn't between A and B");
		}

	}

}
