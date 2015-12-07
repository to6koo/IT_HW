import java.util.Scanner;

public class Task8 {
	//Да се състави програма, която чете от конзолата 4-цифренo
	//естествено число от интервала [1000.. 9999]. От това число се
	//формират 2 нови 2-цифрени числа. Първото число се формира от 1-та
	//и 4-та цифра на въведеното число. Второто число се формира от 2-рa -
	//3-та цифра на въведеното число. Като резултат да се изведе дали 1-то
	//ново число e по-малко <, равно = или по-голямо от 2-то число.
	//Пример: 3332 Изход: по-малко (32<33)
	//Пример: 1144 Изход: равни (14=14)
	//Пример: 9875 Изход: по-голямо (95>87)

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert first (A) number: ");
		int num = sc.nextInt();
		int first, second;
		 int a;
	        first = num / 100; //
	        a = num % 100;
	        second = a / 1;
	     //   b = a % 1;
	   //     System.out.println(first);
	   //     System.out.println(second);
	        if(second>first){
	        	System.out.println(second+">"+first);
	}
	        if(second<first){
	        	System.out.println(second+"<"+first);
	        }
	        if (second==first) {
				System.out.println(second+"="+first);
			}
	}
}
