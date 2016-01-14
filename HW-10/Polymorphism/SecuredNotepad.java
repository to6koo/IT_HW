import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {

	private String password;
	private String enteredPassword;

	public SecuredNotepad(int numberOfpages, String password) {
		super(numberOfpages);
		this.setPassword(password);
	}

	private String inputPassword() {
		System.out.print("Enter password: ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println();
		setEnteredPassword(input.nextLine());

		return getEteredPassword();
	}

	protected boolean checkPassword() {
		String pass = inputPassword();

		if (pass.equals(getPassword())) {
			return false;
		}
		return true;
	}

	@Override
	public void addTextToPage(String text, int pageNumber) {
		if (checkPassword()) {
			System.out.println("Incorrect password.");
			return;
		}

		if (chekValidationOfPage(pageNumber)) {
			super.addTextToPage(text, pageNumber);
		}

	}

	@Override
	public void replaceTextOfPage(String text, int pageNumber) {
		if (checkPassword()) {
			System.out.println("Incorrect password.");
			return;

		}
		if (chekValidationOfPage(pageNumber)) {
			super.replaceTextOfPage(text, pageNumber);
		}

	}

	@Override
	public void removeTextFromPage(int pageNumber) {
		if (checkPassword()) {
			System.out.println("Incorrect password.");
			return;
		}
		
		if (chekValidationOfPage(pageNumber)) {
			super.removeTextFromPage(pageNumber);;

		}

	}

	@Override
	public void printAllPages() {
		if (checkPassword()) {
			System.out.println("Incorrect password.");
			return;

		}
		for (int i = 0; i < page.length; i++) {
			if (page[i] != null) {
				this.page[i].printPage();
				System.out.println();
				System.out.printf("Page number: %s\n", i + 1);

			}
		}

	}

	// setter and getters
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEteredPassword() {
		return enteredPassword;
	}

	public void setEnteredPassword(String enteredPassword) {
		this.enteredPassword = enteredPassword;
	}

}
