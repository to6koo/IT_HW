
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

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	/*
	 * Да се направи метод без параметри work() на класа Employee. С извикването
	 * на този метод, работника за който е извикан метода работи по текущата си
	 * задача (ако има такава). Например ако работника има останали 4 часа за
	 * работа, а по задачата има останали 7 часа работа, след изпълнението на
	 * метода работника ще е останал с 0 часа работа за деня, а по задачата ще е
	 * останало 3 часа работа. Ако работника има 8 часа, след изпълнението на
	 * метода work() работника ще е останал с 1 час работа за деня, а времето
	 * което остава на задачата да бъде свършена ще е 0.
	 */

	void work() {
		if (hoursLeft > currentTask.getWorkingHours()) {
			hoursLeft = hoursLeft - currentTask.getWorkingHours();
			currentTask.setWorkingHours(0);
		} else if (currentTask.getWorkingHours() > hoursLeft) {
			currentTask.setWorkingHours(currentTask.getWorkingHours() - hoursLeft);
			hoursLeft = 0;
		} else {
			currentTask.setWorkingHours(0);
			hoursLeft = 0;
		}
	}

	/*
	 * Да се направи и метод showReport, който се извиква след като работника
	 * поработи в/у текущата си задача (извикване на work) и показва информация
	 * (принтирайки на конзолата) за: името на работника името на задачата
	 * работните часовете които остават на работника часовете които остават на
	 * текущата задача на работника за да бъде изпълнена
	 */

	void showReport() {

		System.out.println("Name of Employee is: " + getName());
		System.out.println("Current task to do: " + currentTask.getTaskName());
		System.out.println("Hours left to do his task: " + getHoursLeft());
		System.out.println("Working hours on for the Task: " + currentTask.getWorkingHours());

	}

	// getters and setters
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

}
