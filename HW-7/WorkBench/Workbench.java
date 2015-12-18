
public class Workbench {

	public static void main(String[] args) {

		Task task = new Task();
		task.setTaskName("Construction House");
		task.setWorkingHours(14);

		Employee employee = new Employee("Bai Grishan");
		employee.setHoursLeft(12);
		employee.setCurrentTask(task);

		employee.work();
		employee.showReport();
	}

}
