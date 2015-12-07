import java.util.Scanner;

public class Task3 {
	//Въведете 2 различни числа от конзолата и разменете стойността им.
	//Разпечатайте новите стойности

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert first number: ");
		int first = sc.nextInt();
		System.out.print("Insert second number: ");
		int second = sc.nextInt();
		int newfirst; 
		int newsecond;
		newsecond = first;
		first = newsecond;
		newfirst = second;
		System.out.println("Еxchanged first value: " +newfirst);
		System.out.println("Еxchanged second value: " +newsecond);

	}

}
