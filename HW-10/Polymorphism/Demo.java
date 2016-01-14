
public class Demo {

	public static void main(String[] args) {

		Page text = new Page("To6kooo's life");
		text.addText("To6koo e mnogo div pich");
		System.out.println(text.getText());
		text.deleteText();
		System.out.println(text.getText());
		text.printPage();
		SimpleNotepad notepad = new SimpleNotepad(10);
		notepad.printAllPages();
		SecuredNotepad secured = new SecuredNotepad(10, "to6koo");
		secured.addTextToPage("totoot", 1);
		secured.printAllPages();
		ElectronicSecuredNotepad device = new ElectronicSecuredNotepad(10, "to6koo");
		device.addTextToPage("totototo", 10);
		device.start();
		device.addTextToPage("totototo", 10);
		device.printAllPages();
	}

}
