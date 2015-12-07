import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		
		      @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
		      int n;
		      int a1=0, a2=0, a3=0, a4=0, a5=0;
		      
		      do
		      {
		         System.out.print("Insert n number:");
		         n = sc.nextInt();
		      }while(n < 10 || n > 30000);

		      if ( n < 100)
		      {
		         a4 = n / 10 % 10;
		         a5 = n % 10;
		         if( a4 == a5 )
		         {
		            System.out.println("Palindrom");
		         }
		         else
		         {
		            System.out.println("Ne e palindrom");
		         }

		      }else if( n < 1000)
		      {
		         a3 = n / 100 % 10;
		         a4 = n / 10 % 10;
		         a5 = n % 10;
		         if( a3 == a5 )
		         {
		            System.out.println("Palindrom");
		         }
		         else
		         {
		            System.out.println("Ne e palindrom");
		         }

		      }else if( n < 10000)
		      {
		         a2 = n / 1000 % 10;
		         a3 = n / 100 % 10;
		         a4 = n / 10 % 10;
		         a5 = n % 10;
		         if( a2 == a5 && a3 == a4 )
		         {
		            System.out.println("Palindrom");
		         }
		         else
		         {
		            System.out.println("Ne e palindrom");
		         }

		      }else
		      {
		         a1 = n / 10000;
		         a2 = n / 1000 % 10;
		         a3 = n / 100 % 10;
		         a4 = n / 10 % 10;
		         a5 = n % 10;
		         if( a1 == a5 && a2 == a4 )
		         {
		            System.out.println("Palindrom");
		         }
		         else
		         {
		            System.out.println("Ne e palindrom");
		         }
		      }


		   }

}
