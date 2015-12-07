import java.util.Scanner;

public class Task19 {
	/*Да се състави програма, чрез която по въведено
	естествено число от интервала [10..99] се извежда поредица
	числа, при спазване на следните изисквания:
	1) ако предходното число е четно се извежда 0.5*числото;
	2) ако предходното число е нечетно се извежда 3*числото +1.
	Извеждането продължава докато не се получи стойност 1.
	Пример: 11
	Изход: 34 17 52 26 13 40 20 10 5 16 8 4 2 1.*/
	public static void main(String[] args) {
	      @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	      int n;
	      do
	      {
	         System.out.print("Insert n number: ");
	         n = sc.nextInt();
	      }while(n < 10 || n > 99);


	      while(true)
	      {
	         if(n == 1) break;
	         if(n % 2 == 0)
	         {
	            n/=2;
	            System.out.print(n+" ");
	         }
	         else
	         {
	            n = n*3+1;
	            System.out.print(n+" ");
	         }
	      }

	   }

}
