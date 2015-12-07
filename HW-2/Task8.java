import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		  Scanner sc = new Scanner(System.in);
	      System.out.print("Insert a number:");
	      int n = sc.nextInt();

	      for(int i=n-1,j=0;j<n;j++,i+=2)
	      {
	         for(int k = 0;k < n ; k++)
	         {
	            System.out.print(i);
	         }
	         System.out.println();
	      }
		
	}

}
