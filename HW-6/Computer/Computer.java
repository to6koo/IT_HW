package homework;
/*������ �� �������� �������� ������:
-����� changeOperationSystem(newOperationSystem), ����� �����
���������� �� ������ operationSystem ��� ����������, �������� ����
���������.
-����� useMemory(memory), ����� �������� ���������� �����
(freeMemory) ��� ����������, �������� ���� ��������.
��� ���������� �� ��������� � ��-������ �� ���������� �����,
������� ��������� "Not enough free memory!"
�� �� �������� 2 ������ �� ��� Computer.
�� �� ������� ��������� �� ����� �� ���������� �� year, price,
hardDiskMemory, freeMemory, operationSystem.���� ������� ��������
�� � ������. �� ������ �� ����� ��������� �� �� ������ ����� 100
(���� ������ useMemory), � �� ������, �� �� ����� �������������
������� (���� ������ changeOperationSystem), ���� ����� �� ��
������� �� ������ �������� ������ �� ����� ���������.*/

public class Computer {
	int year;
	double price;
	boolean isNotebook;
	int hardDriveMemory;
	double freeMemory;
	String operationSystem;

	void changeOperationSystem(String newOperationSystem) {
		this.operationSystem = newOperationSystem;
	}

	double useMemory(double memory) {
		if (memory > this.freeMemory) {
			System.out.println("Not enough free memory!");
		}
		if (memory < 0) {
			System.out.println("Is not correct value of memory!");
		} else {
			double momentMemory = this.freeMemory - memory;
			this.freeMemory = momentMemory;

		}
		return this.freeMemory;
	}

}
