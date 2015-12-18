
public class Collage {

	public static void main(String[] args) {
		Student to6koo = new Student("Todor", "KSI", 21);
		to6koo.upYear();
		to6koo.grade =5.0;
		Student to6koo1 = new Student("Stefan", "KSI", 23);
		to6koo1.recieveShcolarship(3, 400);
		
		StudentGroup students = new StudentGroup("KSI");
	
		
		
		students.addStudent(to6koo);
		students.addStudent(to6koo1);
		students.printStudentsInGroup();
		students.beststudent();
		
		
		
		
		
		
		

	}

}
