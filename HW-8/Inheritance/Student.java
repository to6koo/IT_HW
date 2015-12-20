
public class Student extends Person {

	private double score;

	public Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		this.setScore(score);
	}
	


	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	/*
	 * ����� showStudentInfo() ����� ������� ���������� �� ������ � ����������
	 * �� �������� �� (���� ������� �� ������)
	 */
	
	void showStudentInfo(){
		showPersonInfo();
		System.out.println("The score of the Student is: "+getScore());
	}

}
