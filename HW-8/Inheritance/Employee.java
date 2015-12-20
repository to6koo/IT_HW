
/*Класът Employee да наследява Person и да дефинира:
Полета:
daySalary показва дневната заплата на работника*/

public class Employee extends Person {
	public static final double overtime = 1.5;
	private double daySalary;

	public Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		setDaySalary(daySalary);
	}

	/*
	 * В случай че на работник се наложи да работи извън работно време, на него
	 * му се дължи допълнителна сума пари (overtime) за часовете които е
	 * работил. Сумата се пресмята по следния начин: ако работника, няма
	 * навършени 18 години, дължимата сума е 0. В противен случай, за всеки
	 * отработен час, на работника се заплаща сумата която получава на час
	 * (зависи от дневната заплата) умножена по 1,5. метод
	 * calculateOvertime(double hours) който пресмята и връща стойността на
	 * сумата която му се дължи при работа извън работно време метод
	 * showEmployeeInfo(), който показва информация за човека, както и
	 * информация за дневната му заплата
	 */

	public double calculateOvertime(double hours) {
		if (super.getAge() >= 18) {
			double overtimePay = hours * (this.getDaySalary() / 8 * overtime);
			return overtimePay;
		}

		return 0;
	}

	void showEmployeeInfo() {
		showPersonInfo();
		System.out.println("The day Salary is: " + getDaySalary());
	}

	public double getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(double daySalary) {
		this.daySalary = daySalary;
	}

}
