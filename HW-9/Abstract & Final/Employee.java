
public class Employee {
	/*
	 * Да се създаде клас Employee репрезентиращ работник. Класът да има
	 * следните полета: name – име на работника currentTask – обект от тип
	 * Task, който показва текущата задача в/у която работи работника hoursLeft
	 * – числова стойност, която показва колко работни часа остават на работника
	 * (за днес)
	 */

	private String name;
	private Task currentTask;
	private int hoursLeft;
	final int workingHours = 8;
	AllWork allWork;

	public Employee(String name) {
		this.name = name;
	}

	public void work() {
		if (currentTask == null) {
			setCurrentTask(allWork.getNextTask());
		}

		while (this.hoursLeft > 0 && currentTask != null) {
			if (currentTask == null) {
				break;
			}

			int hoursForWork = this.hoursLeft;
			if (this.hoursLeft > currentTask.getWorkingHours()) {
				hoursForWork = currentTask.getWorkingHours();
			}
			hoursLeft -= hoursForWork;
			currentTask.setWorkingHours(currentTask.getWorkingHours() - hoursForWork);
			showReport();
			if (currentTask.getWorkingHours() == 0) {
				setCurrentTask(allWork.getNextTask());
			}
		}
	}

	/*
	 * Да се направи и метод showReport, който се извиква след като работника
	 * поработи в/у текущата си задача (извикване на work) и показва информация
	 * (принтирайки на конзолата) за: името на работника името на задачата
	 * работните часовете които остават на работника часовете които остават на
	 * текущата задача на работника за да бъде изпълнена
	 */

	void showReport() {

		System.out.println("Name of Employee is: " + getName());
		System.out.println("Current task to do: " + currentTask.getTaskName());
		System.out.println("Hours left to do his task: " + getHoursLeft());
		System.out.println("Working hours on for the Task: " + currentTask.getWorkingHours());

	}

	void startWorkingDay() {
		this.setHoursLeft(workingHours);
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}

	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		this.currentTask = currentTask;
	}

	public int getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		if (hoursLeft > 0) {
			this.hoursLeft = hoursLeft;
		}
	}

	public AllWork getAllWork() {
		return allWork;
	}

	public  void setAllWork(AllWork allWork) {
		this.allWork = allWork;
	}

	public int getWorkingHours() {
		return workingHours;
	}

}
