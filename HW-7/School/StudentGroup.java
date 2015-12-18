
public class StudentGroup {
	String groupSubject;
	Student[] students;
	int freePlaces;
	private int currentFreePlace;

	public StudentGroup() {
		this.freePlaces = 5;
		this.students = new Student[5];
	}

	public StudentGroup(String groupSubject) {
		this();
		this.groupSubject = groupSubject;
	}

	void emptyGroup() {
		this.freePlaces = 5;
		this.students = new Student[5];
	}

	void addStudent(Student student) {
		if (student != null && this.freePlaces != 0) {

			if (this.currentFreePlace < students.length) {
				this.students[currentFreePlace] = student;
				currentFreePlace++;
				this.freePlaces--;
			}
		}
	}

	

	void printStudentsInGroup() {
		for (int index = 0; index < currentFreePlace; index++) {
			if (students[index] != null) {
				System.out.println(students[index].name + " " + students[index].grade);
			}
		}
	}

}
