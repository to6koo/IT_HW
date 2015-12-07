import java.util.Scanner;

public class Task2 {
//	Въведете 2 различни целочислени числа от конзолата. Запишете
//	тяхната сума, разлика, произведение, остатък от деление и
//	целочислено деление в отделни променливи и разпечатайте тези
//	резултати в конзолата. Опитайте същото с числа с плаваща запетая.

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert first number: ");
		int first = sc.nextInt();
		System.out.print("Insert second number: ");
		int second = sc.nextInt();{
		System.out.println("Сума: "+(first+second));
		System.out.println("Разлика: "+(first-second));
		System.out.println("Произведение: "+(first*second));
		System.out.println("Остатък от деление: "+(first%second));
		System.out.println("Целочислено деление: "+(first/second));
		}
		System.out.println("");
		System.out.print("Insert first number: ");  //слага се запетайка, вместо точка
		double a= sc.nextDouble();
		System.out.print("Insert second number: "); //слага се запетайка, вместо точка
		double b= sc.nextDouble();
		System.out.println("Сума: "+(a+b));
		System.out.println("Разлика: "+(a-b));
		System.out.println("Произведение: "+(a*b));
		System.out.println("Остатък от деление: "+(a%b));
		System.out.println("Целочислено деление: "+(a/b));
	}

}
