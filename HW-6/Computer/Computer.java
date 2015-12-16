package homework;
/*Класът да дефинира следните методи:
-метод changeOperationSystem(newOperationSystem), който сменя
стойността на полето operationSystem със стойността, подадена като
параметър.
-метод useMemory(memory), който намалява свободната памет
(freeMemory) със стойността, подадена като аргумент.
Ако стойността на аргумента е по-голяма от свободната памет,
извежда съобщение "Not enough free memory!"
Да се създадат 2 обекта от тип Computer.
Да се зададат стойности на всеки от компютрите за year, price,
hardDiskMemory, freeMemory, operationSystem.Нека единият компютър
да е лаптоп. На единия от двата компютъра да се задели памет 100
(чрез метода useMemory), а на другия, да се смени операционната
система (чрез метода changeOperationSystem), след което да се
изведат на екрана всичките полета на двата компютъра.*/

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
