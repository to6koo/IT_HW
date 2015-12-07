import java.util.Scanner;

public class Task7 {
	//Започвайки от 3, да се изведат на екрана първите n
	//числа които се делят на 3. Числата да са разделени със запетая.
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert а n: ");
		int n = sc.nextInt();
		
		for(int i=3, j=n; i<=j; i++){
			if(i%3==0)
			System.out.print(i+",");
		}
		
		

	}

}
