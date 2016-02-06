
public class Demo {

	public static void main(String[] args) {
		Scheduler scheduler = new Scheduler();

		scheduler.push(new Task() {

			@Override
			public void doWork() {
				System.out.println("Work Now!");
			}
		});

		scheduler.push(() -> System.out.println("Work Second Now!"));
		scheduler.push(() -> System.out.println("Work Third Now!"));
		scheduler.push(() -> System.out.println("Work Four Now!"));

		scheduler.main();
	}

}
