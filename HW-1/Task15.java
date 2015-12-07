import java.util.Scanner;

public class Task15 {
	//Да се състави програма, която въвежда естествено число от интервала
	//[0..24].
	//Програмата да изведе съответстващо съобщение съобразно въведения
	//час.
	//Периодите са:
	//[18..4] - Добър вечер; // правилно 18..6
	//[4..9] - Добро утро;	// правилно 6..11
	//[9..18] - Добър ден	// правилно 11..18
	//Пример: 10
	//Изход: Добър ден
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert time(hour): ");
		double a = sc.nextDouble();
		if(a>=6 && a<11){
			System.out.println("Good Morning!");
		}
		if(a>=11 && a<18){
			System.out.println("Good Evening!");
		}
		if (a>=18 && a<24 || a>=0 && a<6) {
			System.out.println("Good Night!");
		}

	}

}
