
public class SimpleNotepad implements INotepad {

	protected Page[] page;

	public int getPagesCount() {
		return page.length;
	}

	public SimpleNotepad(int numberOfpages) {
		if (numberOfpages > 0) {
			this.page = new Page[numberOfpages];
			for (int i = 0; i < numberOfpages; i++) {
				page[i] = new Page("Page");
			}
		} else {
			System.out.println("Invalid number of pages");
		}
	}

	@Override
	public void addTextToPage(String text, int pageNumber) {
		if (chekValidationOfPage(pageNumber)) {
			page[pageNumber - 1].addText(text);
		}

	}

	@Override
	public void replaceTextOfPage(String text, int pageNumber) {
		if (chekValidationOfPage(pageNumber)) {
			page[pageNumber - 1].deleteText();
			page[pageNumber - 1].addText(text);
		}

	}

	@Override
	public void removeTextFromPage(int pageNumber) {
		if (chekValidationOfPage(pageNumber)) {
			page[pageNumber - 1].deleteText();

		}

	}

	@Override
	public void printAllPages() {
		for (int i = 0; i < page.length; i++) {
			if (page[i] != null) {
				this.page[i].printPage();
				System.out.println();
				System.out.printf("Page number: %s\n", i + 1);

			}
		}

	}

	public boolean chekValidationOfPage(int pageNumber) {
		if (pageNumber > 0 || pageNumber > page.length) {
			return true;
		}
		System.out.println("Invalid page number.");
		return false;
	}

	@Override
	public boolean searchWord(String word) {
		for (int i = 0; i < page.length; i++) {
			if (page[i] != null && page[i].searchWord(word)) {
				return true;
			}
		}
		return false;
		
	}

	@Override
	public void printAllPagesWithDigits() {
		for (int i = 0; i < page.length; i++) {
			if(page[i] != null && page[i].contaisDigit()) {
				page[i].printPage();
			}
		}
		
	}

}
