
public class ElectronicSecuredNotepad extends SecuredNotepad implements IÅlectronicDevice {

	private boolean started=false;

	public ElectronicSecuredNotepad(int numberOfpages, String password) {
		super(numberOfpages, password);

	}

	@Override
	public void start() {
		System.out.println("The device is turned ON!");
		setStarted(true);

	}

	@Override
	public void stop() {
		System.out.println("The device is turned OFF!");
		setStarted(false);
	}

	@Override
	public boolean isStarted() {
		return getStarted();
	}
	
	@Override
	public boolean searchWord(String word) {
		
		if (isStarted()==true) {
			return super.searchWord(word);
		}
		System.out.println("The device is not activated!");
		return false;
	}
	
	@Override
	public void printAllPagesWithDigits() {
		if (isStarted()==true) {
			super.printAllPagesWithDigits();
			return;
		}
		System.out.println("The device is not activated!");
	}
	
	@Override
	public void addTextToPage(String text, int pageNumber) {
		if (isStarted()==true) {		
			super.addTextToPage(text, pageNumber);
			return;
		}
		System.out.println("The device is not activated!");	
	}

	@Override
	public void replaceTextOfPage(String text, int pageNumber) {
		if (isStarted()==true) {		
			super.replaceTextOfPage(text, pageNumber);
			return;
		}
		System.out.println("The device is not activated!");	
	}

	@Override
	public void removeTextFromPage(int pageNumber) {
		if (isStarted()==true) {		
			super.removeTextFromPage(pageNumber);
			return;
		}
		System.out.println("The device is not activated!");	
	}

	@Override
	public void printAllPages() {
		if (isStarted()==true) {
		super.printAllPages();
		return;
		}
		System.out.println("The device is not activated!");	
	}

	private boolean getStarted() {
		return this.started;
	}

	private void setStarted(boolean started) {
		this.started = started;
	}

}
