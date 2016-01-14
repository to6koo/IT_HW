public class Page {

	private String title;
	private String text;

	public Page(String title1) {
		this.title = title1;
		this.text = null;
	}

	public void addText(String latter) {
		setText(latter);
		// System.out.println(this.text);
	}

	public void deleteText() {
		this.text = "";
	}

	public void printPage() {
		System.out.println();
		System.out.println(getTitle());
		System.out.println();

		System.out.println(getText());
	}
	
	boolean searchWord(String word) {
		return getText().contains(word);
	}
	
	public boolean contaisDigit() {
		for (int i = 0; i < text.length(); i++) {
			if (Character.isDigit(text.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
