
public class Student {
	String name;
	String subject;
	double grade;
	int yearInCollage;
	int age;
	boolean isDegree;
	double money;

	public Student() {
		this.grade = 4.0;
		this.yearInCollage = 1;
		this.isDegree = false;
		this.money = 0;
	}

	public Student(String name, String subject, int age) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}

	void upYear() {

		if (this.isDegree == false) {
			this.age++;
			if (age == 4) {
				isDegree = true;
			}
		} else {
			System.out.println("The student is already graduated!");
		}
	}

	double recieveShcolarship(double min, double amount) {
		double sholarship = 0;

		if (this.grade >= min && age < 30) {
			sholarship = this.money + amount;
			this.money = sholarship;
		}
		return this.money;
	}

}
