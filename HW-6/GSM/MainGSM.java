package homeworkGSM;

public class MainGSM {

	public static void main(String[] args) {
		GSM samsung = new GSM();
		samsung.simMobileNumber = "0876795049";
		samsung.insertSimCard(samsung.simMobileNumber);
		System.out.println(samsung.hasSimCard);
		System.out.println(samsung.simMobileNumber);
		
		GSM lg = new GSM();
		lg.simMobileNumber = "087649504";
		lg.insertSimCard(lg.simMobileNumber);
		System.out.println(lg.hasSimCard);
		System.out.println(lg.simMobileNumber);
		
		
		
		
	}

}
