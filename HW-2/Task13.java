import java.util.Scanner;

public class Task13 {
	/*Да се състави програма, която извежда всички
	естествени трицифрени числа, които имат сбор на цифрите равен
	на дадено число.
	Дадено : sum, където 2>=sum<=27.
	Пример: 26
	Изход: 899, 989, 998.*/
	public static void main(String[] args) {
	      @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	      int n;
	      do
	      {
	         System.out.print("Insert a number:");
	         n = sc.nextInt();
	      }while(n < 3 || n > 27);

	      for(int i = 0; i <= 9; i++)
	      {
	         for (int j = 0; j <= 9 ; j++ )
	         {
	            for (int k = 0;k <= 9 ; k++ )
	            {
	               if(i+j+k == n )
	               {
	                  System.out.println(i*100 + j*10 + k);
	               }
	            }
	         }
	      }
	   }

	
	
}
