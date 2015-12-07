import java.util.Scanner;

public class Task15 {
	/*Да се състави програма, която да изчисли сумата на
	всички числа от 1 до въведено число N.
	Пример: 5
	Изход: 15
	Използвайте цикъл do-while.*/
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert а number: ");
		int a = sc.nextInt();
		int sum=0;
		int i=0;
		do{
			sum = sum+i;
			i++;
		}
		while(i<=a);
		System.out.println(sum);
		
		/*for (int i=1 ;i <= n; ++i)
	      {
	         sum *=i;
	      }*/

		
		
	}

}
