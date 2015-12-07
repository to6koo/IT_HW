import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
	      @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	      int n,m;
	      do
	      {
	         System.out.print("Insert n number:");
	         n = sc.nextInt();
	      }while(n < 10 || n > 5555);

	      do
	      {
	         System.out.print("Insert m number:");
	         m = sc.nextInt();
	      }while(n < 10 || n > 5555);

	      for( int j = m; j >= n; --j)
	      {
	         if(j % 50 == 0) System.out.println(j);
	      }
	   }
}
