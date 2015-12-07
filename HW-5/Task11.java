package homework5;
/*Да се създаде метод, който отпечатва масив в конзолата.
*/
public class Task11 {
	static int[] print(int[] a){
		
		for(int i=0; i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		return a;
	}

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,2,3};
		print(a);
	}

}
