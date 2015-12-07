import java.util.Scanner;
	//Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ
	//ред.
public class Task5 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert first (A) number: ");
		int a = sc.nextInt();
		System.out.print("Insert second (B) number: ");
		int b = sc.nextInt();
		System.out.print("Insert third (C) number: ");
		int c = sc.nextInt();
		if (a>c && a>b && b>c){
			System.out.println(a+" "+b+ " "+c);
		}
		if(a>c && a>b && c>b){
			System.out.println(a+" "+c+ " "+b);
		}
		if(b>a && b>c && a>c) {
			System.out.println(b+" "+a+" "+c);
		}
		if(b>a && b>c && c>a){
			System.out.println(b+" "+c+" "+a);
		}
		if (c>a && c>b && b>a) {
			System.out.println(c+" "+b+" "+a);
		}
		if(c>a && c>b && a>b){
			System.out.println(c+" "+a+" "+b);
		}
	}

}
