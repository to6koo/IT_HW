import java.util.Scanner;

public class Task13 {
	//Да се състави програма, която да отгатне колко е студено/топло по
	//въведената температура t в градус Целзий.
	//Температурните интервали са:
	//под -20 ледено студено;
	//между 0 и -20 - студено;
	//между 15 и 0 - хладно;
	//между 25 и 15 - топло;
	//над 25 – горещо.
	//Входни данни: цяло число от интервала [-100..100].
	//Пример: 12
	//Изход: хладно

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter degrees in Celsius: ");
		double degrees = sc.nextDouble();
		System.out.println("Entered degrees in Celsius is "+degrees+" °C");
		if (degrees<=-20) {
			System.out.println("The temperature is very cold!");
			}
		if (degrees>-20 && degrees<=0 ) {
			System.out.println("The temperature is  cold!");
			}
		if (degrees>0 && degrees<=15 ) {
			System.out.println("The temperature is chilly!");
			}

		if (degrees>15 && degrees<=25) {
			System.out.println("The temperature is very warm!");
			}

		if (degrees>25) {
			System.out.println("The temperature is very hot!");
			}

		

	}

}
