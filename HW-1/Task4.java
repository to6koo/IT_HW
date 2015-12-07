import java.util.Scanner;

public class Task4 {
	//Въведете 2 различни числа от конзолата и ги разпечатайте в
	//нарастващ ред.
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert first number: ");
		int first = sc.nextInt();
		System.out.print("Insert second number: ");
		int second = sc.nextInt();
		if (first>second){
			System.out.println(second+ " "+first);
		}else{
			System.out.println(first+" "+second);
		}

	}

}
