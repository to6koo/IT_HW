import java.util.Scanner;

public class Task14 {
	/*Да се състави програма, която по въведено
	естествено число N от интервала [10..200] извежда в обратен
	ред всички числа, които са кратни на 7 и са по-малки от N.*/
	public static void main(String[] args) {
	      @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	      int n;
	      do{
	         System.out.print("Insert n number:");
	         n = sc.nextInt();
	      }while(n < 10 || n > 200);

	      while (n != 0){
	         if(n % 7 == 0) System.out.println(n);
	         n--;
	      }
	   }

}
