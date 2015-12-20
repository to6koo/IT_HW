/*
Полета:
name - име
age - години
isMale - поле, показващо пола*/

public class Person {
	private String name;
	private int age;
	private boolean isMale;

	// constructor
	public Person(String name, int age, boolean isMale) {
		this.setName(name);
		this.setAge(age);
		this.setIsMale(isMale);
	}

	/*
	 * Метод showPersonInfo, който показва информация за човека (изписва на
	 * конзолата стойността на всичките му полета по подходящ начин)
	 */

	void showPersonInfo() {
		System.out.println("The name of Person is: " + this.getName());
		System.out.println("The age of Person is: " + this.getAge());
		System.out.println("The sex of Person is: " + this.getIsMale());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean getIsMale() {
		return isMale;
	}

	public void setIsMale(boolean isMale) {
		this.isMale = isMale;
	}

}
