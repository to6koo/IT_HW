
public class Workbench {

	public static void main(String[] args) {
		
		AllWork work = new AllWork();
		
		work.addTask(new Task("Nasipvane", 2));
		work.addTask(new Task("Aranjirane", 12));
		work.addTask(new Task("Chistene", 26));
		work.addTask(new Task("Boqdisvane", 20));
		work.addTask(new Task("Miene", 2));
		work.addTask(new Task("Gotvene", 5));
		work.addTask(new Task("Zagotovki", 3));
		work.addTask(new Task("Servirane", 12));
		work.addTask(new Task("Obslujvane", 8));
		work.addTask(new Task("Hapvane", 2));
		work.addTask(new Task("Otservirane", 1));
		work.addTask(new Task("Pochistvane", 6));
		
		
		
		Employee employee = new Employee("Bai Grishan");
		Employee ivan = new Employee("Bai Ivan");
		Employee kolyo = new Employee("Bai Kolyo");
		
		ivan.setAllWork(work);
		employee.setAllWork(work);
		kolyo.setAllWork(work);
		
		int day = 1;
		
		do {
			System.out.println("Day: " + day++);
			ivan.startWorkingDay();
			employee.startWorkingDay();
			kolyo.startWorkingDay();
			
			ivan.work();
			employee.work();
			kolyo.work();
			
			System.out.println("---------------------");
		} while(work.isAllWorkDone());
	}

}
