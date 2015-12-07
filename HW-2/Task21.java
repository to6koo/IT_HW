import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		
		      @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
		      int n;
		      
		      do
		      {
		         System.out.print("Insert N number:");
		         n = sc.nextInt();
		      }while(n < 1 || n > 51);

		      for (int i = n - 1; i <= 51; ++i)
		      {
		         switch(i / 4)
		         {
		            case 0:
		            case 1:
		            case 2:
		            case 3:
		            case 4:
		            case 5:
		            case 6:
		            case 7:
		            case 8: System.out.print((i / 4) + 2 + " "); break;
		            case 9: System.out.print("Vale "); break;
		            case 10: System.out.print("Dama "); break;
		            case 11: System.out.print("Pop "); break;
		            case 12: System.out.print("Aso "); break;
		            default: break;
		         }
		         switch(i % 4)
		         {
		            case 0: System.out.print("Spatiq");break;
		            case 1: System.out.print("Karo");break;
		            case 2: System.out.print("Kupa");break;
		            case 3: System.out.print("Pika");break;
		            default: break;
		         }
		         System.out.println();
		      }
		   }
	}