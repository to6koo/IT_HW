import javax.swing.plaf.SliderUI;


public class ThreadExample implements Runnable{

	String name = "";
	
	public ThreadExample(int n) {
		this.name += n;
	}
		
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			int counter = 0;
			while(true){
//			System.out.println("Thread " + name);
//			notifyAll();
//			try {
//				wait(1500);
//				
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				System.out.println("Thread " + name);
//				}
				
				System.out.println("Thread exec counter: " + counter);
				counter++;	
				if(counter == 10){
					return;
				}
				
			}
		}
	}	
}
