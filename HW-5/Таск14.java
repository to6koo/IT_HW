package homework5;
/*Да се състави метод, който приема за стойност число N и връща
стойността на N! (N факториел).*/

public class Таск14 {
	static int factoriel(int n) {

		if (n <= 1) {
			return 1;
		}

		return factoriel(n - 1) * n;
	}

	public static void main(String[] args) {
		 int n=10;
		 System.out.println("Factocial of n is:");
		System.out.println(factoriel(n));
	}
}
