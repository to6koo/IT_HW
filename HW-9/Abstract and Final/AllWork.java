public class AllWork {
	
	private Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnasignedTask;

	public AllWork() {
		this.freePlacesForTasks = 10;
		tasks = new Task[10];
	}
	// ����� addTask, ���� ����� �� ������ ������ ��� ����������� �� ������

	public void addTask(Task task) {
		if (freePlacesForTasks > 0) {
			tasks[tasks.length - freePlacesForTasks] = task;
			freePlacesForTasks--;
		} else {
			System.out.println("No free places");
		}

	}

	// ����� getNextTask ����� ����� ���������� ������� ������.

	public Task getNextTask() {
		if (currentUnasignedTask > tasks.length) {
			currentUnasignedTask++;
			return tasks[currentUnasignedTask - 1];
		} else {
			return null;
		}

	}

	// ����� isAllWorkDone, ����� ���������, ���� ������ ������ ��
	// ��������� (���� ������ � ���������, ��� �� ��� ������� 0 ���� ������)

	public boolean isAllWorkDone() {
		boolean isItDone = true;

		for (Task task : tasks) {
			if (task.getWorkingHours() != 0) {
				isItDone = false;
			}
		}
		if (isItDone) {
			System.out.println("All work is done!");
		} else {
			System.out.println("Not all work is done!");
		}
		return isItDone;
	}
	
	//getters and setters
	
	public Task[] getTasks() {
		return tasks;
	}

	public void setTasks(Task[] tasks) {
		this.tasks = tasks;
	}

	public int getFreePlacesForTasks() {
		return freePlacesForTasks;
	}

	public void setFreePlacesForTasks(int freePlacesForTasks) {
		this.freePlacesForTasks = freePlacesForTasks;
	}

	public int getCurrentUnasignedTask() {
		return currentUnasignedTask;
	}

	public void setCurrentUnasignedTask(int currentUnasignedTask) {
		this.currentUnasignedTask = currentUnasignedTask;
	}

}
