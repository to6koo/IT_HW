import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert à n: ");
		int n = sc.nextInt();
		for(int row=1; row<=n; row++){
			for(int i=1; i<= n-row; i++){
			System.out.print(" ");
		}
			for (int i=1; i<= 2*row-1; i++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
	}

}