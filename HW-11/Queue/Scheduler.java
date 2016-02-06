import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/*��������� �� Scheduler, ����� �� ��� ���� ����� push � �� ������
��������� Task. ����������� Task �� ��� ���� ����� doWork.
Scheduler-a ������ �� ��� ������ � ����� �� ����� ���������� Task
���� ���� �� ������ ������� �� push.
Scheduler-a �� ��� ������� ����� �����, ���� �� �� ����� main,
������ �� ���� ����������� ������� �� ������� �� Task �� queue-��
� ���������� �� doWork.
������ �� �� �������� ������� 4 �������� ������������ �� Task
���������-�.
�� ��� output-�, ����� �� �������� ��� �� ��������� ����� ����.*/

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
