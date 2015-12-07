import java.util.Scanner;

public class Task16 {
	//Въведено е трицифрено естествено число от вида abc.
	//Трябва да се провери дали:
	//ако a = b = c - Изход: цифрите са равни;
	//ако a>b>c - Изход: цифрите са във възходящ ред;
	//ако a<b<c цифрите са в низходящ ред;
	//и изход: цифрите са ненаредени, за неописаните случаи.
	//Да се състави програма, която извежда резултата от проверката за
	//наредба на цифрите в числото.
	//Пример: 345
	//Изход: възходящ ред.

	public static void main(String[] args) {
		@SuppressWarnings("resource")
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insert a number without zero(0): ");
        int num = keyboard.nextInt();
        int first, second, third;
        int a,b;
        first = num / 100;
        a = num % 100;
        second = a / 10;
        b = a % 10;
        third = b / 1;
        if (first>second && second>third) {
        	System.out.print(first+">"+second+">"+third);
			System.out.println(" The figures are ascending");
		}
        else if (third>second && second>first) {
        	System.out.print(first+"<"+second+"<"+third);
			System.out.println(" Figures are in descending order");
		}
        else if (third==second && second==first) {
        	System.out.print(first+"="+second+"="+third);
			System.out.println(" Figures are in equal");
		}else{
			System.out.println("The figures are not arranged");
		}
          

	}

}
