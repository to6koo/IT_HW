import java.util.Scanner;

public class Task9 {
	//Да се състави програма, която чете от конзолата 2 естествени
	//двуцифрени числа a,b.
	//Програмата да изведе в конзолата дали последната цифра от
	//произведението на двете числа е четна, както и самата цифра.
	//Входни данни: a,b - естествени числа от интервала [10..99].
	//Пример: 15, 25
	//Изход: 375, 5 нечетна

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert first number: ");
		int first = sc.nextInt();
		System.out.print("Insert second number: ");
		int second = sc.nextInt();
		int product, a;
		product = second*first;
		 a = product %10;
		// System.out.println(a);
		System.out.print("Product is: "+product);
		if(a % 2==1){
            System.out.println(", "+a+" odd");
        }else{
            System.out.println(", "+a+" even");
        }
	}
}
