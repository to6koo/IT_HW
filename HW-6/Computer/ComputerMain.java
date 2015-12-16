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

public class ComputerMain {

	public static void main(String[] args) {
		Computer lenovo = new Computer();
		lenovo.year = 2012;
		lenovo.price = 980.99;
		lenovo.hardDriveMemory = 750;
		lenovo.freeMemory = 4096;
		lenovo.operationSystem = "Windows 8.1";

		Computer toshiba = new Computer();
		toshiba.year = 2014;
		toshiba.price = 1980;
		toshiba.hardDriveMemory = 2000;
		toshiba.freeMemory = 8192;
		toshiba.isNotebook = true;
		toshiba.operationSystem = "Linux Ubuntu 15.10";

		toshiba.changeOperationSystem("Linux Gnome");
		toshiba.useMemory(100.0);

		System.out.println("Year: " + toshiba.year + " ,Price: " + toshiba.price + ", Operation System: "
				+ toshiba.operationSystem + ", Hard Drive: " + toshiba.hardDriveMemory + ", Memory: "
				+ toshiba.freeMemory + ", Notebook(true/false): " + toshiba.isNotebook);
		System.out.println("Year: " + lenovo.year + " ,Price: " + lenovo.price + ", Operation System: "
				+ lenovo.operationSystem + ", Hard Drive: " + lenovo.hardDriveMemory + ", Memory: " + lenovo.freeMemory
				+ ", Notebook(true/false): " + lenovo.isNotebook);

	}

}
