import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/*Създаване на Scheduler, който ще има един метод push и ще приема
интерфейс Task. Интерфейсът Task ще има един метод doWork.
Scheduler-a трябва да има опашка в която да влиза съответния Task
след като се извика методът му push.
Scheduler-a ще има някакъв базов метод, може да се казва main,
където ще бъде реализирана логката по взимане на Task от queue-то
и стартиране на doWork.
Трябва да се направят минимум 4 различни имплементаци на Task
интерфейс-а.
Да има output-и, които да показват как се изпълнява всеки таск.*/

public class Scheduler {

	Queue<Task> tasks = new LinkedList<Task>();

	public void push(Task task) {

		this.tasks.offer(task);
	}

	void main() {
		System.out.println("Start");
		for (Iterator<Task> it = this.tasks.iterator(); it.hasNext();) {
			((Task) it.next()).doWork();
		}
	}

}
