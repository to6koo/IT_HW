import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
	      @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	      System.out.print("Insert A number:");
	      int A = sc.nextInt();

	      System.out.print("Insert B number:");
	      int B = sc.nextInt();

	      int sum = 0;
	      for(int i = A; i <= B; i++)
	      {
	         if(i % 3 == 0)
	         {
	            System.out.print("Skip 3,");
	         }
	         else
	         {
	            sum+=i*i;
	            if(sum> 200) break;
	            System.out.print(i*i + ", ");
	         }
	      }
	   }
}
