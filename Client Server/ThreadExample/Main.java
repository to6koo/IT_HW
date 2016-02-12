
public class Main {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new ThreadExample(1));
		Thread t2 = new Thread(new ThreadExample(2));
		Thread t3 = new Thread(new ThreadExample(3));
		Thread t4 = new Thread(new ThreadExample(4));
		Thread t5 = new Thread(new ThreadExample(5));
		Thread t6 = new Thread(new ThreadExample(6));
		
		t1.start();	
	}
}
