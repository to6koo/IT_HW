
public class Task {
	/*
	 * Класът Task представя някакво количество работа(задача) което трябва да
	 * бъде свършено. Класът да има следните полета: име workingHours – числов
	 * тип, който показва колко часа остават на задачата за да бъде изпълнена
	 */

	private String name;
	private int workingHours;

	// конструктор
	Task(String name, int workingHours){
		if(name != null){
			this.name = name;
		}
		if(workingHours > 0){
			this.workingHours = workingHours;
		}
	}

	// getters and setters
	public String getTaskName() {
		return name;
	}

	public void setTaskName(String name) {
		if (name != null) {
			this.name = name;
		}
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		if (workingHours > 0) {
			this.workingHours = workingHours;
		}
	}

}
