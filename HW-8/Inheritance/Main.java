
public class Main {

	public static void main(String[] args) {

		Person[] people = new Person[10];
		people[0] = new Person("Dayan", 21, true);
		people[1] = new Person("Simeon", 21, true);
		people[2] = new Student("Boris", 12, true, 3);
		people[3] = new Student("Monika", 25, false, 5);
		people[4] = new Employee("Cvetoslava", 22, false, 95);
		people[5] = new Employee("Pavlina", 22, false, 84);

		for (Person person : people) {
			if (person != null) {
				if (person.getClass().getName().equals("Person")) {
					person.showPersonInfo();
				}
				if (person.getClass().getName().equals("Student")) {
					((Student) person).showStudentInfo();
				}
				if (person.getClass().getName().equals("Employee")) {
					((Employee) person).showEmployeeInfo();
				}
			}
		}
		System.out.println();
		System.out.println();

		for (Person person : people) {
			if (person != null) {
				if (person.getClass().getName().equals("Employee")) {
					System.out.print(person.getName() + "'s overtime payment wîuld be: ");
					System.out.println(((Employee) person).calculateOvertime(2));
				}
			}
		}
		System.out.println();
		System.out.println();

		Student student = new Student("Todor", 21, true, 4.1);

		student.showStudentInfo();
		student.showPersonInfo();
	}

}
