import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
	      @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	      int n;
	      char ch;
	      do
	      {
	         System.out.print("Insert n number:");
	         n = sc.nextInt();
	         System.out.print("Insert +, - or Letter :");
	         ch = sc.next().charAt(0);
	      }while(n < 4 || n > 20);

	      for(int i=0; i < n; ++i){
	         for(int j=0; j < n; ++j){
	            if(i == 0 || i == n-1){
	               System.out.print("*");
	            }else{
	               if(j == 0 || j == n-1){
	                  System.out.print("*");
	               }else{
	                  System.out.print(ch);
	               }
	            }
	         }
	         System.out.println();
	      }
	   }
}
